% Spring 2012, 18-551 Project
% Classification Script

function answer = capstoneClassify(img, svmMatrix, labels)

votes = zeros(1, length(labels));
features = getHistTextureFeature(img);
for i = 1:size(svmMatrix, 1)
   for j = 1:size(svmMatrix, 2)
        if i == j 
           continue 
        end
        vote = svmclassify(svmMatrix{i, j}, features);
        if (vote == 1)
            votes(i) = votes(i) + 1;
        else votes(j) = votes(j) + 1;
        end
   end
end

[maxVotes index] = max(votes);
votes
answer = labels(index);
end