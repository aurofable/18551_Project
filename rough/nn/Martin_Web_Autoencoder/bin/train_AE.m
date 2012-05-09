function [Wb, RBM_error, BP_error] = train_AE ( train_data, test_data, ...
    n, num_iter, batch_size, err_type, epsilon, rand_seed );
% function [Wb, RBM_error, BP_error] = train_AE ( train_data, test_data, ...
%     n, num_iter, batch_size, err_type, epsilon, rand_seed );
% This function trains and autoencoder by pretraining RBMs then
% fine-tuning with back propagation of errors.  This method is
% described in (Hinton & Salakhutdinov, 2006).
%
% INPUTS: train_data, test_data -- training and test data,
%                                  with points as columns.
%         n -- vector containing all layers of autoencoder (including
%              input dimension).
%         num_iter -- a vector with first entry = number of iterations
%                     for RBM pre-training and second entry =
%                     number of iterations for back propagation.
%         batch_size -- (optional) a vector with two entries containing batch
%                       sizes for RBM and back propagation training.
%         err_type -- (optional) specifies error type to optimize,
%                     cross entropy is 1 (default), reconstruction is 2.
%         epsilon -- (optional) a class containing learning parameters for each
%                    level of training, where each member of the class
%                    is a struct of the form taken by train_RBM.m
%         rand_seed -- (optional) a rand seed for RBM training.
%
% OUTPUTS: Wb -- the weights and biases of the autoencoder, as described
%                in readme.txt.
%          RBM_error -- a matrix containing in each row the training
%                       error per iteration for the RBMs
%          BP_error -- a matrix containing the training and test error
%                      per iteration.
%
% S. Martin
% 4/5/2007

% Version 1.000
%
% Code provided by Ruslan Salakhutdinov and Geoff Hinton  
%
% Permission is granted for anyone to copy, use, modify, or distribute this
% program and accompanying programs and documents for any purpose, provided
% this copyright notice is retained and prominently displayed, along with
% a note saying that the original programs are available from our 
% web page. 
% The programs and documents are distributed without any warranty, express or
% implied.  As the programs were written for research purposes only, they have
% not been tested to the degree that would be advisable in any important
% application.  All use of these programs is entirely at the user's own risk.

% this is the desired batch size if not specified
DES_BATCH_SIZE = 1000;

% check for optional arguments
num_layers = length(n);

% rand seed defaults to 0
if nargin < 8
    fprintf('Random seed defaulting to 0.\n');
    rand_seed = 0;
end

% choose epsilon values
if nargin < 7
    fprintf('Defaulting to standard epsilon values.\n');
    logistic.conv = [.1*ones(1,3),.0002];
    logistic.momentum = [.5 .9];
    linear.conv = [.001*ones(1,3),.0002];
    linear.momentum = [.5 .9];
    for i = 1:(num_layers-2)
        epsilon{i} = logistic;
    end
    epsilon{num_layers-1} = linear;
end

% default error type
if nargin < 6
    fprintf('Defaulting to cross entropy error.\n');
    err_type = 1;
end

% choose batch_size
if nargin < 5
    
    % training set
    N = size(train_data,2);
    f = factor(N);
    rev_f = f(length(f):-1:1);
    bs_ind = min(find(cumprod(rev_f)>=DES_BATCH_SIZE));
    if ~isempty(bs_ind)
        num_cases = prod(rev_f(1:bs_ind));
    else
        num_cases = N;
    end
    batch_size = [num_cases, num_cases];

end
    
fprintf('Using batch sizes of %d for RBM training and %d for fine-tuning.\n',...
    batch_size(1),batch_size(2));

% echo user input
fprintf('Training %d',n(1));
for i = 2:length(n)
    fprintf('-%d',n(i));
end
fprintf(' autoencoder using %d examples.\n',size(train_data,2));
fprintf('There will be %d RBM pretraining iterations and %d back propagation iterations.\n',...
    num_iter(1),num_iter(2));

% check for range of data
min_train = min(min(train_data));
max_train = max(max(train_data));
if ( (min_train < 0) | (max_train > 1) )
    error ('data needs to be scaled between 0 and 1!');
end

% do pretraining with RBMs
lin_flag = [zeros(1,length(n)-2),1];
RBM_data = train_data;
for i = 1:(length(n)-1)
    fprintf('Pretraining layer %d with RBM: %d-%d \n',i,n(i),n(i+1));
    [RBM_data, W{i}, b{i}, c{i}, RBM_train_error] = ...
        train_RBM ( RBM_data, n(i+1), lin_flag(i), num_iter(1), ...
                    epsilon{i}, batch_size(1), rand_seed );
    RBM_error(i,:) = RBM_train_error;
end

% translate weights and biases to autoencoder format
num_maps = length(n)-1;
for i = 1:num_maps
    Wb_mat{i} = reshape([W{i}, c{i}], n(i+1)*(n(i)+1), 1);
end
for i = num_maps:-1:1
    Wb_mat{2*num_maps-i+1} = reshape([W{i}', b{i}], n(i)*(n(i+1)+1), 1);
end
Wb = cat(1,Wb_mat{:});

% now do back propagation
[Wb, BP_train_error, BP_test_error] = back_prop (train_data, test_data, ...
    Wb, n, num_iter(2), batch_size(2), err_type );
BP_error(1,:) = BP_train_error;
BP_error(2,:) = BP_test_error;