% Spring 2012, 18-551 Project
% Segmentation script


function [charsBW charsGray] = segmentChar(img)
imgray = img;
imgbin = ~im2bw(imgray);

[image num] = bwlabel(imgbin);
stats = regionprops(image, 'BoundingBox');
imgray = histeq(imgray); % For grayscale

charsBW = {};
charsGray = {};
charCnt = 0;
for i = 1:num
    charCnt = charCnt + 1;
    charsBW{charCnt} = ~imcrop(imgbin, stats(i).BoundingBox);
    charsGray{charCnt} = imcrop(imgray, stats(i).BoundingBox);
end

areas = zeros(length(charsBW), 1);
for i = 1:length(charsBW)
    [a b] = size(charsBW{i});
    areas(i) = a*b;
end

% Return the maximum char
% Since this is a segmented image, it should be just the char
[maxVal maxIndex] = max(areas);
charsBW = charsBW{maxIndex};
charsGray = charsGray{maxIndex};
charsBW = imresize(charsBW, [128 128]);
charsGray = imresize(charsGray, [128 128]);
end