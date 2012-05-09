% Spring 2012, 18-551 Project
% Training Script - libsvm

clear all;
load FntData;

labels = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ';
numTrainingSamplesPerChar = 700;

% Preprocessing data
minNumTrainingSamplesPerChar = 0;
if (numTrainingSamplesPerChar < minNumTrainingSamplesPerChar)
    numTrainingSamplesPerChar = minNumTrainingSamplesPerChar;
end

% Normalizing Features
minimums = min(featDataTrain, [], 1);
ranges = max(featDataTrain, [], 1) - minimums;
featDataTrain = (featDataTrain - repmat(minimums, size(featDataTrain, 1), 1)) ./ repmat(ranges, size(featDataTrain, 1), 1);
featDataTrain = 2.*featDataTrain - 1;

featDataTrain = featDataTrain';
featDataTrainSparse = sparse(featDataTrain);

% Generating labels
trainingLabels = ones(lengthSparse, 1);
for i = 1:m
    trainingLabels((i-1)*numTrainingSamplesPerChar+1:i*numTrainingSamplesPerChar) = i*ones(numTrainingSamplesPerChar, 1);
end

%Putting the Attribute Data into the libsvm format
libsvmwrite('svmFormat.train', trainingLabels, featDataTrainSparse);
[labels instance] = libsvmread('svmFormat.train');

% Code to find params
bestcv = 0;
for log2c = -1.1:3.3,
  for log2g = -4.1:1.1,
    cmd = ['-t 0 -v 2 -c ', num2str(2^log2c), ' -g ', num2str(2^log2g)];
    cv = svmtrain(labels, instance, cmd);
    if (cv >= bestcv),
      bestcv = cv; bestc = 2^log2c; bestg = 2^log2g;
    end
  end
end


% Training SVM
cmd = ['-t 0 -c ', num2str(bestc), ' -g ', num2str(bestg)];
model = svmtrain(labels, instance, cmd);
clearvars -except model labels instance trainingLabels trainingData nVecs varCap reducFact cummulVar meanTraining stdev minimums ranges;
save svmTrainLibSVM.mat;
