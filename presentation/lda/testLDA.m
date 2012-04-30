% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Script that for testing effectiveness of LDA for OCR

% Loading out test and training data
clear all
load segData.mat

% Variables
data = imgDataTrainSeg;
dataGray = imgDataTrainSegGray;
numSamplesPerChar = 10;
labelVec = 1:10;        % Numbers only
n = 17;                 % Num Features
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
% figure
% gscatter(dataSet(:,1), dataSet(:,2), trainingLabels, []);
% title('Plot of Normalized, First 2 features in a 10 class Training Dataset');
% xlabel('1st Feature');
% ylabel('2nd Feature');

% Generating our testDataSet
testDataSet = dimRedTest(imgDataTestSeg, imgDataTestSegGray, labelVec, dim, numSamplesPerChar, m, reducFact, nVecs, rowDiv, colDiv, nHarmonics);

save temp.mat

% % Testing Capstone LDA
% ldaClass = classify(testDataSet, dataSet, trainingLabels);
% bad = ~strcmp(ldaClass,trainingLabels);
% ldaResubErr = sum(bad) / (n*numSamplesPerChar); % 0.0050
% 
% [ldaResubCM,grpOrder] = confusionmat(trainingLabels,ldaClass);
% 
% % Error Plot
% figure
% gscatter(dataSet(:,1), dataSet(:,2), trainingLabels, []);
% hold on;
% plot(dataSet(bad,1), dataSet(bad,2), 'o');
% hold off;
% 
% % Plotting function lines
% [x,y] = meshgrid(0:.01:1,0:.01:1);
% x = x(:);
% y = y(:);
% j = classify([x y],dataSet(:,1:2),trainingLabels);
% gscatter(x,y,j,[]);
% title('Plot of Region Classification by LDA for 10 Classes')
% xlabel('1st Feature');
% ylabel('2nd Feature');
% 
% % Attempting Quadratic disciminant analysis
% qdaClass = classify(testDataSet, dataSet,trainingLabels,'quadratic');
% bad = ~strcmp(qdaClass,trainingLabels);
% qdaResubErr = sum(bad) / (n*numSamplesPerChar); % 0.0050