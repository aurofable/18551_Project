% Spring 2012, 18-551 Project
% Classification Script

function [answer predLabel] = capstoneClassify(charsBW, charsGray, labels, reducFact, nVecs, model, rowDiv, colDiv, ranges, minimums)

if (isempty(charsBW)) 
    answer = [];
    return
end
dim = numel(charsBW{1}) * reducFact * reducFact;
dim = dim + 256; % for projections
dim = 32*4 + 16;
dataInput = zeros(length(charsBW), dim);

dataIndex = 0;
for i = 1:length(charsBW)
    dataIndex = dataIndex + 1;
%     thumbnail = imresize(chars{i}, reducFact);
%     vec = getCompositeFeature(chars{i});
%     dataInput(dataIndex, :) = [reshape(thumbnail, 1, dim-256) vec];
%         dataInput(dataIndex, :) = getCompositeFeature(char{i});
%   dataInput(dataIndex, :) = getSkeletonZoneFeature(chars{i}, rowDiv, colDiv);
    
        % Data should have grayscale and binary
        % Assume image is grayscale (ie imgData...not raw)
        charBW = charsBW{i};
        charGray = charsGray{i};
        
        % Creating feature vector
        % Elliptical
        outline = getOutline(charBW);
        rFSDs = fEfourier(outline, 32, 1, 1);
        curveVec = reshape(rFSDs, 1, 32*4);
        
        % Zoning
        zonVec = getSkeletonZoneFeature(charBW, rowDiv, colDiv);
        
        % Filters
        %filtVec = getFilterBankFeature(charGray);
        %dataInput(dataIndex, :) = [curveVec zonVec filtVec];
        dataInput(dataIndex, :) = [curveVec zonVec];
end

dataInput = dataInput * nVecs;
%dataInput = (dataInput - repmat(min(dataInput,[],1),size(dataInput,1),1))*spdiags(1./(max(dataInput,[],1)-min(dataInput,[],1))',0,size(dataInput,2),size(dataInput,2));
dataInput = (dataInput - repmat(minimums, size(dataInput, 1), 1)) ./ repmat(ranges, size(dataInput, 1), 1);

% Running the svm
testLabels = randi(100, length(charsBW), 1); % Does not matter
[predLabel accuracy ~] = svmpredict(testLabels, dataInput, model);

answer = zeros(1, length(charsBW));
for i = 1:length(predLabel)
    answer(i) = labels(predLabel(i));
end
end