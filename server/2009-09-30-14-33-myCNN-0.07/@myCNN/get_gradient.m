function g = get_gradient(net)
% method G = GET_GRADIENT(NET)
% returns gradient of the error with respect to of all
% trainable parameters of the network NET as a column vector
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   G               - gradient (as a column vector)
%
% GET_GRADIENT is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    g = [];
    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable,
            continue,
        end
        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end
            g = [g; net.layer(l_i).FM(FM_i).db]; %#ok<*AGROW>

            % adapt weights
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if net.layer(l_i).FM(FM_i).in(in_i).trainable,
                    g = [g; net.layer(l_i).FM(FM_i).in(in_i).RF.dw(:)];
                end % of trainable condition
            end % of input loop
        end % of FM loop
    end % of layer loop

end % of method GET_GRADIENT