% Spring 2012, 18-551 Project
% Training Script

clear all;
load FntData;

%labels = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
%    'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];

labels = 0:3;
numTrainingSamples = 700;
features = 64;

% Preparing the data to train
svmMatrix = cell(length(labels));

% Caching the feature vectors?

for i = 1:length(labels)
   for j = 1:length(labels)
       if i == j 
           continue 
       end
       
       % Training it such that i is positive, j is negative
       iChar = imgDataTrain{i};
       jChar = imgDataTrain{j};
       iTrainingDataSet = zeros(numTrainingSamples, features);
       jTrainingDataSet = zeros(numTrainingSamples, features);
       for k = 1:numTrainingSamples
           iTrainingDataSet(k,:) = getHistTextureFeature(iChar{k});
           jTrainingDataSet(k,:) = getHistTextureFeature(jChar{k});
       end
       trainingDataSet = [iTrainingDataSet; jTrainingDataSet];
       groupings = [ones(numTrainingSamples, 1); zeros(numTrainingSamples, 1)];
       
       svmMatrix{i, j} = svmtrain(trainingDataSet, groupings);
   end
end

clearvars -except svmMatrix imgDataTrain imgDataTest labels;
save svmTrain.mat



