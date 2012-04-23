function net = backpropagate_F_layer(net, l_i)
% method NET = BACKPROPAGATE_F_LAYER(NET, L_I)
% propagates first derivatives of the error back through the F-layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKPROPAGATE_F_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for FM_i = 1:net.layer(l_i).n_FMs,
        %% Compute dErr/dy
        % dErr/dy = dErr/dx * dx/dy = dErr/dx * Gx, where Gx = G(x) = dx/dy = dF(y)/dy,
        % and F(.) is transfer(squashing) function: x = F(y)
%         y = net.layer(l_i).FM(FM_i).out.x;

        net.layer(l_i).FM(FM_i).out.Gx = qdsquash_from_squash(net.layer(l_i).FM(FM_i).out.x);
        dY = net.layer(l_i).FM(FM_i).out.Gx .* net.layer(l_i).FM(FM_i).out.dx;
        net.layer(l_i).FM(FM_i).sum.dx = dY;
%         net.layer(l_i).FM(FM_i).out.dy = dY;

        %% Compute db = mean(dY) [dErr/dy]  or sum???
%          net.layer(l_i).FM(FM_i).db = net.layer(l_i).FM(FM_i).db + dY;
        net.layer(l_i).FM(FM_i).db = dY;

        %% For each input [in] into current feature map [FM_i] compute and accumulate
        %  dw = dErr/dw and  dx = dErr/dx of the incoming (wrt current FM) link
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            % get some intermediate values
            src_layer = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM    = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            net.layer(l_i).FM(FM_i).in(in_i).RF.dw = ...
                net.layer(l_i).FM(FM_i).in(in_i).RF.dw + ...
                net.layer(src_layer).FM(src_FM).out.x * dY;

            if net.layer(src_layer).type == 'I', continue, end

            net.layer(src_layer).FM(src_FM).out.dx = ...
                net.layer(src_layer).FM(src_FM).out.dx + ...
                net.layer(l_i).FM(FM_i).in(in_i).RF.w * dY;
        end % of input loop
    end % of FM loop

end % of method BACKPROPAGATE_F_LAYER