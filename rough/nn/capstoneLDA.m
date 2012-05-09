% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% Implementing own version of multi-class LDA

function res = capstoneLDA(data, labels)

dataSize = size(data);
classes = unique(labels);
numClasses = length(classes);
res = zeros(numClasses, dataSize(2) + 1);

% Histogram of classes
histClasses = zeros(numClasses, 1);
classMean = zeros(numClasses, dataSize(2));
covMat = zeros(dataSize(2), dataSize(2));
for i = 1:numClasses
    classData = (labels == classes(i));
    histClasses(i) = sum(classData);
    classMean(i,:) = mean(data(Group,:));
    covMat = covMat + ((histClasses(i)-1)/(dataSize(1)-numClasses)).* cov(data(classData,:));
end

sampleProb = histClasses/n;

% Loop over classes to calculate linear discriminant coefficients
for i = 1:k,
    Temp = classMean(i,:) / covMat;
    res(i,1) = -0.5 * Temp * classMean(i,:)' + log(sampleProb(i));
    res(i,2:end) = Temp;
end
end