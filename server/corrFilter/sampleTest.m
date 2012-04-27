% Actual Testing!!

[chBW chG avgT stdT] = segment(inputT);

numIn = length(chBW);
numFilters = length(H);
PSRtest = zeros(numIn,numFilters);

% Loop to go through input
for i = 1:numIn
    currIn = chBW{i};
    currIn = double(currIn);
    currIn = imresize(currIn, [32 32]);
    
    % Applying [numFilters] filters to each input
    for j = 1:numFilters
        % Correlation part
        % corrTest = ifft2(fft2(currIn).*conj(fft2(imresize(double(H{j}), [32 32]))));
        corrTest = ifft2(fft2(currIn).*conj(H{j}));
        corrTNorm = corrTest./max(max(corrTest));
        % Getting the PSR
        psrMaxT = max(max(corrTNorm));
        psrMeanT = mean(mean(corrTNorm));
        PSRtest(i,j) = abs((psrMaxT - psrMeanT)/(std(corrTNorm(:))));
    end
end

% Categorization!
numCorrT = 0;
for i = 1:numIn
    [testPSRmaxT, testLocT] = max(PSRtest(i,:));
    cLetT = i+64;
    letLocT = testLocT+64;
    corNessT = ceil(abs(cLetT-letLocT)/numFilters);
    display([cLetT ' = ' letLocT ' -> ' (corNessT+48)]);
    if cLetT == letLocT
        numCorrT = numCorrT+1;
    end
end
testPerT = (numCorrT/numFilters)*100;

