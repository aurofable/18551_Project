% 18-551 Spring 2012
% Alex Baran

% MACE filter tester

% 1 -> MACE
% 2 -> FGDS (ECP-SDF)
% 3 -> CF
% 4 -> OTSDF
function H = MACEFilterTest(input, type)
% type = 4;

dataIn = {};
numFilt = 26;
for r = 1:numFilt
    dataIn = cat(2, dataIn, input{r});
end
H = dataIn;
if type ~= 3
    H = MACEfilterALL(dataIn, numFilt, 32, 32, type);
end
% N = length(H);
% PSR = zeros(numFilt);
% % data = filter_test(a{5});
% % hr = MACEfilterIN(data, 28, 32, 32);
% testFil = fspecial('gaussian', [5 5], 0.5);

% for j = 1:numFilt
%     in = dataIn{j};
%     inDoub = double(in);
%     test = imresize(inDoub, [32 32]);
%     % for output
%     test = imfilter(test,testFil);
%     % loop to test correlation
%     for i = 1:numFilt
%         if type == 3
%             ccf = H{i};
%             ccfd = double(ccf);
%             ccfr = imresize(ccfd, [32 32]);
%             corr = ifft2(fft2(test).*conj(fft2(ccfr)));
%         end
%         if type ~= 3
%             corr = ifft2(fft2(test).*conj(H{i}));
%         end
%         corrN = corr./max(max(corr));
%         % mesh(fftshift(abs(corrNorm)));
%         corrMax = max(max(corrN));
%         % Brute forcing
%         cS = fftshift(corrN);
%         [maxY, yLoc] = max(cS,[],1);
%         [maxX, xLoc] = max(cS,[],2);
%         yVal = 1;
%         xVal = 1;
%         for coord = 2:32
%             if maxY(coord) == 1
%                 yVal = yLoc(coord);
%             end
%             if maxX(coord) == 1
%                 xVal = xLoc(coord);
%             end
%         end
%         yValP = yVal + 2;
%         yValN = yVal - 2;
%         xValP = xVal + 2;
%         xValN = xVal - 2;
%         if yValP > 32
%             yValP = 32;
%         end
%         if yValN < 1
%             yValN = 1;
%         end
%         if xValP > 32
%             xValP = 32;
%         end
%         if xValN < 1
%             xValN = 1;
%         end
%         cStop = cS(1:xValN,1:32);
%         cSleft = cS(xValN:xValP,1:yValN);
%         cSright = cS(xValN:xValP,yValP:32);
%         cSbottom = cS(xValP:32,1:32);
%         cStot = [cStop(:); cSleft(:); cSright(:); cSbottom(:)];
%         cSMean = mean(cStot(:));
%         PSR(i,j) = abs((corrMax - cSMean)/(std(cStot(:))));
% %         psrMean = mean(mean(corrN));
% %         PSR(i,j) = abs((psrMax - psrMean)/(std(corrN(:))));
%     end
% end

% Output

% numCorrect = 0;
% for i = 1:numFilt
%     [testPSRmax, testLoc] = max(PSR(i,:));
%     cLet = i+64;
%     letLoc = testLoc+64;
%     corNess = ceil(abs(cLet-letLoc)/numFilt);
% %     display([cLet ' = ' letLoc ' -> ' (corNess+48)]);
%     if cLet == letLoc
%         numCorrect = numCorrect+1;
%     end
% end
% testPer = (numCorrect/numFilt)*100;
% display([testPer '% of inputs were correctly categorized']);
% [max(PSR(1,:)) mean(PSR(1,:)) min(PSR(1,:))]
% display([(numFilt-numCorrect+48) ' categorizations incorrect']);

% h1 = fspecial('gaussian', [5 5], 0.5);
% for i = 1:numFilt
%     testIn = dataIn{5,i};
%     testDoub = double(testIn);
%     testImg = imresize(inDoub, [32 32]);
%     test
% end

