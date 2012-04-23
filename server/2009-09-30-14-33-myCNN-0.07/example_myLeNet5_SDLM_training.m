% A simple example showing how to create and train LeNet5 using myCNN
% object. The code is not well optimized, so the training might be pretty long :(
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-08

close all force
clear all force

classes_to_select       = '0123456789'; % character classes
train_samples_per_class = 10;           % how many samples per class should be used for training
test_samples_per_class  = 5;            % how many samples per class should be used for testing
inp_rows                = 32;           % number of rows in training images
inp_cols                = inp_rows;     % number of columns in training images
n_iterations            = 30;           % number of iterations of training algorithm
recom_Hes_it            = 15;           % recompute diagonal Hessian every recom_Hes_it iterations
show_perf_it            = 1;            % show performance plots every show_perf_it iterations [inf - don't show]
use_LeCun_eta           = true;         % use the eta sequence, proposed by LeCun
resize_samples          = false;        % resize or pad the input images flag
samples_coeff           = 1;            % rescaling coefficient for the input data
max_subsamples          = 500;          % maximal number of samples for Hessian estimation
max_samples             = 60000;        % maximal number of samples for training

n_classes               = numel(classes_to_select);
n_train_samples         = n_classes * train_samples_per_class;
n_subsamples            = min(min(max(ceil(n_train_samples*1.0), 20), max_subsamples), n_train_samples);

% set the path to MNIST dataset...
% the original MNIST dataset can be found on Yann LeCun's web-site: http://yann.lecun.com/exdb/mnist/index.html
% MNIST converted into Matlab format can be found on my web-page:
%   train dataset:  http://sites.google.com/site/chumerin/projects/mycnn/train_data.mat
%   test dataset:   http://sites.google.com/site/chumerin/projects/mycnn/test_data.mat
if ispc,
    mnist_dir = 'D:/data/datasets/MNIST/'; % Windows
else
    mnist_dir = '/data/data2_sidonia/nick/datasets/MNIST/'; % *nix
end

if ~exist(mnist_dir, 'dir'),
    error(['Can''t find the MNIST dataset directory [%s]! ' ...
        'This example needs the MNIST dataset, which can be downloaded from ' ...
        'http://yann.lecun.com/exdb/mnist/ or from ' ...
        'http://sites.google.com/site/chumerin/projects/mycnn/, ' ...
        'also don''t forget to update the mnist_dir variable in the source code.'], mnist_dir)
end

% read and preprocess data for training from MNIST dataset
disp('Loading train data from MNIST')
[train_samples train_targets] = get_MNIST_data([mnist_dir 'train_data.mat'], inp_rows, inp_cols, ...
            classes_to_select, train_samples_per_class, resize_samples, samples_coeff);

% read and preprocess data for testing from MNIST dataset
disp('Loading test data from MNIST')
[test_samples test_targets] = get_MNIST_data([mnist_dir 'test_data.mat'], inp_rows, inp_cols, ...
            classes_to_select, test_samples_per_class, resize_samples, samples_coeff);

% create a new LeNet5 network
myLeNet5 = newMyLeNet5(inp_rows, inp_cols, n_classes);

% show some crucial info
fprintf('Number of classes: %g\n', n_classes)
fprintf('Train samples:     %-6g (%gx%g)\n', train_samples_per_class*n_classes, n_classes, train_samples_per_class)
fprintf('Test samples:      %-6g (%gx%g)\n', test_samples_per_class*n_classes, n_classes, test_samples_per_class)
fprintf('Number of subsamples for diagonal Hessian estimation: %g\n', n_subsamples)

% train the network using stochastic version of the Levenberg-Marquardt
% algorithm

[myLeNet5 E MCR] = train_LM(myLeNet5, train_samples, train_targets,  test_samples, test_targets, show_perf_it, ...
                    use_LeCun_eta, max_subsamples, recom_Hes_it, n_iterations);