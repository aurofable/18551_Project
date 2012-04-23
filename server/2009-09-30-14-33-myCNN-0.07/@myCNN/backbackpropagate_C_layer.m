function net = backbackpropagate_C_layer(net, l_i)
% method NET = BACKBACKPROPAGATE_C_LAYER(NET, L_I)
% backpropagates second derivatives through a convolutional layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKBACKPROPAGATE_C_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01

    for FM_i = 1:net.layer(l_i).n_FMs,
        %% Compute d2Err/dy2
        % d2Err/dy2 = d2Err/dx2 * (dx/dy)^2 = d2Err/dx2 * (Gx)^2,
        % where Gx = G(x) = dx/dy = dF(y)/dy, and F(.) is transfer(squashing) function: x = F(y)
        ddY = (net.layer(l_i).FM(FM_i).out.Gx).^2 .* net.layer(l_i).FM(FM_i).out.ddx;
        net.layer(l_i).FM(FM_i).sum.ddx = ddY;
        rddY = rot90(ddY, 2); % rotated ddY (for convolution)
        [ddY_rows ddY_cols] = size(ddY);

        %% Compute ddb = sum(ddY) [d2Err/dy2]
        net.layer(l_i).FM(FM_i).ddb = sum(ddY(:));

        %% For each input [in] into current feature map [FM_i] compute and accumulate
        %  ddw = d2Err/dw2 and ddx = d2Err/dx2 of the incoming (wrt current FM) link
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            % get some intermediate values
            src_layer = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM    = net.layer(l_i).FM(FM_i).in(in_i).src_FM;
            strides   = net.layer(l_i).FM(FM_i).in(in_i).RF.stride;

            % compute convolution
%              c = convn(( net.layer(src_layer).FM(src_FM).out.x).^2, rddY, 'valid');
            c = conv2((net.layer(src_layer).FM(src_FM).out.x).^2, rddY, 'valid');

            net.layer(l_i).FM(FM_i).in(in_i).RF.ddw = ...
                    net.layer(l_i).FM(FM_i).in(in_i).RF.ddw ...
                    + c(1:strides(1):end, 1:strides(2):end, :);

            if net.layer(src_layer).type == 'I', continue, end

            %% Compute dXnm1 = dErr/dx_{n-1} as a reverse convolution dY with ker
            squared_kernel = (net.layer(l_i).FM(FM_i).in(in_i).RF.kernel).^2;

            [ker_rows ker_cols] = size(squared_kernel);
            src_ddx = 0 * net.layer(src_layer).FM(src_FM).out.ddx;
            r_off = 0;
            for r = 1:ddY_rows,
                c_off = 0;
                for c = 1:ddY_cols,
                    src_ddx(r_off+(1:ker_rows), c_off+(1:ker_cols)) = ...
                        src_ddx(r_off+(1:ker_rows), c_off+(1:ker_cols)) + squared_kernel*ddY(r,c);
                    c_off = c_off + strides(2);
                end % dY cols loop
                r_off = r_off + strides(1);
            end % dY rows loop

            net.layer(src_layer).FM(src_FM).out.ddx = net.layer(src_layer).FM(src_FM).out.ddx + src_ddx;
        end % of input loop
    end % of FM loop

end % of method BACKBACKPROPAGATE_C_LAYER