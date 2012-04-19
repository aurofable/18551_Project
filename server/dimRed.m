% Spring 2012, 18-551 Project
% Dimensionality Reduction using PCA

function dataSet = dimRed(data, n)
% Assume that data is formatted as follows
% rows -> observations
% cols -> features

% PCA
[v d] = eig(cov(data));
d = rot90(d,2);
v = fliplr(v);



end