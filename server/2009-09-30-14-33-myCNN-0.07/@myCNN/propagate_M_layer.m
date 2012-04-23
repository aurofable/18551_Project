function net = propagate_M_layer(net, l_i)
% method net = PROPAGATE_M_LAYER(NET, L_I)
% propagates information through a softmax (M-) layer.
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% PROPAGATE_M_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-23

    for FM_i = 1:net.layer(l_i).n_FMs,

        s = zeros(net.datatype);

        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

%             [ux ur uc]  = unfold2(net.layer(src_layer).FM(src_FM).out.x, ...
%                                   net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
%                                   net.layer(l_i).FM(FM_i).in(in_i).RF.stride);
            ux = unfold(net.layer(src_layer).FM(src_FM).out.x, ...
                         net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                         net.layer(l_i).FM(FM_i).in(in_i).RF.stride);

            % accumulate soft_maxed inputs
%             s = s + reshape(soft_max(ux, net.layer(l_i).FM(FM_i).in(in_i).RF.w), [ur uc]);
            s = s + soft_max(ux, net.layer(l_i).FM(FM_i).in(in_i).RF.w);

        end % of input loop

        net.layer(l_i).FM(FM_i).out.x = s;

    end % of FM loop

end % of method PROPAGATE_M_LAYER