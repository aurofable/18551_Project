function net = adapt_deltas(net)
% method NET = ADAPT_DELTAS(NET)
% adapts deltas of the network
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% ADAPT_DELTAS is a part of a matlab implementation of the extended
% convolutional network.
%
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end
        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            % adapt delta for bias
            net.layer(l_i).FM(FM_i).deltab = ...
                    net.momentum * net.layer(l_i).FM(FM_i).deltab ...
                    + (1-net.momentum) * net.layer(l_i).FM(FM_i).db;

            % loop over inputs to the current feature map
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if ~net.layer(l_i).FM(FM_i).in(in_i).trainable, continue, end

                % adapt deltas for weights
                net.layer(l_i).FM(FM_i).in(in_i).RF.deltaw = ...
                    net.momentum * net.layer(l_i).FM(FM_i).in(in_i).RF.deltaw ...
                    + (1-net.momentum) * net.layer(l_i).FM(FM_i).in(in_i).RF.dw;

            end % of input loop
        end % of FM loop
    end % of layer loop

end % of method ADAPT_DELTAS