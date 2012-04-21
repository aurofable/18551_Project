% Finding the UCI Attributes
% Group 1

function featureVec = attributes(image)

%Using an example Picture
%Igray = imread(image);
%imshow(Igray)

%Ibw = im2bw(Igray,graythresh(Igray)); 
%imshow(Ibw)
Ibw = image;

Ibw2 = imcomplement(Ibw);
%imshow(Ibw2);

[Ibwlabel num2] = bwlabel(Ibw2);
Ibwprops = regionprops(Ibwlabel, 'all');
Ibox = [Ibwprops.BoundingBox]; 
Ibox = reshape(Ibox,[4 1]);
% imshow(Ibw)
% hold on;
% rectangle('position',Ibox(:,1),'edgecolor','r'); 


%Numbers 1 - 4
horizPos = Ibwprops.BoundingBox(1);
ibwSize = size(Ibw);
vertPos =  ibwSize(2) - (Ibwprops.BoundingBox(2) + Ibwprops.BoundingBox(4));
width = Ibwprops.BoundingBox(3);
height = Ibwprops.BoundingBox(4);

%Number 5
numOnPixels = Ibwprops.Area;


%Number 6 & 7
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
totalHorizSq = 0;
totalVertSq = 0;
for j = 1:numOnPixels
    totalHorizSq = totalHorizSq + ((horizPixelList(j) - Ibwprops.Centroid(1))^2)/width;
    totalVertSq = totalVertSq + ((vertPixelList(j) - Ibwprops.Centroid(2))^2)/height;
end

meanSqHoriz = totalHorizSq/numOnPixels;
meanSqVert = totalVertSq/numOnPixels;

%Number 10
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
horizDist = 0;
vertSq = 0;
totalProductV2H = 0;
for l = 1:numOnPixels
    horizDist = ((horizPixelList(l) - Ibwprops.Centroid(1)))/width;
    vertSq = ((vertPixelList(l) - Ibwprops.Centroid(2))^2)/height;
    totalProductV2H = totalProductV2H + (horizDist * vertSq);
end

corrVertVar = totalProductV2H/numOnPixels;


%Number 13 & 14

numLeftEdges = 0;
sumVertEdges = 0;
for z = 1:numOnPixels
    
    if sum(ismember(Ibwprops.PixelList, [horizPixelList(z)-1 vertPixelList(z)],'rows')) == 0
        numLeftEdges = numLeftEdges + 1;
        sumVertEdges = sumVertEdges + (height - vertPixelList(z)) - Ibwprops.Centroid(2);
        % Not sure about subtracting the center point
        % because it just says the horizontal position and not from the
        % center but all of the other ones are
    end
end
meanEdgesLR = numLeftEdges/width;
sumVertEdges;

%Number 15 & 16

numBotEdges = 0;
sumHorizEdges = 0;
for z = 1:numOnPixels
    
    if sum(ismember(Ibwprops.PixelList, [horizPixelList(z) vertPixelList(z)+1],'rows')) == 0
        numBotEdges = numBotEdges + 1;
        sumHorizEdges = sumHorizEdges + horizPixelList(z) - Ibwprops.Centroid(1); 
        % Not sure about subtracting the center point
        % because it just says the horizontal position and not from the
        % center but all of the other ones are
    end
end
meanEdgesBT = (numBotEdges/height);
sumHorizEdges;


featureVec = [horizPos vertPos width height numOnPixels 
    meanHorizOnPixels meanVertOnPixels meanSqHoriz meanSqVert 
    meanProductOn corrHorizVar corrVertVar 
    meanEdgesLR sumVertEdges meanEdgesBT sumHorizEdges]

end