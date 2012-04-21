% Spring 2012, 18-551 Project
% Testing Script

%clear all;
%load svmTrain.mat
%load svmTrainLibSVM.mat
%load FntData.mat
load rawData.mat

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

% Generating Testing Data
% dataIndex = 0;
% testData = ones(numTestSamples * m, n);
% for i = 1:m
%     char = imgDataTest{i};
%     for j = 1:numTestSamples
%         dataIndex = dataIndex + 1;
%         img = char{j};
%         featureVec = getSkeletonZoneFeature(img, rowDiv, colDiv);
%         testData(dataIndex, :) = featureVec;
%     end
% end 

%imgDataRawTest imgDataRawTrain
testData = dimRedTest(imgDataRawTest, numTestSamples, m, reducFact, nVecs, numNoisy, imgDataTestNoisy, rowDiv, colDiv);
testData = (testData - repmat(min(testData,[],1),size(testData,1),1))*spdiags(1./(max(testData,[],1)-min(testData,[],1))',0,size(testData,2),size(testData,2));

% Running the Test
[predLabel accuracy decision_vals] = svmpredict(testLabels, testData, model);

%correct = length(find(predLabel - testLabels == 0))/length(testLabels);
% for i = 1:length(labels)
%     testSet = imgDataTest{i};
%    for j = 1:numTestSamples
%       sample = testSet{j};
%       
%       answer = model
%       %answer = capstoneClassify(sample, svmMatrix, labels);
%       %answer = labels(answer);
%       if (answer == i - 1)
%           numCorrect = numCorrect + 1;
%       else
%           ref = imgDataTrain{answer + 1};
%           debugRow = [sample ref{1}];
%           debug = [debug; debugRow];
%       end
%    end
% end

% percentage = numCorrect / (numTestSamples * length(labels));
% imshow(debug);