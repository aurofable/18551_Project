% Spring 2012, 18-551 Project
% Segmentation script
% James Chun, jtchun@andrew.cmu.edu


function [charsBW charsGray ave stdev] = segment(img)
imgray = rgb2gray(img);
imgbin = ~im2bw(imgray);

[image num] = bwlabel(imgbin);
stats = regionprops(image, 'BoundingBox');
imgray = histeq(imgray); % For grayscale

charsBW = {};
charsGray = {};
charCnt = 0;
cornerPointsX = [];
cornerPointsY = [];
for i = 1:num
    if (stats(i).BoundingBox(3)*stats(i).BoundingBox(4) < 500) 
        continue
    end
    charCnt = charCnt + 1;
    cornerPointsX = [cornerPointsX stats(i).BoundingBox(1)];
    cornerPointsY = [cornerPointsY stats(i).BoundingBox(2)];
    charsBW{charCnt} = ~imcrop(imgbin, stats(i).BoundingBox);
    charsGray{charCnt} = imcrop(imgray, stats(i).BoundingBox);
end

% Getting the areas
areas = zeros(length(charsBW), 1);
for i = 1:length(charsBW)
    croppedImg = charsBW{i};
    [a b] = size(croppedImg);
    areas(i) = a*b;
end

% Getting a straight line of text
% Remove those that are not near the line
p = polyfit(cornerPointsX, cornerPointsY, 1);
p1 = [0 p(2)];
p2 = [-1*p(1)/p(2) 0]; 

% If differs by some margin, remove
stdev = std(areas);
ave = mean(areas);
for i = 1:length(charsBW)
    d = abs(cornerPointsY(i) - p1(1)*cornerPointsX(i) - p2(2)) / sqrt(p1(1) * p1(1) + 1);
    if ((abs(areas(i) - ave) > 4*stdev) || d > ave)
        charsBW{i} = [];
        charsGray{i} = [];
    else
        charsBW{i} = imresize(charsBW{i}, [128 128]);
        charsGray{i} = imresize(charsGray{i}, [128 128]);
    end
end

charsBW = charsBW(~cellfun(@isempty, charsBW));
charsGray = charsGray(~cellfun(@isempty, charsGray));
end