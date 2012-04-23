% Spring 2012, 18-551 Project
% Dimensionality Reduction using PCA
% Used for testing

function [dataSet] = dimRedTest(data, numSamplesPerChar, numClasses, reducFact, nVecs, numNoisy, noisyData, rowDiv, colDiv)
% Assume that data coming in is e.g. imgDataTest

char = data{1};
dim = numel(char{1}) * reducFact * reducFact;
dim = dim + 256; % For projections
dim = 32*4 + 16 + 128*128*3 + 128*128 + 128*128;
% elliptical, zoning, gaussian, log, gabors
dim = 32*4 + 16;

% Formatting dataInput
dataInput = zeros(numSamplesPerChar * numClasses, dim);
dataIndex = 0;
for i = 1:numClasses
    
    % Noisy Images
    char = noisyData{i};
    for j = 1:numNoisy
        dataIndex = dataIndex + 1;
%         thumbnail = imresize(char{end - j}, reducFact);
%         vec = getCompositeFeature(char{end - j});
%         dataInput(dataIndex, :) = [reshape(thumbnail, 1, dim-256) vec];
%         dataInput(dataIndex, :) = getCompositeFeature(char{end - j});
%        dataInput(dataIndex, :) = getSkeletonZoneFeature(char{end - j}, rowDiv, colDiv);

        % Data should have grayscale and binary
        % Assume image is grayscale (ie imgData...not raw)
        %charBW = im2bw(char{j}); %IF NOT RAW THEN UNCOMMENT
        charBW = char{j}; % IF RAW UNCOMMENT
        %charGray = histeq(char{j}); %IF NOT RAW THEN UNCOMMENT
        charGray = char{j}; % IF RAW UNCOMMENT
        
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
    
    % Clean Images
    char = data{i};
    for j = 1:numSamplesPerChar-numNoisy
        dataIndex = dataIndex + 1;
%         thumbnail = imresize(char{j}, reducFact);
%         vec = getCompositeFeature(char{j});
%         dataInput(dataIndex, :) = [reshape(thumbnail, 1, dim-256) vec];
%         dataInput(dataIndex, :) = getCompositeFeature(char{j});
%        dataInput(dataIndex, :) = getSkeletonZoneFeature(char{j}, rowDiv, colDiv);
        
        % Data should have grayscale and binary
        % Assume image is grayscale (ie imgData...not raw)
        %charBW = im2bw(char{j}); %IF NOT RAW THEN UNCOMMENT
        charBW = char{j}; % IF RAW UNCOMMENT
        %charGray = histeq(char{j}); %IF NOT RAW THEN UNCOMMENT
        charGray = char{j}; % IF RAW UNCOMMENT
        
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
end

% Getting the first n eigenvectors
dataSet = dataInput * nVecs;
end