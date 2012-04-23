function net = backpropagate_S_layer(net, l_i)
% method NET = BACKPROPAGATE_S_LAYER(NET, L_I)
% propagates first derivatives of the error back through the S-layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKPROPAGATE_S_LAYER is a part of a matlab implementation of the extended
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
        net.layer(l_i).FM(FM_i).out.Gx = qdsquash_from_squash(net.layer(l_i).FM(FM_i).out.x);
        dY =  net.layer(l_i).FM(FM_i).out.Gx .* net.layer(l_i).FM(FM_i).out.dx;
        net.layer(l_i).FM(FM_i).sum.dx = dY;

        %% Compute db = mean(dY) [dErr/dy]  or sum???
%          net.layer(l_i).FM(FM_i).db = net.layer(l_i).FM(FM_i).db + sum(dY(:));
        net.layer(l_i).FM(FM_i).db = sum(dY(:));

        %% For each input [in] into current feature map [FM_i] compute and accumulate
        %  dw = dErr/dw and  dx = dErr/dx of the incoming (wrt current FM) link
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,

            % get input layer and feature map indices
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            % compute sum of subsampled inputs
            if net.layer(l_i).FM(FM_i).n_in == 1,
                % in the case when number of inputs to the current FM is 1,
                % subsampled input coincides with out.sub
                sub = net.layer(l_i).FM(FM_i).sub.x;
            else
                % in the case when number of inputs to current FM is > 1,
                % sub.x contains sum of all subsampled inputs, so we have to
                % recompute current subsampled input again :(
                sub = subsample2(   net.layer(src_layer).FM(src_FM).out.x, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.stride);
            end

            % current input weight derivative update
            net.layer(l_i).FM(FM_i).in(in_i).RF.dw = sum(sub(:));

            if net.layer(src_layer).type == 'I', continue, end

            net.layer(src_layer).FM(src_FM).out.dx = ...
                net.layer(src_layer).FM(src_FM).out.dx ...
                + oversample2(  dY * net.layer(l_i).FM(FM_i).in(in_i).RF.w, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.stride );

        end % of input loop
    end % of FM loop

end % of method backpropagate_S_layer