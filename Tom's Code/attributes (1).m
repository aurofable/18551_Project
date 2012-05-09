% Finding the UCI Attributes
% Group 1, 18-551 Capstone

function featureVec = attributes(image)

Igray = imread(image);

Ibw = im2bw(Igray,graythresh(Igray)); 

Ibw2 = imcomplement(Ibw);

[Ibwlabel num2] = bwlabel(Ibw2);
Ibwprops = regionprops(Ibwlabel, 'all');
Ibwprops = Ibwprops(1);
Ibox = [Ibwprops.BoundingBox];
Ibox = reshape(Ibox,[4 1]);


% Numbers 1 - 4
% 1. The horizontal position, counting pixels from the left edge of the image, of the center
% of the smallest rectangular box that can be drawn with all "on" pixels inside the box.
% 2. The vertical position, counting pixels from the bottom, of the above box.
% 3. The width, in pixels, of the box.
% 4. The height, in pixels, of the box.
horizPos = Ibwprops.BoundingBox(1);
ibwSize = size(Ibw);
vertPos =  ibwSize(2) - (Ibwprops.BoundingBox(2) + Ibwprops.BoundingBox(4));
width = Ibwprops.BoundingBox(3);
height = Ibwprops.BoundingBox(4);


% Number 5
% 5. The total number of "on" pixels in the character image.
numOnPixels = Ibwprops.Area;


%Number 6 & 7
% 6. The mean horizontal position of all "on" pixels relative to the center of the box and
% divided by the width of the box. This feature has a negative value if the image is "leftheavy"
% as would be the case for the letter L.
% 7. The mean vertical position of all "on" pixels relative to the center of the box and divided
% by the height of the box.
totalHoriz= 0;
totalVert = 0;
horizPixelList = Ibwprops.PixelList(:,1)';
vertPixelList = Ibwprops.PixelList(:,2)';
sizePixelList = size(Ibwprops.PixelList);
for i = 1:numOnPixels
    totalHoriz = totalHoriz + (horizPixelList(i) - Ibwprops.Centroid(1))/width;
    totalVert = totalVert + (vertPixelList(i) - Ibwprops.Centroid(2))/height;
end

meanHorizOnPixels = totalHoriz/numOnPixels;
meanVertOnPixels = -(totalVert/numOnPixels);


%Number 8 & 9
% 8. The mean squared value of the horizontal pixel distances as measured in 6 above. This
% attribute will have a higher value for images whose pixels are more widely separated
% in the horizontal direction as would be the case for the letters W or M.
% 9. The mean squared value of the vertical pixel distances as measured in
% 7 above.
totalHorizSq = 0;
totalVertSq = 0;
for j = 1:numOnPixels
    totalHorizSq = totalHorizSq + ((horizPixelList(j) - Ibwprops.Centroid(1))^2)/width;
    totalVertSq = totalVertSq + ((vertPixelList(j) - Ibwprops.Centroid(2))^2)/height;
end

meanSqHoriz = totalHorizSq/numOnPixels;
meanSqVert = totalVertSq/numOnPixels;

%Number 10
% 10. The mean product of the horizontal and vertical distances for each "on" pixel as measured
% in 6 and 7 above. This attribute has a positive value for diagonal lines that run
% from bottom left to top right and a negative value for diagonal lines from top left to
% bottom right.
totalHorizP = 0;
totalVertP = 0;
totalProduct = 0;
for k = 1:numOnPixels
    totalHorizP = ((horizPixelList(k) - Ibwprops.Centroid(1)))/width;
    totalVertP = ((vertPixelList(k) - Ibwprops.Centroid(2)))/height;
    totalProduct = totalProduct + (totalHorizP * -totalVertP);
end

meanProductOn = totalProduct/numOnPixels;

%Number 11
% 11. The mean value of the squared horizontal distance times the vertical distance for each
% "on" pixel. This measures the correlation of the horizontal variance with the vertical
% position.
horizSq = 0;
vertDist = 0;
totalProductH2V = 0;
for k = 1:numOnPixels
    horizSq = ((horizPixelList(k) - Ibwprops.Centroid(1))^2)/width;
    vertDist = ((vertPixelList(k) - Ibwprops.Centroid(2)))/height;
    totalProductH2V = totalProductH2V + (horizSq * -vertDist);
end

corrHorizVar = totalProductH2V/numOnPixels;

%Number 12
% 12. The mean value of the squared vertical distance times the horizontal distance for each
% "on" pixel. This measures the correlation of the vertical variance with the horizontal
% position.
horizDist = 0;
vertSq = 0;
totalProductV2H = 0;
for l = 1:numOnPixels
    horizDist = ((horizPixelList(l) - Ibwprops.Centroid(1)))/width;
    vertSq = ((vertPixelList(l) - Ibwprops.Centroid(2))^2)/height;
    totalProductV2H = totalProductV2H + (horizDist * vertSq);
end

corrVertVar = totalProductV2H/numOnPixels;


% %Number 13 & 14
% 13. The mean number of edges (an "on" pixel immediately to the right of either an "off"
% pixel or the image boundary) encountered when making systematic scans from left
% to right at all vertical positions within the box. This measure distinguishes between
% letters like "W" or "M" and letters like 'T' or "L."
% 14. The sum of the vertical positions of edges encountered as measured in 13 above. This
% feature will give a higher value if there are more edges at the top of the box, as in
% the letter "Y."
numLeftEdges = 0;
sumVertEdges = 0;
for z = 1:numOnPixels
    
    if sum(ismember(Ibwprops.PixelList, [horizPixelList(z)-1 vertPixelList(z)],'rows')) == 0
        numLeftEdges = numLeftEdges + 1;
        sumVertEdges = sumVertEdges + (height - vertPixelList(z)) - Ibwprops.Centroid(2);
    end
end
meanEdgesLR = numLeftEdges/width;


%Number 15 & 16
% 15. The mean number of edges (an "on" pixel immediately above either an "off" pixel
% or the image boundary) encountered when making systematic scans of the image from
% bottom to top over all horizontal positions within the box.
% 16. The sum of horizontal positions of edges encountered as measured in 15 above.
numBotEdges = 0;
sumHorizEdges = 0;
for z = 1:numOnPixels
    
    if sum(ismember(Ibwprops.PixelList, [horizPixelList(z) vertPixelList(z)+1],'rows')) == 0
        numBotEdges = numBotEdges + 1;
        sumHorizEdges = sumHorizEdges + horizPixelList(z) - Ibwprops.Centroid(1); 
    end
end
meanEdgesBT = (numBotEdges/height);


featureVec = [horizPos vertPos width height numOnPixels...
    meanHorizOnPixels meanVertOnPixels meanSqHoriz meanSqVert...
    meanProductOn corrHorizVar corrVertVar meanEdgesLR...
    sumVertEdges meanEdgesBT sumHorizEdges];

end
