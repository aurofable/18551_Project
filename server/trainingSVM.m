% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% Training Script - libsvm

clear all;
load segData;

labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'; % Actual label vector
numTrainingSamplesPerChar = 700;

% Implementing Zoning
n = 52; % Num Features
m = length(labels);  % Num Classes;
imageSize = [128 128];

% Feature vector variables
nHarmonics = 64;
colDiv = 8;
rowDiv = 8;
reducFact = 0.125;
numFilters = 5;
dim = nHarmonics*4 + colDiv*rowDiv + imageSize(1)*imageSize(2)*reducFact*reducFact*numFilters; % Elliptical, Zoning, Gaussian, Log, Gabors

% Generating labels
trainingLabels = ones(numTrainingSamplesPerChar * m, 1);
for i = 1:m
    trainingLabels((i-1)*numTrainingSamplesPerChar+1:i*numTrainingSamplesPerChar) = i*ones(numTrainingSamplesPerChar, 1);
end

% Generating Data and Reducing Dimensions
[trainingData nVecs cummulVar] = dimRed(imgDataTrainSeg, imgDataTrainSegGray, n, dim, numTrainingSamplesPerChar, m, reducFact, rowDiv, colDiv, nHarmonics);

% Normalizing Features
minimums = min(trainingData, [], 1);
ranges = max(trainingData, [], 1) - minimums;
trainingData = (trainingData - repmat(minimums, size(trainingData, 1), 1)) ./ repmat(ranges, size(trainingData, 1), 1);

% Code to find params
bestcv = 0;
for log2c = -1.1:3.3,
  for log2g = -4.1:1.1,
    cmd = ['-t 0 -v 2 -c ', num2str(2^log2c), ' -g ', num2str(2^log2g)];
    cv = svmtrain(trainingLabels, trainingData, cmd);
    if (cv >= bestcv),
      bestcv = cv; bestc = 2^log2c; bestg = 2^log2g;
    end
    %fprintf('%g %g %g (best c=%g, g=%g, rate=%g)\n', log2c, log2g, cv, bestc, bestg, bestcv);
  end
end


% Training SVM
cmd = ['-t 0 -c ', num2str(bestc), ' -g ', num2str(bestg)];
model = svmtrain(trainingLabels, trainingData, cmd);
clearvars -except model labels dim m n rowDiv colDiv trainingLabels trainingData nVecs reducFact cummulVar nHarmonics minimums ranges;
save svmTrainLibSVM.mat;
