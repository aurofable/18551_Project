% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Sanity check before pushing it onto the android

img = imread('received.jpg');
chars = segment(img);
displayChars(chars);
[answer predLabel] = capstoneClassify(chars, labels, reducFact, nVecs, model, rowDiv, colDiv)