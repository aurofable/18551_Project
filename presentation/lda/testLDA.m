% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Script that for testing effectiveness of LDA for OCR

% Loading out test and training data
clear all
load segData.mat

% Variables
data = imgDataTrainSeg;
dataGray = imgDataTrainSegGray;
numSamplesPerChar = 20;
labelVec = 1:10;        % Numbers only
n = 10;                 % Num Features
m = length(labelVec);   % Num Classes
imageSize = [128 128];
nHarmonics = 64;
colDiv = 8;
rowDiv = 8;
reducFact = 0.125;
numFilters = 5;
dim = nHarmonics*4 + colDiv*rowDiv + imageSize(1)*imageSize(2)*reducFact*reducFact*numFilters; % Elliptical, Zoning, Gaussian, Log, Gabors

% Generating labels
trainingLabels = ones(numSamplesPerChar * m, 1);
for i = 1:m
    trainingLabels((i-1)*numSamplesPerChar+1:i*numSamplesPerChar) = labelVec(i)*ones(numSamplesPerChar, 1);
end

% Generating our dataset
[dataSet nVecs cummulVar] = dimRed(data, dataGray, labelVec, n, dim, numSamplesPerChar, m, reducFact, rowDiv, colDiv, nHarmonics);

% Normalizing Features
minimums = min(dataSet, [], 1);
ranges = max(dataSet, [], 1) - minimums;
dataSet = (dataSet - repmat(minimums, size(dataSet, 1), 1)) ./ repmat(ranges, size(dataSet, 1), 1);

% Plotting dataset
gscatter(dataSet(:,1), dataSet(:,2), trainingLabels, []);