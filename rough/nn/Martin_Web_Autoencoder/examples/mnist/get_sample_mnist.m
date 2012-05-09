function [train_images, train_labels, test_images, test_labels] = ...
    get_sample_mnist ( num_train, num_test, rand_seed );
% function [train_images, train_labels, test_images, test_labels] = ...
%    get_sample_mnist ( num_train, num_test, rand_seed );
% This function reads the mnist files and takes a smaller random
% subset for testing purposes.
%
% INPUTS: num_train, num_test -- the number of samples to take
%         rand_seed -- the random seed for taking samples
%                      (integer defaults to 0)
%
% OUTPUTS: train_images, test_images -- matrices of size N by 784,
%                      where N is number of images
%          train_labels, test_labels -- vector with labels (0-9)
%
% S. Martin
% 3/23/2007
%
% NOTE: The mnist data is assumed to be contained in the following
%       files:
%           train-images-idx3-ubyte
%           train-labels-idx1-ubyte
%           t10k-images-idx3-ubyte
%           t10k-labels-idx1-ubyte

if nargin < 3
    rand_seed = 0;
    fprintf('Random seed defaulted to 0.\n');
end

% read training data
fprintf('Converting raw training files into Matlab format.\n');
[train_images,train_labels] = read_mnist ('train-images-idx3-ubyte',...
    'train-labels-idx1-ubyte');

[train_images,train_labels]  = ...
    randomize ( train_images, train_labels, rand_seed, num_train );
fprintf('Sampled %d training images.\n', num_train);

% read test data
fprintf('Converting raw test files into Matlab format.\n');
[test_images_data,test_labels_data] = read_mnist ('t10k-images-idx3-ubyte',...
    't10k-labels-idx1-ubyte');
[test_images, test_labels] = ...
    randomize ( test_images_data, test_labels_data, rand_seed, num_test );

