function net = forget_derivatives(net)
% method NET = FORGET_DERIVATIVES(NET)
% clears backpropagation data (first derivatives) of the network NET
%
% INPUT
%   NET             - myCNN object
%
% OUTPUT
%   NET             - updated version of NET
%
% FORGET_DERIVATIVES is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-23

    for l_i = 1:net.n_layers,
        if net.layer(l_i).type ~= 'I',
            for FM_i = 1:net.layer(l_i).n_FMs,
                net.layer(l_i).FM(FM_i).db      = zeros(1, net.datatype);
                net.layer(l_i).FM(FM_i).out.dx  = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);
                net.layer(l_i).FM(FM_i).sum.dx  = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);

                if net.layer(l_i).type == 'S',
                    net.layer(l_i).FM(FM_i).sub.dx  = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);
                end

                for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                    net.layer(l_i).FM(FM_i).in(in_i).RF.dw = zeros(size(net.layer(l_i).FM(FM_i).in(in_i).RF.w), net.datatype);

                end % of FM's input loop
            end % of FM loop
        end % input layer check
    end % of layer loop

end % of method FORGET_DERIVATIVES