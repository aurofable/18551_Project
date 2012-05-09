% 18-551 Spring 2012
% Alex Baran

% OTSDF (Optimal Tradeoff SDF) filter generator

function hr = OTSDFfilterIN(data, N, d1, d2, u)

% % out = filter_test(dataIn{5,26}, 1);
% % data = out;
% % N = length(out);
% % d1 = 32;
% % d2 = 32;
% % u = ones(N,1);

% First input, used for sizing as well
% a = double(x000);
% d1 = length(a(:,1));
% d2 = length(a(1,:));
% N = 9;

% Additional inputs
% input = [];
% for i = 1:N;
%     dir = './18551_Project_Images/Datasets/SegmentedChars/0/';
%     beg = '0';
%     if(i <= 9)
%         beg = [beg '0'];
%     end
%     file = [beg char(i+48) '.jpg'];
%     l = imread([dir file]);
%     currImg = double(data(i));
%     currImg = imresize(currImg,[d1 d2]);
%     input = [input currImg];
% end

sumFTs = zeros(d1*d2,1);
X = zeros(d1*d2,N);
for i = 1:N
%     y1 = d2*(i-1)+1;
%     y2 = d2*i;
%     currIn = input(1:d1,y1:y2);
    currIn = double(data{i});
    currIn = imresize(currIn, [d1 d2]);
    currFFT = fft2(currIn);
    X(:,i) = currFFT(:);
    sumFTs = sumFTs + (abs(currFFT(:)).^2);
end

% Calculate average and make diagonal
avgFT = sumFTs ./ N;
D = diag(avgFT);

% OTSDF difference
alpha = 0.75;
beta = sqrt(1-alpha^2);
I = eye(size(D));
D = alpha*D + beta*I;

% C = (X')/D*X;
% s1 = D\X;
% Ci = C';
% s2 = s1*Ci;
% h = s2*u;
% h = inv(D)*X*inv((X')*inv(D)*X)*u;
h = D\X*(((X')/D*X)')*u;
% h = h./max(max(h));
hr = reshape(h, d1, d2);
% hr = hr';

