% Spring 2012, 18-551 Project
% drawingBoundingBoxes

function output = drawBoundingBoxes(img, mean, std)
imgray = rgb2gray(img);
imgbin = ~im2bw(imgray);

[image1 num] = bwlabel(imgbin);
stats = regionprops(image1, 'BoundingBox');
g = img;
[M N] = size(stats);
for k = 1:M
    
    area = stats(k).BoundingBox(3)*stats(k).BoundingBox(4);
    if (area < 100) 
        continue
    elseif (abs(area - mean) > 1.5*std)
        continue
    else % nothing
    end
    
    for i = ceil(stats(k).BoundingBox(1)):floor(stats(k).BoundingBox(1))+stats(k).BoundingBox(3)
        for j = ceil(stats(k).BoundingBox(2)):floor(stats(k).BoundingBox(2))+stats(k).BoundingBox(4)
           x1 = ceil(stats(k).BoundingBox(1));
           y1 = ceil(stats(k).BoundingBox(2));
           
           g(y1,i,1) = 255;
           g(y1,i,2) = 0;
           g(y1,i,3) = 0;
           
           g(y1 + stats(k).BoundingBox(4) - 1, i, 1) = 255; 
           g(y1 + stats(k).BoundingBox(4) - 1, i, 2) = 0; 
           g(y1 + stats(k).BoundingBox(4) - 1, i, 3) = 0; 
           
           g(j,x1, 1) = 255;
           g(j,x1, 2) = 0;
           g(j,x1, 3) = 0;
           
           g(j, x1 + stats(k).BoundingBox(3) - 1, 1) = 255;
           g(j, x1 + stats(k).BoundingBox(3) - 1, 2) = 0;
           g(j, x1 + stats(k).BoundingBox(3) - 1, 3) = 0;
        end
    end
end
output = g;
end