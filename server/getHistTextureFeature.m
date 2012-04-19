% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% getHistTextureFeature
function vec = getHistTextureFeature(img)
[dimY dimX] = size(img);

rowDiv = 8;
colDiv = 8;

vec = zeros(1, rowDiv * colDiv);
index = 0;
for i = 1:rowDiv
    for j = 1:colDiv
        index = index + 1;
        yStart = ((i-1)*dimY/rowDiv)+1;
        xStart = ((j-1)*dimX/colDiv)+1;
        sector = imcrop(img, [xStart yStart dimX/colDiv dimY/rowDiv]);
        sector = histeq(sector);
        vec(index) = mean(mean(sector));
    end 
end
end

