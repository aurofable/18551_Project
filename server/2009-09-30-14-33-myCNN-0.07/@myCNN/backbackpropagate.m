function net = backbackpropagate(net)
% method NET = BACKBACKPROPAGATE(NET)
% propagates second derivatives of the error back through the network
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKBACKPROPAGATE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01

    if (~net.n_out_FMs) || (isempty(net.out_FMs)),
        error('Can''t find output feature maps!')
    end

    %% Set up dE2_wrt_d2x for output FMs of the output layers
    for oFM_i = 1:net.n_out_FMs,
        ol  = net.out_FMs(1,oFM_i);  % layer index of output FM
        oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of output FM
        net.layer(ol).FM(oFM).out.ddx = ones(net.layer(ol).FM(oFM).out.size, net.datatype);
    end % of out FM

    % backbackpropagate and accumulate
    for l_i = net.n_layers:-1:1,
        switch net.layer(l_i).type
            case 'S', net = backbackpropagate_S_layer(net, l_i);
            case 'C', net = backbackpropagate_C_layer(net, l_i);
            case 'F', net = backbackpropagate_F_layer(net, l_i);
            case 'M', net = backbackpropagate_M_layer(net, l_i);
        end % of layer type switch
    end % layer backbackpropagation loop

end % of method BACKBACKPROPAGATE