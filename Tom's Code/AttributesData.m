% 18-551 Project, Spring 2012

% Script to load in all the font data
clear all; close all;
cd('C:\Users\Tom Keagle\Documents\18-551\Project');

% Variables
directory = './English/Fnt';
numDirs = length(dir(directory)) - 2;
directory = sprintf('%s/Sample', directory);
numTraining = 1016 * 3/4;
numTest = 1016/4;
imgDataTrain = cell(numDirs, 1);
imgDataTest = cell(numDirs, 1);
featDataTrain = [];
featDataTest = [];

for i = 1:numDirs
   if (i < 10)
       imgDir = sprintf('%s00%d', directory, i);
   else imgDir = sprintf('%s0%d', directory, i);
   end
   imgFiles = dir(imgDir);

   imgVecTrain = cell(numTraining, 1);
   imgVecTest = cell(numTest, 1);
   featVecTrain = [];
   featVecTest = [];
   trainingCount = 1;
   testingCount = 1;

   % gets the image vector and attributs vector for each image 
   for j = 3:numTraining + numTest + 2
       imgFilename = sprintf('%s/%s', imgDir, imgFiles(j).name);
       img = imread(imgFilename);
       features = attributes(imgFilename);
       features = features';
       if (j <= numTraining + 2)
           imgVecTrain{trainingCount} = img;
           featVecTrain = [featVecTrain features];
           trainingCount = trainingCount + 1;
       else
           imgVecTest{testingCount} = img;
           featVecTest = [featVecTest features];
           testingCount = testingCount + 1;
       end
   end
   imgDataTrain{i} = imgVecTrain;
   imgDataTest{i} = imgVecTest;
   featDataTrain = [featDataTrain featVecTrain];
   featDataTest = [featDataTest featVecTest];
end

clearvars -except imgDataTrain imgDataTest featDataTrain featDataTest
save Fntdata.mat
