% MACE filter tester

% 1 -> MACE
% 2 -> FGDS (ECP-SDF)
% 3 -> CF
% 4 -> OTSDF
type = 4;

dataIn = {};
numFilt = 8;
for r = 1:numFilt
    dataIn = cat(2, dataIn, chBW2{r});
end
H = dataIn;
if type ~= 3
    H = MACEfilterALL(dataIn, numFilt, 32, 32, type);
end
% N = length(H);
PSR = zeros(numFilt);
% data = filter_test(a{5});
% hr = MACEfilterIN(data, 28, 32, 32);
testFil = fspecial('gaussian', [5 5], 0.5);

for j = 1:numFilt
    in = dataIn{j};
    inDoub = double(in);
    test = imresize(inDoub, [32 32]);
    % for output
    test = imfilter(test,testFil);
    % loop to test correlation
    for i = 1:numFilt
        if type == 3
            ccf = H{i};
            ccfd = double(ccf);
            ccfr = imresize(ccfd, [32 32]);
            corr = ifft2(fft2(test).*conj(fft2(ccfr)));
        end
        if type ~= 3
            corr = ifft2(fft2(test).*conj(H{i}));
        end
        corrNorm = corr./max(max(corr));
        % mesh(fftshift(abs(corrNorm)));
        psrMax = max(max(corrNorm));
        psrMean = mean(mean(corrNorm));
        PSR(i,j) = abs((psrMax - psrMean)/(std(corrNorm(:))));
    end
end

% Output

numCorrect = 0;
for i = 1:numFilt
    [testPSRmax, testLoc] = max(PSR(i,:));
    cLet = i+64;
    letLoc = testLoc+64;
    corNess = ceil(abs(cLet-letLoc)/numFilt);
    % display([cLet ' = ' letLoc ' -> ' (corNess+48)]);
    if cLet == letLoc
        numCorrect = numCorrect+1;
    end
end
testPer = (numCorrect/numFilt)*100;
% display([testPer '% of inputs were correctly categorized']);
display([(numFilt-numCorrect+48) ' categorizations incorrect']);

% h1 = fspecial('gaussian', [5 5], 0.5);
% for i = 1:numFilt
%     testIn = dataIn{5,i};
%     testDoub = double(testIn);
%     testImg = imresize(inDoub, [32 32]);
%     test
% end

