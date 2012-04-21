% 18-551, Spring 2012
% James Chun, jtchun@andrew.cmu.edu
% Capstone Project, getFilterBankFeature

function vec = getFilterBankFeature(img)

% Variables
nFilters = 5;
imageSize = size(img);

% For Gaussian
n = 1; % normalizing factor
sigma = 0.5; % sigma for gaussian

% For Gabor
theta1 = degtorad(0);
theta2 = degtorad(60);
theta3 = degtorad(120);
gamma = 2;
lambda = 0.6;
psi = 0;

% Setting up filter bank
filterBank = cell(nFilters, 1);
filterBank{1} = fspecial('gaussian', imageSize, sigma);
filterBank{2} = fspecial('log', imageSize, sigma);
filterBank{3} = gaborFilter(sigma, theta1, lambda, psi, gamma);
filterBank{4} = gaborFilter(sigma, theta2, lambda, psi, gamma);
filterBank{5} = gaborFilter(sigma, theta3, lambda, psi, gamma);

% Generating Feature Vector
vec = cell(nFilters, 1);
img = reshape(img, 1, numel(img));
for i = 1:nFilters
   vec{i} = imfilter(img, filterBank{i})';
end

% Returning the vector
vec = cell2mat(vec); % column vector
vec = vec';
end