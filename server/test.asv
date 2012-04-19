% Spring 2012, 18-551 Project
% Testing Script

load svmTrain.mat;

numTestSamples = 20;

numCorrect = 0;
debug = [];

for i = 1:length(labels)
    testSet = imgDataTest{i};
   for j = 1:numTestSamples
      sample = testSet{j};
      answer = capstoneClassify(sample, svmMatrix, labels);
      if (answer == i - 1)
          numCorrect = numCorrect + 1;
      else
          ref = imgDataTrain{answer + 1};
          debugRow = [sample ref{1}];
          debug = [debug; debugRow];
      end
   end
end

percentage = numCorrect / (numTestSamples * length(labels));
imshow(debug);