% Spring 2012, 18-551 Project
% Dimensionality Reduction using PCA
% James Chun, jtchun@andrew.cmu.edu

function dataSet = dimRedLDA(data, dataGray, labelVec, n, dim, numSamplesPerChar, numClasses, reducFact, rowDiv, colDiv, nHarmonics, trainingLabels)

filterSize = 128 * reducFact;
filterBank = getFilterBank(reducFact);

% Formatting dataInput
dataInput = zeros(numSamplesPerChar * numClasses, dim);
dataIndex = 0;
for i = 1:numClasses
    char = data{labelVec(i)};
    charG = dataGray{labelVec(i)};
    for j = 1:numSamplesPerChar
        dataIndex = dataIndex + 1;

        % Data should have grayscale and binary
        % Assume image is grayscale        
        charBW = char{j};
        charGray = charG{j};
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
end

% PCA
%[COEFF, SCORE, LATENT] = princomp(dataInput);
%cummulVar = cumsum(diag(LATENT))/sum(diag(LATENT));

% Getting the first n eigenvectors
%nVecs = COEFF(:,1:n);
%dataSet = dataInput * nVecs;

dataSet = compute_mapping([trainingLabels dataInput], 'LDA', n);
end
