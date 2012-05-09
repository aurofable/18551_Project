% 18-551 Spring 2012
% Alex Baran

% Multiple MACE generator

function H = MACEfilterALL(dataArr, numFil, d1, d2, type)

% dataArr = imgDataTrain;
% numFil = 62;
% d1 = 32;
% d2 = 32;

H = cell(numFil,1);
% u = (-1)*ones(24,1);
u = ones(12, 1);

for i = 1:numFil
    selection = dataArr{i};
    % trainings = cell(326,1);
    trainings = {};
    trainings = cat(1, trainings, filter_test(selection, 1));
    
%     for j = 1:numFil
%         if i ~= j
%             selN = dataArr{5, j};
%             tOut = filter_test(selN, 0);
%             trainings = cat(1, trainings, tOut);
%         end
%     end
    
    numTrain = length(trainings);
    if type == 1
        hr = MACEfilterIN(trainings, numTrain, d1, d2, u);
    end
    if type == 2
        hr = FGDSfilterIN(trainings, numTrain, d1, d2, u);
    end
    if type == 4
        hr = OTSDFfilterIN(trainings, numTrain, d1, d2, u);
    end
    H{i} = hr;
end


