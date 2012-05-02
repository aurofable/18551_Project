function [rawimages, rawlabels] = read_mnist ( images, labels );
% function [images, labels] = read_mnist ( images, labels );
% This function converts images in the format used at
% http://yann.lecun.com/exdb/mnist/ into matlab matrices.
% Images are sorted by label normalized so pixels are between 0 and 1.
%
% INPUTS: image_file -- images file name, e.g. train-images-idx3-ubyte
%         label_file -- labels file name, e.g. train-labels-idx1-ubtye
%
% OUTPUTS: images -- matrix of size 784 by N, where N is number of
%                       images and labels
%          labels -- vector with N components
%
% S. Martin
% 11/27/2006

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

% This program reads raw MNIST files available at 
% http://yann.lecun.com/exdb/mnist/ 
% and converts them to files in matlab format 
% Before using this program you first need to download files:
% train-images-idx3-ubyte.gz train-labels-idx1-ubyte.gz 
% t10k-images-idx3-ubyte.gz t10k-labels-idx1-ubyte.gz
% and gunzip them. You need to allocate some space for this.  

% This program was originally written by Yee Whye Teh 

f = fopen(images,'r');
[a,count] = fread(f,4,'int32');
  
g = fopen(labels,'r');
[l,count] = fread(g,2,'int32');

fprintf('Converting MNIST files:\n%s\n%s\n',images,labels);
  
rawimages = sparse(fread(f,'uchar'));
[rawlabels,count] = fread(g,'uchar');
rawimages = reshape(rawimages,28*28,count)';

fprintf('Read %d images.\n',count);

% sort & normalize
[y,i] = sort(rawlabels);
rawlabels = y;
rawimages = rawimages(i,:)'/255;