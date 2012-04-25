% Spring 2012, 18-551 Project
% Testing Script

%clear all;
%load svmTrain.mat
load svmTrainLibSVM.mat
load FntData.mat
load rawData.mat
load segData.mat
load svmT'rainLibSVM (2)'

% Testing
numTestSamples = 20;
numNoisy = 0;

% Debugging vars
debug = [];

% Preprocessing data
testLabels = ones(numTestSamples * m, 1);
for i = 1:m
    testLabels((i-1)*numTestSamples+1:i*numTestSamples) = i*ones(numTestSamples, 1);
end

%imgDataRawTest imgDataRawTrain
testData = dimRedTest(imgDataTestSeg, numTestSamples, m, reducFact, nVecs, numNoisy, imgDataTestNoisy, rowDiv, colDiv);
%testData = (testData - repmat(min(testData,[],1),size(testData,1),1))*spdiags(1./(max(testData,[],1)-min(testData,[],1))',0,size(testData,2),size(testData,2));
%testData = (testData - repmat(meanTraining, size(testData, 1), 1))./repmat(stdev, size(testData, 1), 1);
testData = (testData - repmat(minimums, size(testData, 1), 1)) ./ repmat(ranges, size(testData, 1), 1);

% Running the Test
[predLabel accuracy decision_vals] = svmpredict(testLabels, testData, model);