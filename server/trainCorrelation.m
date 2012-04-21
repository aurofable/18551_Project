% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

clear all;
load FntData.mat
% Using the first thing of each as a basis template

numClasses = 10;

templateBank = cell(numClasses, 1);
for i = 1:numClasses
    template = imgDataTrain{i};
    thumbnail = imresize(template{1}, 0.25);
    templateBank{i} = thumbnail;
end

clear i template thumbnail