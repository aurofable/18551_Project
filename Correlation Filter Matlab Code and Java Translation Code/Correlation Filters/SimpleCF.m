% 18-551 Spring 2012
% Alex Baran

% Simple CF

% a = double(x003);

% tst = ifft2(fft2(a).*conj(H{1}));
% 
% tst = tst./max(max(tst));
% 
% psrMaxt = max(max(tst));
% psrMeant = mean(mean(tst));
% 
% PSRt = abs((psrMaxt - psrMeant)/(std(tst(:))));
% 
% mesh(fftshift(abs(tst)));


% Simple CF tester

% Initialization
PSRtest = zeros(3);
counter = 1;

% Loop to get data
for i = 1:3
    % Calculating correlations
    for j = 1:3
%         tst = ifft2(fft2(Qdata{i}).*conj(fft2(imresize(double(H{j}),[32 32]))));
        tst = ifft2(fft2(Qdata{i}).*conj(H{j}));
        % Normalizing
        tst = tst./max(max(tst));
        % Getting max value
        psrMax = max(max(tst));
        % Brute forcing PSR mask for mean and std dev
        cS = fftshift(tst);
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
        PSRtest(i,j) = abs((psrMax - cSMean)/(std(cStot(:))));
        
        % Plotting
        figure(3);
        subplot(3,3,counter);
        counter = counter + 1;
        mesh(fftshift(abs(tst)));
        title(PSRtest(i,j));
    end
%     figure(2);
%     subplot(3,1,i);
%     plot(PSRtest(i,:));
end

