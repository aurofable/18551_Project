% Spring 2012, 18-551 Project
% Segmentation script


function chars = segment(img)
imgray = rgb2gray(img);
%imgray = histeq(imgray);
imgbin = im2bw(imgray);
imgbin = ~imgbin;

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
    charImg = imresize(charImg, [128 128]);
    charImg = ~charImg .* 255;
    %charImg = histeq(charImg);
    chars{charCnt} = charImg;
    charCnt = charCnt + 1;
end
end