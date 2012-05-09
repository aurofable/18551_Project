function [rand_data, rand_labels] = randomize ( ...
    images, labels, rand_seed, trunc_N );
% function [rand_data, rand_labels] = randomize ( ...
%   data, labels, rand_seed, trunc_N );
% This function takes a random sample of the data for autoencoder
% training.
% 
% INPUTS: data -- D by N matrix as returned by read_mnist.m
%         labels -- corresponding labels 
%         rand_seed -- random seed to use (defaults to 0)
%         trunc_N -- keep only trunc_N points (default keep all)
%
% OUTPUT: rand_data -- new randomized truncated version of data
%         rand_labels -- corresponding labels
%
% S. Martin
% 3/23/2007

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

% random seed defaults to 0
if nargin < 3
    rand_seed = 0;
end

% trunc_N defaults to no truncation
totnum=size(images,2);
if nargin < 4
    trunc_N = totnum;
end

rand('state',rand_seed); %so we know the permutation of the training data
randomorder=randperm(totnum);

fprintf('Using %d examples.\n',trunc_N);
rand_data = images(:,randomorder(1:trunc_N));
rand_labels = labels(randomorder(1:trunc_N));

%%% Reset random seeds 
rand('state',sum(100*clock)); 
randn('state',sum(100*clock)); 