function net = forget_ddeltas(net)
% method NET = FORGET_DDELTAS(NET)
% clears backpropagation data (averages of the second derivatives)
% of the network NET.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% FORGET_DDELTAS is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    for l_i = 1:net.n_layers,
        if net.layer(l_i).type ~= 'I',
            for FM_i = 1:net.layer(l_i).n_FMs,
                net.layer(l_i).FM(FM_i).ddeltab  = 0;
                for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                    net.layer(l_i).FM(FM_i).in(in_i).RF.ddeltaw = 0*net.layer(l_i).FM(FM_i).in(in_i).RF.w;
                end % of FM's input loop
            end % of FM loop
        end % input layer check
    end % of layer loop

end % of method FORGET_DDELTAS