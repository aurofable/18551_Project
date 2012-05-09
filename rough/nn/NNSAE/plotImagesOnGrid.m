function [h] = plotImagesOnGrid(X, numRows, numCols, width, height, samples, spacing)
%PLOTIMAGESONGRID plot a set of images on a grid
%   plotImagesGrid(X, numRows, numCols, width, height, samples, spacing)

if nargin < 6
    samples = 1:size(X,1);
end

if nargin < 7
    spacing = 1;
end

%helpers
excessLength = 1 + 0.5;
s2 = -(spacing-1)/2;
bgc = 1;

%create a figure
h = figure;
hold on;
set(h, 'outerposition', [-3 35 1280 1020]);
colormap gray;

%draw background
imagesc(bgc * ones(numRows*(height+spacing)+2*excessLength, numCols*(width+spacing)+2*excessLength)', ... 
    'XData', [-2*excessLength+1 numCols*(width+spacing)+2*excessLength-1], ...
    'YData', -[-2*excessLength+1 numRows*(height+spacing)+2*excessLength-1]);



%begin drawing along grid
cnt = 1;
img = [];
for i=0:numRows-1
    for j=0:numCols-1
        %determine if there is something to draw and if so prepare it
        empty = false;
        if cnt > length(samples)
            img = bgc * ones(height, width);
            empty = true;
        else
            img = X(samples(cnt),:);
            
            %normalize image (still as row)
            minImg = min(img);
            maxImg = max(img);
            if minImg == maxImg
                img = zeros(size(img));
            else
                img = (img - minImg)/(maxImg - minImg);
            end
    
            %get the image
            img = reshape(img, height, width);
        end
        
        %draw cell content
        imagesc(img, 'XData', [j*(width+spacing)+1 (j+1)*(width+spacing)-spacing], 'YData', -[i*(height+spacing)+1 (i+1)*(height+spacing)-spacing], [0 1]);
        
        %draw cross for empty images
        if empty
            %cross
            line([j*(width+spacing)+1 (j+1)*(width+spacing)-spacing], -[i*(height+spacing)+1 (i+1)*(height+spacing)-spacing], 'Color', 'k');
            line([(j+1)*(width+spacing)-spacing j*(width+spacing)+1], -[i*(height+spacing)+1 (i+1)*(height+spacing)-spacing], 'Color', 'k');
            
            %box
            line([j*(width+spacing)+1 j*(width+spacing)+1], -[i*(height+spacing)+1 (i+1)*(height+spacing)-spacing], 'Color', 'k');
            line([(j+1)*(width+spacing)-spacing (j+1)*(width+spacing)-spacing], -[i*(height+spacing)+1 (i+1)*(height+spacing)-spacing], 'Color', 'k');
            line([j*(width+spacing)+1 (j+1)*(width+spacing)-spacing], -[i*(height+spacing)+1 i*(height+spacing)+1], 'Color', 'k');
            line([j*(width+spacing)+1 (j+1)*(width+spacing)-spacing], -[(i+1)*(height+spacing)-spacing (i+1)*(height+spacing)-spacing], 'Color', 'k');
        end
        
        cnt = cnt + 1;
    end
end

axis image;
axis off;

%draw grid
for i=0:numRows
    for j=0:numCols
        %vertical grid
        line([j*(width+spacing)+s2 j*(width+spacing)+s2], -[-excessLength numRows*(height+spacing)+excessLength], 'Color', 'k');
        %horizontal
        line([-excessLength numCols*(width+spacing)+excessLength], -[i*(height+spacing)+s2 i*(height+spacing)+s2], 'Color', 'k');
    end
end


end

