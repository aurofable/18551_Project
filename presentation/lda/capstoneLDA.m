% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% Implementing own version of multi-class LDA

function res = capstoneLDA(data, labels)

dataSize = size(data);
classes = unique(labels);
numClasses = length(classes);

% Histogram of classes
histClasses = zeros(numClasses, 1);
for i = 1:numClasses
    histClasses(i) = sum(labels == classes(i));
end

% Calculating the mean vector





end