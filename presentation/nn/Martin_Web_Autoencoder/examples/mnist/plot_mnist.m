function plot_mnist ( train_data, train_labels, test_data, test_labels, ...
    Wb, n, RBM_error, BP_error )
% function plot_mnist ( train_data, train_labels, test_data, test_labels, ...
%     Wb, n, RBM_error, BP_error )
% This function displays the results of the autoencoder on the MNIST
% data, assuming an encoder with final dimension 2.  The results are
% displayed using two dimensional plots and plots of reconstruction error
% at the different phases of the algorithm.
%
% INPUTS: train_data, test_data -- input data with points as columns.
%         train_labals, test_labels -- labels of corresponding data.
%         Wb, n -- autoencoder weights, biases, and dimensions.
%         RBM_error, BP_error -- error matrices as returned by train_AE.m.
%
% OUTPUTS: Error plots are shown in figures 1 & 2, visualizations are
%          shown in figures 3 & 4.
%
% S. Martin
% 4/6/2007

% this is the desired batch size
DES_BATCH_SIZE = 1000;

% RBM error plot is in figure 1
figure(1)
clf
plot(RBM_error');
for i = 1:(length(n)-1)
    RBM_leg{i} = ['RBM ',num2str(n(i)),'-',num2str(n(i+1))];
end
legend (RBM_leg);
title('Reconstruction Error for RBM pre-training');
xlabel('Iteration');
ylabel('Mean Squared Error');

% BP error plot is in figure 2
figure(2)
clf
plot(BP_error');
legend('Training','Testing');
title('Reconstruction Error for fine-tuning');
xlabel('Iteration');
ylabel('Mean Squared Error');

% training representation shown in figure 3

% first compute batch size
N = size(train_data,2);
f = factor(N);
rev_f = f(length(f):-1:1);
bs_ind = min(find(cumprod(rev_f)>=DES_BATCH_SIZE));
if ~isempty(bs_ind)
    batch_size = prod(rev_f(1:bs_ind));
else
    batch_size = N;
end

% next do forward map for training set
fprintf('Computing forward map on training set ...\n');
Y = AE_forward ( train_data, Wb, n, batch_size );
if size(Y,1) ~= 2
    error ('Low dimensional representation is not 2D!');
end

% now plot two dimensional representation with colors
figure(3)
clf
% pick colors to match science article
digit_cols = {'mo','go','m+','r+','ro','k+','g+','ko','bo','b+'};
for i = 1:10
    plot(Y(1,find(train_labels==(i-1))),...
        Y(2,find(train_labels==(i-1))),digit_cols{i});
    hold on
end
hold off
legend('0','1','2','3','4','5','6','7','8','9');
title('Training set representation');

% last in figure 4 show test set representation

% again compute batch size
N = size(test_data,2);
f = factor(N);
rev_f = f(length(f):-1:1);
bs_ind = min(find(cumprod(rev_f)>=DES_BATCH_SIZE));
if ~isempty(bs_ind)
    batch_size = prod(rev_f(1:bs_ind));
else
    batch_size = N;
end

% do forward map on test set
fprintf('Computing forward map on test set ...\n');
Y = AE_forward ( test_data, Wb, n, batch_size );
if size(Y,1) ~= 2
    error ('Low dimensional representation is not 2D!');
end

% now plot in figure 4
figure(4)
clf
for i = 1:10
    plot(Y(1,find(test_labels==(i-1))),...
        Y(2,find(test_labels==(i-1))),digit_cols{i});
    hold on
end
hold off
legend('0','1','2','3','4','5','6','7','8','9');
title('Test set representation');