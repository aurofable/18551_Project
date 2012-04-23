function net = backbackpropagate_S_layer(net, l_i)
% method NET = BACKBACKPROPAGATE_S_LAYER(NET, L_I)
% backpropagates second derivatives through subsampling (S-) layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKBACKPROPAGATE_S_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-08-25

    for FM_i = 1:net.layer(l_i).n_FMs,
        %% Compute d2Err/dy2
        % d2Err/dy2 = d2Err/dx2 * (dx/dy)^2 = d2Err/dx2 * (Gx)^2,
        % where Gx = G(x) = dx/dy = dF(y)/dy, and F(.) is transfer(squashing) function: x = F(y)
        ddY = (net.layer(l_i).FM(FM_i).out.Gx).^2 .* net.layer(l_i).FM(FM_i).out.ddx;
        net.layer(l_i).FM(FM_i).sum.ddx = ddY;

        %% Compute ddb = sum(ddY) [d2Err/dy2]
        net.layer(l_i).FM(FM_i).ddb = sum(ddY(:));

        %% For each input [in] into current feature map [FM_i] compute and accumulate
        %  ddw = d2Err/dw2 and ddx = d2Err/dx2 of the incoming (wrt current FM) link
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,

            % get input layer and feature map indices
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            % compute sum of squares of subsampled inputs
            if net.layer(l_i).FM(FM_i).n_in == 1,
                % in the case when number of inputs to the current FM equals 1,
                % subsampled input coincides with out.sub
                sub_x2 = net.layer(l_i).FM(FM_i).sub.x .^ 2;
            else
                % in the case when number of inputs to current FM equals 1,
                % out.sub contains sum of all subsampled inputs, so we have to
                % recompute current subsampled input again :(
                sub_x2 = subsample2(net.layer(src_layer).FM(src_FM).out.x.^2, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.stride);
            end

            update = sub_x2 .* ddY;
            % current input weight second derivative update
            net.layer(l_i).FM(FM_i).in(in_i).RF.ddw = ...
                net.layer(l_i).FM(FM_i).in(in_i).RF.ddw ...
                + sum(update(:));

            if net.layer(src_layer).type == 'I', continue, end

            net.layer(src_layer).FM(src_FM).out.ddx = ...
                net.layer(src_layer).FM(src_FM).out.ddx ...
                + oversample2(  ddY * net.layer(l_i).FM(FM_i).in(in_i).RF.w^2, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                net.layer(l_i).FM(FM_i).in(in_i).RF.stride );

        end % of input loop
    end % of FM loop

end % of method BACKBACKPROPAGATE_S_LAYER