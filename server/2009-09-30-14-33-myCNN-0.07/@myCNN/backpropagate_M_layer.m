function net = backpropagate_M_layer(net, l_i)
% method NET = BACKPROPAGATE_M_LAYER(NET, L_I)
% propagates first derivatives of the error back through a M-layer
%
% INPUT:
%   NET             - myCNN object
%   L_I             - layer index
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKPROPAGATE_M_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-28
    
    for FM_i = 1:net.layer(l_i).n_FMs,

        % We don't (yet) consider squashing in the M-layer, so...
        dY  = net.layer(l_i).FM(FM_i).out.dx;

        %% For each input [in] into current feature map [FM_i] compute and
        %  accumulate dw = dErr/dw and  dx = dErr/dx of the incoming (wrt
        %  current FM) connection
        
        for in_i = 1:net.layer(l_i).FM(FM_i).n_in,

            % get input layer and feature map indices
            src_layer   = net.layer(l_i).FM(FM_i).in(in_i).src_layer;
            src_FM      = net.layer(l_i).FM(FM_i).in(in_i).src_FM;

            [ux ur uc]  = unfold2(  net.layer(src_layer).FM(src_FM).out.x, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.size, ...
                                    net.layer(l_i).FM(FM_i).in(in_i).RF.stride );
             % assert( ur == size(dY, 1) && uc == size(dY, 2) )
            
            [mux dx dw] = soft_max(ux, net.layer(l_i).FM(FM_i).in(in_i).RF.w); %#ok<ASGLU>
            
            % current input parameter derivative update
            net.layer(l_i).FM(FM_i).in(in_i).RF.dw = sum(dw(:));

            if net.layer(src_layer).type == 'I', continue, end

            row_stride  = net.layer(l_i).FM(FM_i).in(in_i).RF.stride(1);
            col_stride  = net.layer(l_i).FM(FM_i).in(in_i).RF.stride(2);
            RF_rows     = net.layer(l_i).FM(FM_i).in(in_i).RF.size(1);
            RF_cols     = net.layer(l_i).FM(FM_i).in(in_i).RF.size(2);
            src_dx      = net.layer(src_layer).FM(src_FM).out.dx;

            slice_i = 1;
            c_off = 0;
            for c = 1:uc,
                RF_cols_range = c_off+1:c_off+RF_cols;
                r_off = 0;
                for r = 1:ur,
                    RF_rows_range = r_off+1:r_off+RF_rows;
                    src_dx(RF_rows_range, RF_cols_range) = ...
                        src_dx(RF_rows_range, RF_cols_range) + dx(:,:,slice_i)*dY(r,c);
                    slice_i = slice_i + 1;
                    r_off = r_off + row_stride;
                end % dY rows loop
                c_off = c_off + col_stride;
            end % dY cols loop
            
            net.layer(src_layer).FM(src_FM).out.dx = src_dx;
            
        end % of input loop
    end % of FM loop

end % of method backpropagate_M_layer