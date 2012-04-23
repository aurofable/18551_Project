function net = forget_second_derivatives(net)
% method NET = FORGET_SECOND_DERIVATIVES(NET)
% clears backpropagation data (second derivatives) of the network NET
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% FORGET_SECOND_DERIVATIVES is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for l_i = 1:net.n_layers,
        if net.layer(l_i).type ~= 'I',
            for FM_i = 1:net.layer(l_i).n_FMs,
                net.layer(l_i).FM(FM_i).ddb     = zeros(size(net.layer(l_i).FM(FM_i).ddb), net.datatype);
                net.layer(l_i).FM(FM_i).out.ddx = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);
%                 net.layer(l_i).FM(FM_i).out.ddy = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);
                net.layer(l_i).FM(FM_i).sum.ddx = zeros(net.layer(l_i).FM(FM_i).out.size, net.datatype);
                for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                    net.layer(l_i).FM(FM_i).in(in_i).RF.ddw = ....
                        zeros(size(net.layer(l_i).FM(FM_i).in(in_i).RF.w), net.datatype);
                end % of FM's input loop
            end % of FM loop
        end % input layer check
    end % of layer loop

end % of method FORGET_SECOND_DERIVATIVES