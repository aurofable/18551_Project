% Spring 2012, 18-551 Project
% Server.m

% This file runs a matlab server that
% monitors an image file for changes
% If the image file changes it performs the necessary
% computation on it and transmits it back to the client

clear all;
running = 1;
fileStats = dir;
touchtime = fileStats(4).datenum;

receivedFileName = 'received.jpg';
sentFileName = 'sent.jpg';
ansFileName = 'ans.txt';
fclose('all');

while (running == 1)
    fileStats = dir;
    currTouchTime = fileStats(4).datenum; %receivedFileName
    if (currTouchTime > touchtime)
        % File updated...get to work
        disp('File Received!');
        disp('Processing...');
        touchtime = currTouchTime;
        ansFile = fopen(ansFileName, 'wt');
        pause(0.1); % wait a bit just in case its sent slow
        
        img = imread(receivedFileName);
        
        % Processing...
        img = im2bw(img);
        
        
        % Post-Processing
        imwrite(img, sentFileName);
        fprintf(ansFile, 'asd==%6.3f', touchtime);
        fclose(ansFile);
        disp('Done!');
        disp('');
    end
    pause(0.0001);
end