% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

function outline = getOutline(img)
% Assume that img is the typical segmented image

img = ~img;
[dimY dimX] = size(img);
outlines = {};
outlineLengths = [];
outlineCnt = 0;
for row = 1:dimY
    for col = 1:dimX
        if img(row,col),
            break;
        end
    end
    
    outline = bwtraceboundary(img, [row, col], 'W', 8, Inf, 'clockwise');
    if (~isempty(outline))
        outlineCnt = outlineCnt + 1;
        outlines{outlineCnt} = outline;
        outlineLengths = [outlineLengths length(outline)];
    end
end

% Getting the maximum outline
[maxVal index] = max(outlineLengths);
outline = outlines{index};
end