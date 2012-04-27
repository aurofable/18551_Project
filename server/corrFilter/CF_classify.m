% Correlation Filter Classifier(s)

function classified = CF_classify(dataIn, filters)

% Initialization
numIn = length(dataIn);
numFil = length(filters);
PSR = zeros(numIn,numFil);
classified = zeros(size(dataIn));

% Loop through input to generate PSR matrix
for i = 1:numIn
    % Formatting current input
    currIn = dataIn{i};
    currIn = double(currIn);
    currIn = imresize(currIn, [32 32]);
    
    % Loop to send each input through all filters
    for j = 1:numFil
        % Calculating the correlation
        corr = ifft2(fft2(currIn).*conj(filters{j}));
        corrN = corr./max(max(corr));
        % Calculating PSR
        corrMax = max(max(corrN));
        % Brute forcing
        cS = fftshift(corrN);
        [maxY, yLoc] = max(cS,[],1);
        [maxX, xLoc] = max(cS,[],2);
        yVal = 1;
        xVal = 1;
        for coord = 2:32
            if maxY(coord) == 1
                yVal = yLoc(coord);
            end
            if maxX(coord) == 1
                xVal = xLoc(coord);
            end
        end
        yValP = yVal + 2;
        yValN = yVal - 2;
        xValP = xVal + 2;
        xValN = xVal - 2;
        if yValP > 32
            yValP = 32;
        end
        if yValN < 1
            yValN = 1;
        end
        if xValP > 32
            xValP = 32;
        end
        if xValN < 1
            xValN = 1;
        end
        cStop = cS(1:xValN,1:32);
        cSleft = cS(xValN:xValP,1:yValN);
        cSright = cS(xValN:xValP,yValP:32);
        cSbottom = cS(xValP:32,1:32);
        cStot = [cStop(:); cSleft(:); cSright(:); cSbottom(:)];
        cSMean = mean(cStot(:));
        PSR(i,j) = abs((corrMax - cSMean)/(std(cStot(:))));
        % corrMean = mean(mean(corrN));
        % PSR(i,j) = abs((corrMax - corrMean)/(std(corrN(:))));
    end
end

% Classification
for i = 1:numIn
    % Locating the max PSR for the current input
    % Currently assumes 26 filters (capitals)
    [maxPSR, maxLoc] = max(PSR(i,:));
    classified(i) = maxLoc+64;
end

% Conversion from double to char
classified = char(classified);

