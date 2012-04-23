function net = backpropagate_C_layer(net, l_i)
% method NET = BACKPROPAGATE_C_LAYER(NET, L_I)
% propagates first derivatives of the error back through the C-layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKPROPAGATE_C_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-07

    for FM_i = 1:net.layer(l_i).n_FMs,
        %% Compute dY = dErr/dy
        % dErr/dy = dErr/dx * dx/dy = dErr/dx * Gx, where Gx = G(x) = dx/dy = dF(y)/dy,
        % and F(.) is transfer(squashing) function: x = F(y)
        net.layer(l_i).FM(FM_i).out.Gx = qdsquash_from_squash(net.layer(l_i).FM(FM_i).out.x);
        dY = net.layer(l_i).FM(FM_i).out.Gx .* net.layer(l_i).FM(FM_i).out.dx;
        net.layer(l_i).FM(FM_i).out.dy = dY;
        net.layer(l_i).FM(FM_i).sum.dx = dY;
        [dY_rows dY_cols] = size(dY);
        rdY = rot90(dY, 2);  % dY rotated by 180 degrees

        %% Compute bias gradient db as sum(dY) [dErr/dy]
%          net.layer(l_i).FM(FM_i).db = net.layer(l_i).FM(FM_i).db + sum(dY(:));
        net.layer(l_i).FM(FM_i).db = sum(dY(:));

        %% For each input [in] into current feature map [FM_i] compute and accumulate
        %  dw = dErr/dw and  dx = dErr/dx of the incoming (wrt current FM) link
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
            % get some intermediate values
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;
            row_stride  = net.layer(l_i).FM(FM_i).in(in_i).RF.stride(1);
            col_stride  = net.layer(l_i).FM(FM_i).in(in_i).RF.stride(2);

            % compute generic convolution
%              convolution = convn(net.layer(src_layer).FM(src_FM).out.x, rdY, 'valid');
            convolution = conv2(net.layer(src_layer).FM(src_FM).out.x, rdY, 'valid');

            if col_stride == 1 && row_stride == 1,
                % just to speed up a bit
                net.layer(l_i).FM(FM_i).in(in_i).RF.dw = net.layer(l_i).FM(FM_i).in(in_i).RF.dw + convolution;
            else
                net.layer(l_i).FM(FM_i).in(in_i).RF.dw = ...
                        net.layer(l_i).FM(FM_i).in(in_i).RF.dw ...
                        + convolution(1:row_stride:end, 1:col_stride:end, :);
            end

            if net.layer(src_layer).type == 'I', continue, end

            %% Compute src_dx = dErr/dx_{n-1} as a reverse convolution dY with kernel
            kernel      = net.layer(l_i).FM(FM_i).in(in_i).RF.kernel;
            ker_rows    = net.layer(l_i).FM(FM_i).in(in_i).RF.size(1);
            ker_cols    = net.layer(l_i).FM(FM_i).in(in_i).RF.size(2);
            
            src_dx = net.layer(src_layer).FM(src_FM).out.dx;
            r_off = 0;
            for r = 1:dY_rows,
                ker_rows_range = r_off+1:r_off+ker_rows;
                c_off = 0;
                for c = 1:dY_cols,
                    ker_cols_range = c_off+1:c_off+ker_cols;
                    src_dx(ker_rows_range, ker_cols_range) = ...
                        src_dx(ker_rows_range, ker_cols_range) + kernel.*dY(r,c);                   
                    c_off = c_off + col_stride;
                end % dY cols loop
                r_off = r_off + row_stride;
            end % dY rows loop           
            
            net.layer(src_layer).FM(src_FM).out.dx = src_dx;
            
        end % of input loop
    end % of FM loop

end % of method BACKPROPAGATE_C_LAYER