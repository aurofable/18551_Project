% Spring 2012, 18-551 Project
% Server.m

% This file runs a matlab server that
% monitors an image file for changes
% If the image file changes it performs the necessary
% computation on it and transmits it back to the client

clear all;
load svmTrain.mat

receivedFileName = 'received.jpg';
sentFileName = 'sent.jpg';
ansFileName = 'ans.txt';
fclose('all');

running = 1;
fileStats = dir;
fileIndex = 1;
for i = 1:length(fileStats)
    findFile = fileStats(i).name;
    if (strcmp(findFile,receivedFileName) == 1)
        break
    end
    fileIndex = fileIndex + 1;
end
touchtime = fileStats(fileIndex).datenum;

while (running == 1)
    fileStats = dir;
    currTouchTime = fileStats(fileIndex).datenum;
    if (currTouchTime > touchtime)
        % File updated...get to work
        disp('File Received!');
        disp('Processing...');
        touchtime = currTouchTime;
        ansFile = fopen(ansFileName, 'wt');
        pause(0.1); % wait a bit just in case its sent slow
        
        img = imread(receivedFileName);
        
        % Processing...
        chars = segment(img);
        ansString = zeros(length(chars), 1);
        for i = 1:length(chars)
            answer = capstoneClassify(chars{i}, svmMatrix, labels);
            ansString(i) = answer
        end
        
        % Post-Processing
        img = im2bw(img); % just for effect
        imwrite(img, sentFileName);
        fprintf(ansFile, '%s', mat2str(ansString));
        fclose(ansFile);
        disp(['Answer:' mat2str(ansString)]);
        disp('Done!');
        disp('');
    end
    pause(0.0001);
end