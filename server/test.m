% Spring 2012, 18-551 Project
% Testing Script

clear all;
load svmTrainLibSVM.mat
load segData.mat
%load svmTrainLibSVM256.mat
%load svmT'rainLibSVM (2)'

% Testing
numTestSamples = 200;

% Preprocessing data
testLabels = ones(numTestSamples * m, 1);
for i = 1:m
    testLabels((i-1)*numTestSamples+1:i*numTestSamples) = i*ones(numTestSamples, 1);
end

% Creating the test data
testData = dimRedTest(imgDataTestSeg, imgDataTestSegGray, dim, numTestSamples, m, reducFact, nVecs, rowDiv, colDiv, nHarmonics);
testData = (testData - repmat(minimums, size(testData, 1), 1)) ./ repmat(ranges, size(testData, 1), 1);

% Running the Test
[predLabel accuracy decision_vals] = svmpredict(testLabels, testData, model);