function [Xtrain Xtest] = createBarsDataSet(dim, numTrain, numTest, nonlinear)
%CREATEBARSDATASET create a set of square images stored row-wise in a matrix
%   [Xtrain Xtest] = createBarsDataSet(dim, numTrain, numTest, nonlinear)
%   dim - image width = height = dim
%   numTrain - number of training images
%   numTest - number of test images
%   nonlinear - if this flag is true/1, pixel intensities at crossing points of bars are not added up

if nargin < 2
    dim = 10;
end

if nargin < 3
    numTrain = 10000;
end

if nargin < 4
    numTest = 5000;
end

if nargin < 5
    nonlinear = 1;
end

imgdim = dim * dim;
X = zeros(numTrain+numTest, imgdim);

for k=1:numTrain+numTest
    x = zeros(dim, dim);
    for z=1:2
        i = randperm(dim);
        j = randperm(dim);
        if nonlinear == 1
            x(i(z),:) = 1.0;
            x(:,j(z)) = 1.0;
        else
            x(i(z),:) = x(i(z),:) + 1.0;
            x(:,j(z)) = x(:,j(z)) + 1.0;
        end
    end
    if ~nonlinear
        x = x ./ 4;
    end
    X(k,:) = reshape(x, 1, imgdim);
end

Xtrain = X(1:numTrain, :);
Xtest = X(numTrain+1:end, :);

