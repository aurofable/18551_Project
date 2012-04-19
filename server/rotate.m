% Spring 2012, 18-551 Project
% Rotation script
% Still very buggy and susceptible to noise

img = imread('received.jpg');
f = fspecial('gaussian', [15 15], 30);
imgfil = imfilter(img, f,'replicate');
imgray = rgb2gray(imgfil);
%img = im2bw(img, 0.5);
imgbin = im2bw(imgray, 0.6);

% Downsample to save time
imgbin = downsample(imgbin, 3);
imgbin = downsample(imgbin', 3);
imgbin = imgbin';

% Generating data
[rows cols] = find(imgbin == 0);
data = [rows cols];

% PCA
[v d] = eig(cov(data));
d = rot90(d,2);
v = fliplr(v);

angle = rad2deg(atan(v(1,1)*324/(v(2,1)*432)));
imgRot = imrotate(imgbin, -angle);
imshow(imgRot);
