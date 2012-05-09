% Spring 2012, 18-551 Project
% Server.m

% This file runs a matlab server that
% monitors an image file for changes
% If the image file changes it performs the necessary
% computation on it and transmits it back to the client

clear all;

% Options
usingTemplate = 0;
usingSVM_Nums = 0;
usingSVM_Char = 1;
usingSVM_NumsChar = 0; % Broken

% Loading necessary Data
if (usingTemplate == 1)
    load CF_test1Data.mat
elseif (usingSVM_Nums == 1)
    load SVMTrainNums.mat
elseif (usingSVM_Char == 1)
    load SVMTrainChar.mat
elseif (usingSVM_NumsChar == 1)
    load SVMTrainNumsChar.mat
else return
end

receivedFileName = 'received.jpg';
sentFileName = 'sent.jpg';
ansFileName = 'ans.txt';
fclose('all');

running = 1;
fileStats = dir;
fileIndex = 0;
for i = 1:length(fileStats)
    fileIndex = fileIndex + 1;
    findFile = fileStats(i).name;
    if (strcmp(findFile,receivedFileName) == 1)
        break
    end
end
touchtime = fileStats(fileIndex).datenum;
disp('Server ready');

while (running == 1)
    fileStats = dir;
    currTouchTime = fileStats(fileIndex).datenum;
    if (currTouchTime > touchtime)
        % File updated...get to work
        disp('File Received!');
        disp('Processing...');
        touchtime = currTouchTime;
        ansFile = fopen(ansFileName, 'wt');
        pause(0.5); % wait a bit just in case its sent slow
        
        img = imread(receivedFileName);
        
        % Processing...
        [charsBW charsGray ave stdev] = segment(img);
        if (usingTemplate == 1)
            answer = CF_classify(charsBW, H);
        else
            answer = capstoneClassify(charsBW, charsGray, dim, labels, reducFact, nVecs, model, rowDiv, colDiv, nHarmonics, ranges, minimums);
        end
               
        % Post-Processing
        procImg = drawBoundingBoxes(img, ave, stdev);
        imwrite(procImg, sentFileName);
        fprintf(ansFile, '%s', mat2str(answer));
        fclose(ansFile);
        disp(['Answer:' mat2str(answer)]);
        disp('Done!');
        disp('');
    end
    pause(0.0001);
end