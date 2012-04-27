% Spring 2012, 18-551 Project
% Classification Script
% James Chun, jtchun@andrew.cmu.edu

function [answer predLabel] = capstoneClassify(charsBW, charsGray, dim, labels, reducFact, nVecs, model, rowDiv, colDiv, nHarmonics, ranges, minimums)

if (isempty(charsBW))
    answer = [];
    return
end

filterSize = 128*reducFact;
dataInput = zeros(length(charsBW), dim);
filterBank = getFilterBank(reducFact);

dataIndex = 0;
for i = 1:length(charsBW)
    dataIndex = dataIndex + 1;

        % Data should have grayscale and binary
        % Assume image is grayscale
        charBW = charsBW{i};
        charGray = charsGray{i};
        charGray = imresize(charGray, [filterSize filterSize]);
        
        % Creating feature vector
        % Elliptical
        outline = getOutline(charBW);
        rFSDs = fEfourier(outline, nHarmonics, 1, 1);
        curveVec = reshape(rFSDs, 1, nHarmonics*4);
        
        % Zoning
        zonVec = getSkeletonZoneFeature(charBW, rowDiv, colDiv);
        
        % Filters
        filtVec1 = imfilter(charGray, filterBank{1});
        filtVec1 = reshape(filtVec1, 1, numel(filtVec1));
        
        filtVec2 = imfilter(charGray, filterBank{2});
        filtVec2 = reshape(filtVec2, 1, numel(filtVec2));
        
        filtVec3 = imfilter(charGray, filterBank{3});
        filtVec3 = reshape(filtVec3, 1, numel(filtVec3));
        
        filtVec4 = imfilter(charGray, filterBank{4});
        filtVec4 = reshape(filtVec4, 1, numel(filtVec4));
        
        filtVec5 = imfilter(charGray, filterBank{5});
        filtVec5 = reshape(filtVec5, 1, numel(filtVec5));
        
        filtVec = [filtVec1 filtVec2 filtVec3 filtVec4 filtVec5];
        dataInput(dataIndex, :) = [curveVec zonVec filtVec];
end

dataInput = dataInput * nVecs;
dataInput = (dataInput - repmat(minimums, size(dataInput, 1), 1)) ./ repmat(ranges, size(dataInput, 1), 1);

% Running the svm
testLabels = randi(100, length(charsBW), 1); % Does not matter
[predLabel accuracy ~] = svmpredict(testLabels, dataInput, model);

answer = labels(predLabel);
end