function [W,b] = convert_Wb ( Wb, n )
% function [W,b] = convert_Wb ( Wb, n )
% This function converts the column vector Wb into structures with
% weights (W) and biases (b).
%
% INPUTS: Wb -- a column vector contains all the weights and
%               biases for the autoencoder
%         n -- a vector of length d containing the dimensions
%         of the autoencoder
%
% OUTPUTS: W -- a struct with W{1}, ..., W{(d-1)*2} containing
%               the weights for the autoencoder
%          b -- a struct with b{1}, ..., b{(d-1)*2} containing
%               the biases for the autoencoder
%
% S. Martin
% 3/30/2007

num_levels = length(n);

% get weights and biases for forward map
W_ind = 0;
for level = 2:num_levels
    W{level-1} = reshape ( Wb ((W_ind+1) : ...
        (W_ind+n(level)*n(level-1))), ...
        n(level),n(level-1) );
    b_ind = W_ind + n(level-1)*n(level);
    b{level-1} = reshape ( Wb ((b_ind+1) : ...
        (b_ind+n(level))), n(level), 1 );
    W_ind = W_ind + n(level)*n(level-1) + n(level);
end

% get weights and biases for inverse map
for level = num_levels:-1:2
    W{2*num_levels-level} = reshape ( Wb ((W_ind+1) : ...
        (W_ind+n(level)*n(level-1))), ...
        n(level-1),n(level) );
    b_ind = W_ind + n(level)*n(level-1);
    b{2*num_levels-level} = reshape ( Wb ((b_ind+1) : ...
        (b_ind+n(level-1))), n(level-1), 1 );   
    W_ind = W_ind + n(level)*n(level-1) + n(level-1);
end


