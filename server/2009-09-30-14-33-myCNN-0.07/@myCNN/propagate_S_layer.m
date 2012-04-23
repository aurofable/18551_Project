function net = propagate_S_layer(net, l_i)
% method net = PROPAGATE_S_LAYER(NET, L_I)
% propagates information through the S-layer.
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% PROPAGATE_S_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for FM_i = 1:net.layer(l_i).n_FMs,

        s = zeros(1, net.datatype);

        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            % get some intermediate values
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            % accumulate subsampled inputs
            s = s + subsample2( net.layer(src_layer).FM(src_FM).out.x, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.stride);
        end % of input loop

        net.layer(l_i).FM(FM_i).sub.x = s; % this is important only for S-layer
        net.layer(l_i).FM(FM_i).sum.x = s * net.layer(l_i).FM(FM_i).in(in_i).RF.w + net.layer(l_i).FM(FM_i).b;
        net.layer(l_i).FM(FM_i).out.x = qsquash(net.layer(l_i).FM(FM_i).sum.x);

    end % of FM loop

end % of method PROPAGATE_S_LAYER