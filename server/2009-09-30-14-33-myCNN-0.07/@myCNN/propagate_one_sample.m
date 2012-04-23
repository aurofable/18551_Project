function [net out] = propagate_one_sample(net, inp)
% function [NET OUT] = PROPAGATE_ONE_SAMPLE(NET, INP)
% propagates one sample INP through the entire network NET.
%
% INPUT:
%   NET             - myCNN object
%   INP             - input data. If NET has several input layers
%                     INP should be cell array, each element of which
%                     corresponds to an input layer of NET.
%
% OUTPUT:
%   NET             - modified version of NET
%   OUT             - output of the network
%
% PROPAGATE_ONE_SAMPLE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    if net.n_inp_FMs == 1,
        net.layer(net.inp_FMs(1,1)).FM(net.inp_FMs(2,1)).out.x = inp;
    elseif net.n_inp_FMs > 1,
        for iFM_i = 1:net.n_inp_FMs,
            il  = net.inp_FMs(1,iFM_i);  % layer index of input FM
            iFM = net.inp_FMs(2,iFM_i);  % FM number (in layer) of input FM
            net.layer(il).FM(iFM).out.x = inp{iFM_i};
        end % of input FM loop
    else
        error('WTF? The net does not have inputs?!?')
    end

    for l_i = 1:net.n_layers,
        switch net.layer(l_i).type,
            case 'C', net = propagate_C_layer(net, l_i);
            case 'S', net = propagate_S_layer(net, l_i);
            case 'F', net = propagate_F_layer(net, l_i);
            case 'M', net = propagate_M_layer(net, l_i);
        end % of layer type switch
    end % of layer loop

    if nargout>1,
        if net.out_FM_equally_sized,
            for oFM_i = 1:net.n_out_FMs,
                ol  = net.out_FMs(1,oFM_i);  % layer index of out FM
                oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of out FM
                out(:,:,oFM_i) = net.layer(ol).FM(oFM).out.x; %#ok<AGROW>
            end % of out FM loop
        else
            for oFM_i = 1:net.n_out_FMs,
                ol  = net.out_FMs(1,oFM_i);  % layer index of out FM
                oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of out FM
                out{oFM_i} = net.layer(ol).FM(oFM).out.x; %#ok<AGROW>
            end % of out FM loop
        end
    end % of output arguments check

end % of function PROPAGATE_ONE_SAMPLE