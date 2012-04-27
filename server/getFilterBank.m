% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% Function to generate filter bank

function filterBank = getFilterBank(reducFact)

% Creating the filter bank
% Variables
nFilters = 5;
filterSize = 128*reducFact;

% For Gaussian
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
filterBank{1} = fspecial('gaussian', filterSize*filterSize, sigma);
filterBank{2} = fspecial('log', filterSize*filterSize, sigma);
filterBank{3} = gaborFilter(sigma, theta1, lambda, psi, gamma);
filterBank{4} = gaborFilter(sigma, theta2, lambda, psi, gamma);
filterBank{5} = gaborFilter(sigma, theta3, lambda, psi, gamma);
end