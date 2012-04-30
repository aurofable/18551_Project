function [Y, W, b, c, train_error] = train_RBM ( X, num_hid, ...
    lin_flag, num_iter, epsilon, batch_size, rand_seed );
% function [Y, W, b, c, train_error] = ...
%   train_RBM ( X, num_hid, lin_flag, num_iter, epsilon, ...
%               batch_size, rand_seed );
% This function trains a Restricted Boltzmann Machine using
% 1-step contrastive divergence.
%
% INPUTS: X -- a D by N matrix of data, where N is the number
%              of samples, and D is the dimension
%         num_hid -- the number of hidden nodes in the RBM,
%                    aka the reduced dimension
%         lin_flag -- the unit function (logistic=0 or linear=1)
%         num_iter -- the number of iterations in the optimization
%         epsilon -- a structure with the following fields
%                    .conv -- a vector with 4 entries
%                             (1) epsilonw: rate for weights
%                             (2) epsilonb: rate for visible biases
%                             (3) epsilonc: rate for hidden biases
%                             (4) weightcost: rate for old weights
%                    .momentum -- a vector with 2 entries
%                             (1) initial momentum
%                             (2) final momentum
%         batch_size -- the size of a batch (must be a factor of N)
%                       to use in the optimization (optional, with
%                       default 1 batch)
%         rand_seed -- if present seed rand number generator
%                      (otherwise seed is left unaltered)
%
% OUTPUTS: Y -- lower dimensional representation, with point as columns
%          W, b, c -- weights and biases for visible and hidden nodes,
%                     W is D' by D, where D' is the reduced dimension
%                     b is D by 1, the biases for the inverse map
%                     c is D' by 1, the biases for the forward map
%          train_error -- total error per iteration
%          
% S. Martin
% 4/4/2007

% constrastive divergence goes from X0 -> Y0 -> X1 -> Y1 to obtain
% 1 step in a Markov chain.  From this chain, the updates are calculated
% to minimize energy, according to the formula described in (Hinton
% & Salakhutdinov, 2006).

% change from initial to final momentum is a "compile time" parameter
MOMENTUM_THRESHOLD = round(num_iter)/4;

% random seed (if present)
if nargin == 7
    rand('state',rand_seed);
    randn('state',rand_seed);
end

% do we have batches?
[D,N] = size(X);
if nargin >= 6
    num_cases = batch_size;
    num_batches = N/num_cases;
    if num_batches ~= round(num_batches)
        error ('batch_size is not a factor!');
    end
else
    num_cases = N;
    num_batches = 1;
end

% set convergence values
epsilonw      = epsilon.conv(1);  % learning rate for weights 
epsilonb     = epsilon.conv(2);   % learning rate for biases of visible units 
epsilonc     = epsilon.conv(3);   % learning rate for biases of hidden units 
weightcost    = epsilon.conv(4);   

initialmomentum  = epsilon.momentum(1);
finalmomentum    = epsilon.momentum(2);

% initialize weights and biases
W = 0.1*randn(num_hid, D);
b = zeros(D,1);
c = zeros(num_hid,1);

% initialize variables for 1 step constrastive divergence
W_inc  = zeros(num_hid,D);
c_inc = zeros(num_hid,1);
b_inc = zeros(D,1);

% do contrastive divergence
for curr_iter = 1:num_iter
 
    fprintf('Iteration %d ...',curr_iter); 
 
    tot_err = 0;
    for batch = 1:num_batches
        
        % get batch (this is a sample)
        X0 = X(:,(1+(batch-1)*batch_size:batch*batch_size));
        
        % X0 -> Y0
        if lin_flag
            Y0 = W*X0 + repmat(c,1,num_cases);
        else
            Y0 = 1./(1 + exp(-W*X0 -repmat(c,1,num_cases)));    
        end
        
        % sample from forward mapped values (treated as probabilities)
        % sampling here prevents overtraining in this stage
        if lin_flag
            Y0_bool = Y0 + randn(num_hid, num_cases);
        else
            Y0_bool = Y0 > rand(num_hid, num_cases);
        end
  
        % Y0 -> X1
        X1 = 1./(1 + exp(-W'*Y0_bool - repmat(b,1,num_cases)));
        
        % X1 -> Y1
        if lin_flag
            Y1 = W*X1 + repmat(c,1,num_cases);
        else
            Y1 = 1./(1 + exp(-W*X1 - repmat(c,1,num_cases)));
        end

        % compute reconstruction error
        err = sum(sum((X0-X1).^2));
        tot_err = tot_err + err;

        % update momentum
        if curr_iter > MOMENTUM_THRESHOLD,
            momentum=finalmomentum;
        else
            momentum=initialmomentum;
        end
        
        % update weights and biases
        W_inc = momentum*W_inc + ...
                epsilonw*( (Y0*X0'-Y1*X1')/num_cases - weightcost*W);
        b_inc = momentum*b_inc + (epsilonb/num_cases)*(sum(X0,2)-sum(X1,2));
        c_inc = momentum*c_inc + (epsilonc/num_cases)*(sum(Y0,2)-sum(Y1,2));

        W = W + W_inc;
        b = b + b_inc;
        c = c + c_inc;

        % show progress
        fprintf('.');
        
    end
  
    train_error(curr_iter) = tot_err;
    fprintf(' done with error %6.1f.\n', tot_err);
    
end

if nargin == 7
    %%% Reset random seeds 
    rand('state',sum(100*clock)); 
    randn('state',sum(100*clock));
end

% save space for output
Y = zeros (num_hid,num_cases*num_batches);

for batch = 1:num_batches
        
    % get batch (this is a sample)
    X0 = X(:,(1+(batch-1)*batch_size:batch*batch_size));
   
    % X0 -> Y0
    if lin_flag
        Y0 = W*X0 + repmat(c,1,num_cases);
    else
        Y0 = 1./(1 + exp(-W*X0 -repmat(c,1,num_cases)));    
    end
    
    % store forward mapped values
    Y(:,1+(batch-1)*batch_size:batch*batch_size) = Y0;
    
end
