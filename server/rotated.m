function [angles dim v] =  rotated(img)
% Roates the img using pca

% Grayscale it
%img = rgb2gray(img);
%img = imread('17.jpg');
img = im2bw(img, 0.3);

% Downsample to save time
img = downsample(img, 3);
img = downsample(img', 3);
img = img';

% Apply Gaussian Filter
%f = fspecial('gaussian', [15 15], 30);
%img = imfilter(img, f,'replicate');
%img = im2bw(img, 0.5);



% Generating the data
%[dimY dimX] = size(img);
[rows cols] = find(img == 0);
figure;
scatter(rows, cols);
data = [rows cols];

% PCA
[v d] = eig(cov(data));
d = fliplr(flipud(d));
v = fliplr(v);

% Rotating once
figure;
data1 = data * v;
data1(:,2) = -1*data1(:,2);
data1 = round(data1);
scatter(data1(:,1), data1(:,2));
%dis = ones(dimY, dimX);
%dis(data1(:,2), data1(:,1)) = 0;
%figure;
%imshow(dis); % Showing for fun, use opencv to rotate

angle = atan(v(1,1)/v(2,1)); % Angle of first PC in radians
angle2 = atan(v(1,2)/v(2,2)); % Angle of 2nd PC in radians
angles = [angle angle2];
width = range(data(:,1));
height = range(data(:,2));
dim = [height width];
end