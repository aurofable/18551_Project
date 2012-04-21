% Spring 2012, 18-551 Project
% Segmentation script


function [chars  ave stdev] = segment(img)
imgray = rgb2gray(img);
imgbin = ~im2bw(imgray);

[image num] = bwlabel(imgbin);
stats = regionprops(image, 'BoundingBox');
%imgray = histeq(imgray);

chars = {};
charCnt = 1;
for i = 1:num
    if (stats(i).BoundingBox(3)*stats(i).BoundingBox(4) < 100) 
        continue
    end
    charImg = imcrop(imgbin, stats(i).BoundingBox);
    %charImg = imresize(charImg, [128 128]);
    chars{charCnt} = ~charImg;
    charCnt = charCnt + 1;
end

areas = zeros(length(chars), 1);
for i = 1:length(chars)
    croppedImg = chars{i};
    [a b] = size(croppedImg);
    areas(i) = a*b;
end

% If differs by some margin, remove
for i = 1:length(chars)
    s = std(areas);
    if ((abs(areas(i) - mean(areas)) > 1.5*s))
        chars{i} = [];
    else chars{i} = imresize(chars{i}, [128 128]);
    end
end
chars = chars(~cellfun(@isempty, chars));
ave = mean(areas);
stdev = s;
end