function net = compute_learning_rates(net)
% method NET = COMPUTE_LEARNING_RATES(NET)
% computes learning rates (mu) for all trainable parameters.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% COMPUTE_LEARNING_RATES is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end

        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            % compute learning rate for bias
            net.layer(l_i).FM(FM_i).b_mu  = net.eta / (net.nu + net.layer(l_i).FM(FM_i).ddeltab);

            % compute learning rate matrices for weights
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if ~net.layer(l_i).FM(FM_i).in(in_i).trainable, continue, end

                % compute learning rate matrix for weights
                net.layer(l_i).FM(FM_i).in(in_i).RF.w_mu = ...
                        net.eta ./ (net.nu + net.layer(l_i).FM(FM_i).in(in_i).RF.ddeltaw);
            end % of input loop
        end % of FM loop
    end % of layer loop

end % of method COMPUTE_LEARNING_RATES