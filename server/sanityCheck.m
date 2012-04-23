% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Sanity check before pushing it onto the android

img = imread('received.jpg');
[charsBW charsGray] = segment(img);
displayChars(charsBW);
displayChars(charsGray);
[answer predLabel] = capstoneClassify(charsBW, charsGray, labels, reducFact, nVecs, model, rowDiv, colDiv, ranges, minimums)

% THINK ABOUT GRAYSCALE....
% WHAT DATA ARE YOU TRAINING ON AND WHAT DATA ARE YOU GETTING....

% imgDataTrain format: Size: 128x128, Val: 0-255
% imgDataTest format: Size: 128x128, Val: 0-255