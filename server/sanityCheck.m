% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Sanity check before pushing it onto the android
load svmTrainLibSVM.mat
%load svmTrainLibSVM256.mat

img = imread('received.jpg');
[charsBW charsGray] = segment(img);
displayChars(charsBW);
displayChars(charsGray);
[answer predLabel] = capstoneClassify(charsBW, charsGray, dim, labels, reducFact, nVecs, model, rowDiv, colDiv, nHarmonics, ranges, minimums);
answer