function [net train_err train_mcr test_err test_mcr] = ...
                train_LM(net, train_inp, train_out, test_inp, test_out, show_it, ...
                        use_LeCun_eta, max_subsamples, recom_Hes_it, ...
                        n_iterations, noise)
% function [NET TRAIN_ERR TRAIN_MCR TEST_ERR TEST_MCR] =  ...
%                   TRAIN_LM(NET, TRAIN_INP, TRAIN_OUT, TEST_INP, TEST_OUT, SHOW_IT, ...
%                   USE_LECUN_ETA, MAX_SUBSAMPLES, RECOM_HES_IT, N_ITERATIONS, NOISE)
%
% trains network NET using stochastic version of the Levenberg-Marquardt
% algorithm [1].
%
% INPUT:
%   NET             - myCNN object
%   TRAIN_INP       - input for training
%   TRAIN_OUT       - output for training
%   TEST_INP        - input for testing
%   TEST_OUT        - output for testing
%   SHOW_IT         - number of iteration before updating the performance
%                     plots (inf means never even show) [inf]
%   USE_LECUN_ETA   - boolean flag of whether use eta sequence, proposed by
%                     LeCun (0.0005, 0.0005, 0.0002, ...) or not [true]
%   MAX_SUBSAMPLES  - maximal number of samples used for Hessian
%                     (re)estimation [100]
%   RECOM_HES_IT    - number of iteration after which the Hessian has to be
%                     reestimated [16]
%   N_ITERATIONS    - maximal number of iterations for training [50]
%   NOISE           - a scale factor of Gaussian noise added to each sample
%                     during the training [0]
%
% OUTPUT:
%   NET             - trained version of NET
%   TRAIN_ERR       - RMSE (root mean squared error) on train data
%   TRAIN_MCR       - MCR  (misclassification rate) on train data
%   TEST_ERR        - RMSE on test data
%   TEST_MCR        - MCR on test data
%
% REFERENCES:
%   1.  Y.LeCun, L.Bottou, Y.Bengio and P.Haffner: Gradient-Based Learning
%       Applied to Document Recognition, Proceedings of the IEEE,
%       86(11):2278-2324, November 1998.
%
% TRAIN_LM is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-23

    % processing function input
    if ~exist('show_it',  'var') || isempty(show_it),                      show_it = inf; end
    if ~exist('use_LeCun_eta',  'var') || isempty(use_LeCun_eta),    use_LeCun_eta = true; end
    if ~exist('n_iterations',   'var') || isempty(n_iterations),      n_iterations = 50;   end
    if ~exist('max_subsamples', 'var') || isempty(max_subsamples),  max_subsamples = 100;  end
    if ~exist('recom_Hes_it',   'var') || isempty(recom_Hes_it),      recom_Hes_it = 16;   end
    if ~exist('noise', 'var')          || isempty(noise),                    noise = 0;    end

    if exist('test_inp',  'var') && exist('test_out',  'var'),
        test_mcr = [];
        test_err = [];
    end

    show_performance_plots = isfinite(show_it) && show_it>0;

    if use_LeCun_eta,
        eta_from_LeCun  = [50 50 20 20 20 10 10 10 5 5 5 5 1]/100000;
    else
%         if ~exist('eta_max', 'var') || isempty(eta_max),            eta_max = .0002;        end
%         if ~exist('eta_min', 'var') || isempty(eta_min),            eta_min = .00001;       end
%         if ~exist('eta_fading', 'var') || isempty(eta_fading),      eta_fading = .8;        end
        eta_max = .0002;
        eta_min = .00001;
        eta_fading = .8;
    end

    [in_rows in_cols n_train_samples] = size(train_inp);
    n_subsamples = min(min(max(ceil(n_train_samples*1.0), 20), max_subsamples), n_train_samples);

    %  Normalizing train_inp:
    for i = 1:n_train_samples,
        sample = train_inp(:,:,i);
        sample = sample - mean(sample(:));
        sample = sample / std(sample(:));
        train_inp(:,:,i) = sample;
    end

    if use_LeCun_eta,
        eta = eta_from_LeCun(1);
    else
        eta = eta_max;
    end

    if show_performance_plots,
        perf_fig = figure('Name', ['SDHLM training of myCNN (@' host ')'], 'NumberTitle', 'off');
    end


    % initial evaluation
    [train_err perf out train_mcr] = get_performance(net, train_inp, train_out);
    log_it('Network initial performance on train data: RMSE:%-10.7f    MCR:%-5.2f%% ', train_err, 100*train_mcr);

    if exist('test_err', 'var')
        [test_err perf out test_mcr] = get_performance(net, test_inp, test_out);
        log_it('Network initial performance on test data:  RMSE:%-10.7f    MCR:%-5.2f%% ', test_err, 100*test_mcr);
    end

    etas = nan;

    net = forget_derivatives(net);     % Clear first derivatives data of the net
    start_index = 1;
    for i = 1:n_iterations,
        recompute_Hessian = (recom_Hes_it == 1) || (mod(i, recom_Hes_it) == 1);
        net = set_global_learning_rate(net, eta);

        if recompute_Hessian,
            fprintf('Hessian diagonal: [reestimation:      ')

            net = forget_ddeltas(net);

            % Get indeces of the new subset for the Hessian diagonal reestimation
            end_index = min(n_train_samples, start_index+n_subsamples-1);
            sub_i = start_index:end_index;
            if end_index-start_index+1 < n_subsamples,
                end_index = n_subsamples - (end_index-start_index+1);
                start_index = 1;
                sub_i = [sub_i start_index:end_index];
            end

            % Compute new start subset index (for next Hessian reestimation)
            start_index = end_index + 1;
            if start_index > n_train_samples, start_index = 1; end

            for s = 1:n_subsamples,
                fprintf('\b\b\b\b\b\b%5.1f%%', 100*(s-1)/n_subsamples)
                subsample_i = sub_i(s);
                sample = train_inp(:,:,subsample_i);
                target = train_out(:,subsample_i); % target = mat2cell(train_out(:,subsample_i), ones(1,n_classes), 1);
                net = propagate(net, sample);
                net = forget_derivatives(net);          % Clear first derivatives data of the net
                net = backpropagate(net, target);
                net = forget_second_derivatives(net);   % Clear second derivatives data of the net
                net = backbackpropagate(net);
                net = accumulate_ddeltas(net);
                fprintf('\b\b\b\b\b\b%5.1f%%', 100*s/n_subsamples)
            end % of subsample loop
            fprintf(' done] ')

            fprintf('[averaging:')
            net = average_ddeltas(net, n_subsamples);     % average second derivatives data of the net
            fprintf('done] ')

            fprintf('[learning rates reestimation:')
            net = compute_learning_rates(net);
            fprintf('done]\n')
        end % of recompute Hessian condition

        order_of_samples = randperm(n_train_samples);
        log_it('Iteration:%-4g eta:%-9.7f', i, eta);
        fprintf('                          [training:      ');
        net = forget_deltas(net);

        % Training
        for s_i = 1:n_train_samples,
            fprintf('\b\b\b\b\b\b%5.1f%%', 100*(s_i-1)/n_train_samples)
            s      = order_of_samples(s_i);
            sample = train_inp(:,:,s);
            target = train_out(:,s);
            sample = sample + randn(size(sample)) * noise;

            net = propagate(net, sample);
            net = forget_derivatives(net);     % Clear first derivatives data of the net
            net = backpropagate(net, target);
            net = adapt_deltas(net);
            net = adapt_net(net);
            fprintf('\b\b\b\b\b\b%5.1f%%', 100*s_i/n_train_samples)
        end
        fprintf(' done]\n')

        % evaluation
        if exist('train_err', 'var')
            [trRMSE perf out trMCR] = get_performance(net, train_inp, train_out);
%              fprintf('Train RMSE: %-10.7f MCR:%-6.2f%% ', trRMSE, 100*trMCR);
            log_it('Network performance on iteration %-03g on train data: RMSE:%-10.7f    MCR:%-5.2f%% ', i, trRMSE, 100*trMCR);
            train_err = [train_err trRMSE];
            train_mcr = [train_mcr trMCR]; %#ok<*AGROW>
        end

        if exist('test_err', 'var')
            [teRMSE perf out teMCR] = get_performance(net, test_inp, test_out);
            log_it('Network performance on iteration %-03g on test data:  RMSE:%-10.7f    MCR:%-5.2f%% ', i, teRMSE, 100*teMCR);
            test_err  = [test_err teRMSE];
            test_mcr  = [test_mcr teMCR];
        end

        if show_performance_plots && ( mod(i, show_it) == 0 || i==n_iterations ),
            figure(perf_fig)
            % root mean square error
            subplot(211);
            hold off
            semilogy(0:i, train_err, 'b--', 'LineWidth', 2)
            xlabel('iterations')
            if exist('test_err', 'var'),
                hold on
                semilogy(0:i, test_err, 'r:', 'LineWidth', 2)
                legend('train', 'test')
                title( sprintf('RMSE [train: %g, test: %g]', trRMSE, teRMSE) )
            else
                legend('train')
                title( sprintf('RMSE [train: %g]', trRMSE) )
            end

            % misclassification rate
            subplot(212);
            hold off
            plot(0:i, 100*train_mcr, 'b--', 'LineWidth', 2)
            xlabel('iterations')
            if exist('test_mcr', 'var'),
                hold on
                plot(0:i, 100*test_mcr, 'r:', 'LineWidth', 2)
                legend('train', 'test')
                title( sprintf('Misclassification rate [train: %g%%, test: %g%%]', 100*trMCR, 100*teMCR) )
            else
                legend('train')
                title( sprintf('Misclassification rate [train: %g%%]', 100*trMCR) )
            end
            drawnow
        end % show performance condition

        fprintf('\n');

        etas = [etas eta];

        % new global learning rate
        if use_LeCun_eta,
            if i<numel(eta_from_LeCun),
                eta = eta_from_LeCun(i+1);
            else
                eta = eta_from_LeCun(end);
            end
        else
            eta = eta_min + (eta_max - eta_min)*eta_fading^i;
        end % new eta value selection
    end % of iteration loop

end % of function TRAIN_LM