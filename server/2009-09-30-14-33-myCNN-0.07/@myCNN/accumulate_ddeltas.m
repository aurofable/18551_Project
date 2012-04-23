function net = accumulate_ddeltas(net)
% method NET = ACCUMULATE_DDELTAS(NET)
% accumulates second derivatives of deltas over the network.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% ACCUMULATE_DDELTAS is a part of a matlab implementation of the extended
% convolutional network.
%
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01

    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end
        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            % accumulate ddelta for bias
            net.layer(l_i).FM(FM_i).ddeltab = net.layer(l_i).FM(FM_i).ddeltab + net.layer(l_i).FM(FM_i).ddb;

            % loop over inputs to the current feature map
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if ~net.layer(l_i).FM(FM_i).in(in_i).trainable, continue, end

                % accumulate ddeltas for weights
                net.layer(l_i).FM(FM_i).in(in_i).RF.ddeltaw = ...
                    net.layer(l_i).FM(FM_i).in(in_i).RF.ddeltaw ...
                    + net.layer(l_i).FM(FM_i).in(in_i).RF.ddw;

            end % of input loop
        end % of FM loop
    end % of layer loop

end % of method ACCUMULATE_DDELTAS