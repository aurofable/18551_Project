function [ce_err, ce_diff] = cross_entropy ( Wb, n, X );
% function [ce_err, ce_diff] = cross_entropy ( Wb, n, X )
% This function computes cross entropy error and back propagation
% derivatives for using in training a neural network.
%
% INPUTS: Wb -- column vector containing parameters of neural
%               network, as specified in the readme.txt file
%         n -- auto-encoder dimensions, including input dimension
%         X -- data with points as columns
%
% OUTPUTS: ce_err -- column vector containing cross entropy error
%          ce_diff -- column vector containing back propagation
%                     derivatives for use by optimizer
%
% S. Martin
% 3/30/2007

% first lets convert to structures with weights and biases
[W,b] = convert_Wb ( Wb, n );

% compute function at all layers in autoencoder -- store in AE_map
num_maps = length(n)-1;
N = size(X,2);

% do forward map (all logistic units except for the final map)
AE_vals{1} = X;

% do logistic unit levels
for level = 1:(num_maps-1)
    AE_vals{level+1} = 1./(1+exp(-W{level}*AE_vals{level} - ...
        repmat(b{level},1,N)));
end

% do linear level
AE_vals{num_maps+1} = W{num_maps}*AE_vals{num_maps} + ...
    repmat(b{num_maps},1,N);
    
% do inverse map (all logistic units)
for level = (num_maps+1):(2*num_maps)
    AE_vals{level+1} = 1./(1+exp(-W{level}*AE_vals{level} - ...
        repmat(b{level},1,N)));
end

% compute cross entropy error
ce_err = -1/N*sum(sum(X.*log(AE_vals{end}) + (1-X).*log(1-AE_vals{end})));

% compute backpropagation derivatives

% initialize
delta = 1/N*((1-X).*AE_vals{end} - X.*(1-AE_vals{end}));
dWb_mat = delta*[AE_vals{2*num_maps}', ones(N,1)];
dWb{2*num_maps} = dWb_mat(:);

% go up to linear map
for map = (2*num_maps-1):-1:(num_maps+1)
    delta = (W{map+1}'*delta).* ...
        AE_vals{map+1}.*(1-AE_vals{map+1});
    dWb_mat = delta*[AE_vals{map}', ones(N,1)];
    dWb{map} = dWb_mat(:);
end

% do linear map
delta = W{num_maps+1}'*delta;
dWb_mat = delta*[AE_vals{num_maps}', ones(N,1)];
dWb{num_maps} = dWb_mat(:);

% finish all maps
for map = (num_maps-1):-1:1
    delta = (W{map+1}'*delta).* ...
        AE_vals{map+1}.*(1-AE_vals{map+1});
    dWb_mat = delta*[AE_vals{map}', ones(N,1)];
    dWb{map} = dWb_mat(:);
end

% return ce_diff
ce_diff = cat(1,dWb{:});