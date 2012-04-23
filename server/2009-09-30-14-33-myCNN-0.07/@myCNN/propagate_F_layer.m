function net = propagate_F_layer(net, l_i)
% method NET = PROPAGATE_F_LAYER(NET, L_I)
% propagates information through the F-layer.
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% PROPAGATE_F_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for FM_i = 1:net.layer(l_i).n_FMs,
        s = single(0);
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            % get some intermediate values
            src_layer = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM    = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            s = s + net.layer(src_layer).FM(src_FM).out.x * ...
                    net.layer(l_i).FM(FM_i).in(in_i).RF.w;

        end % of input loop

        net.layer(l_i).FM(FM_i).sum.x = s + net.layer(l_i).FM(FM_i).b;
        net.layer(l_i).FM(FM_i).out.x = qsquash(net.layer(l_i).FM(FM_i).sum.x);

    end % of FM loop

end % of method PROPAGATE_F_LAYER