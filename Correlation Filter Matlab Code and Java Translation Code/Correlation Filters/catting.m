% 18-551 Spring 2012
% Alex Baran

% 18-551 demo

% inputs for filter
[b1 g1 a1 s1] = segment(in1);
[b2 g2 a2 s2] = segment(in2);
% concatting filter input
bTNR = {};
for i = 1:14
    bTNR = cat(2,bTNR,b1{i});
end
for j = 1:3
    bTNR = cat(2,bTNR,b2{j});
end
for j = 5:13
    bTNR = cat(2,bTNR,b2{j});
end

% generating filters
H = MACEFilterTest(bTNR, 4);

% setting test input
[bi gi ai si] = segment(demoInput);
input = bi;

% classifying inputs with filters
[classified, PSR] = CF_classify(input, H);

% output results
numFilt = 26;
numCorrect = 0;
for i = 1:26
    [testPSRmax, testLoc] = max(PSR(i,:));
    cLet = i+64;
    letLoc = testLoc+64;
    corNess = ceil(abs(cLet-letLoc)/numFilt);
%     display([cLet ' = ' letLoc ' -> ' (corNess+48)]);
    if cLet == letLoc
        numCorrect = numCorrect+1;
    end
end
testPer = (numCorrect/numFilt)*100;
% display([testPer '% of inputs were correctly categorized']);
% [max(PSR(1,:)) mean(PSR(1,:)) min(PSR(1,:))]
display([(numFilt-numCorrect+48) ' categorizations incorrect']);
disp(classified)
figure(1)
surf(PSR)
title(classified)


% % hello world input
% [bh gh ah sh] = segment(helloworld);
% inputHW = bh;
% % classifying inputs with filters
% [classHW, PSRhw] = CF_classify(inputHW, H);
% % output results
% numCorrect = 0;
% for i = 1:10
%     [testPSRmax, testLoc] = max(PSRhw(i,:));
%     cLet = i+64;
%     letLoc = testLoc+64;
%     corNess = ceil(abs(cLet-letLoc)/numFilt);
% %     display([cLet ' = ' letLoc ' -> ' (corNess+48)]);
%     if cLet == letLoc
%         numCorrect = numCorrect+1;
%     end
% end
% testPerHW = (numCorrect/numFilt)*100;
% % display([testPer '% of inputs were correctly categorized']);
% % [max(PSR(1,:)) mean(PSR(1,:)) min(PSR(1,:))]
% display([(numFilt-numCorrect+48) ' categorizations incorrect']);
% disp(classHW)
% % surf(PSRhw)


