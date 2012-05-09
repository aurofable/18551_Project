function X = AE_inverse ( Y, Wb, n, batch_size );
% function X = AE_inverse ( Y, Wb, n, batch_size );
% This function performs the inverse (decoder) map for an autoencoder.
% 
% INPUTS: Y -- D' by N data matrix, with points as columns
%         Wb -- vector containing autoencoder parameters (see notes
%               in readme.txt).
%         n -- vector with autoencoder layer sizes (including original
%              data dimension).
%         batch_size -- size of batches to use (optional -- default
%                       is one batch with all data)
%
% OUTPUTS: X -- D by N data matrix, with points as columns
%               (original dimension representation).
%
% S. Martin
% 3/29/2007

% do we split the dataset into batches?
N = size(Y,2);
if nargin == 4
    num_cases = batch_size;
    num_batches = N/num_cases;
    if num_batches ~= round(num_batches)
        error ('batch_size is not a factor!');
    end
else
    num_cases = N;
    num_batches = 1;
end

% get weights and biases
[W,b] = convert_Wb ( Wb, n );

% do inverse map on batches (all logistic units)
X = zeros(n(1),N);   % reserve space
num_maps = length(n)-1;
for curr_batch = 1:num_batches
    
    % get current batch
    curr_data = Y(:,(1+(curr_batch-1)*num_cases):(curr_batch*num_cases));
    
    % do logistic unit levels
    for level = (num_maps+1):(2*num_maps)
        curr_data = 1./(1+exp(-W{level}*curr_data - ...
            repmat(b{level},1,num_cases)));
    end
    
    % save results as output
    X(:,(1+(curr_batch-1)*num_cases):(curr_batch*num_cases)) = curr_data;
    
end

