% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% getSkeletonZoneFeature

function vec = getSkeletonZoneFeature(img, rowDiv, colDiv)
% Assume binary image
if (length(size(img)) == 3)
    imgray = rgb2gray(img);
    img = ~im2bw(imgray);
end

%img = imresize(img, 0.25);
[dimY dimX] = size(img);
img = bwmorph(img, 'skel', Inf); % Skeletonise it

vec = zeros(1, rowDiv * colDiv);
index = 0;
%debug = zeros(size(img));
%figure
for i = 1:rowDiv
    for j = 1:colDiv
        index = index + 1;
        yStart = ((i-1)*dimY/rowDiv)+1;
        xStart = ((j-1)*dimX/colDiv)+1;
        sector = imcrop(img, [xStart yStart dimX/colDiv dimY/rowDiv]);
        %debug(yStart:yStart+dimX/colDiv, xStart:xStart+dimY/rowDiv, 1) = 255;
        vec(index) = length(find(sector == 1));
    end
end
end