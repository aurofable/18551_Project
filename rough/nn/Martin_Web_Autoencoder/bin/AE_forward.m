function Y = AE_forward ( X, Wb, n, batch_size );
% function Y = AE_forward ( X, Wb, n, batch_size );
% This function performs the forward (encoder) map for an autoencoder.
% 
% INPUTS: X -- D by N data matrix, with points as columns
%         Wb -- vector containing autoencoder parameters (see notes
%               in readme.txt).
%         n -- vector with autoencoder layer sizes (including original
%              data dimension).
%         batch_size -- size of batches to use (optional -- default
%                       is one batch with all data)
%
% OUTPUTS: Y -- D' by N data matrix, with points as columns
%               (reduced dimension representation).
%
% S. Martin
% 3/29/2007

% do we split the dataset into batches?
N = size(X,2);
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

% do forward map on batches (all logistic units except for
% the final map)

num_maps = length(n)-1;
for curr_batch = 1:num_batches
    
    % get current batch
    curr_data = X(:,(1+(curr_batch-1)*num_cases):(curr_batch*num_cases));
    
    % do logistic unit levels
    for level = 1:(num_maps-1)
        curr_data = 1./(1+exp(-W{level}*curr_data - ...
            repmat(b{level},1,num_cases)));
    end

    % do linear level
    curr_data = W{num_maps}*curr_data + ...
        repmat(b{num_maps},1,num_cases);
    
    % save results as output
    Y(:,(1+(curr_batch-1)*num_cases):(curr_batch*num_cases)) = curr_data;
    
end
    