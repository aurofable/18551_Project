% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% utilizing a composite feature for each image

% Feature Vector is as such:
% 1-128 -> Vertical Projection
% 129-256 -> Horizontal Projection
function vec = getCompositeFeature(img)
% Assume binary image
if (length(size(img)) == 3)
    imgray = rgb2gray(img);
    img = ~im2bw(imgray);
end

numProjBins = 8;
[dimY dimX] = size(img);

% Vertical Projection
vert = sum(img, 1);
% vertProj = zeros(1, numProjBins);
% for i = 1:length(vertProj)
%     vertProj(i) = sum(vert(:,(i-1)*dimX/numProjBins+1:(i*dimX/numProjBins)), 2);
% end

% Horizontal Projection
horz = sum(img, 2);
% horzProj = zeros(1, numProjBins);
% for i = 1:length(horzProj)
%     horzProj(i) = sum(horz((i-1)*dimY/numProjBins+1:(i*dimY/numProjBins), :), 1);
% end

%vec = [vertProj horzProj];
vec = [sum(img, 1) sum(img, 2)'];
end