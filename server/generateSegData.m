% Spring 2012, 18-551 Project
% Generating data from imgDataTrain

close all
clear all
load Fntdata

% Training Dataset
imgDataTrainSeg = cell(length(imgDataTrain), 1);
imgDataTrainSegGray = cell(length(imgDataTrain), 1);
for i = 1:length(imgDataTrain)
    char = imgDataTrain{i};
    charSeg = cell(length(char), 1);
    charSegGray = cell(length(char), 1);
    for j = 1:length(char)
        [charSeg{j} charSegGray{j}] = segmentChar(char{j});
    end
    imgDataTrainSeg{i} = charSeg;
    imgDataTrainSegGray{i} = charSegGray;
end


% Testing Dataset
imgDataTestSeg = cell(length(imgDataTest), 1);
imgDataTestSegGray = cell(length(imgDataTest), 1);
for i = 1:length(imgDataTest)
    char = imgDataTest{i};
    charSeg = cell(length(char), 1);
    charSegGray = cell(length(char), 1);
    for j = 1:length(char)
        [charSeg{j} charSegGray{j}] = segmentChar(char{j});
    end
    imgDataTestSeg{i} = charSeg;
    imgDataTestSegGray{i} = charSegGray;
end

clearvars -except imgDataTrainSeg imgDataTestSeg imgDataTrainSegGray imgDataTestSegGray;
save segData.mat;

