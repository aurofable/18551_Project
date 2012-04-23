function W = get_trainable_parameters(net)
% function W = GET_TRAINABLE_PARAMETERS(NET)
% returns all trainable parameters of the network NET as a column vector W
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   W               - all trainable parameters of the NET (as a column vector)
%
% GET_TRAINABLE_PARAMETERS is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    W = [];
    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end

        for FM_i = 1:net.layer(l_i).n_FMs,

            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            W = [W; net.layer(l_i).FM(FM_i).b]; %#ok<*AGROW>

            % collect weights
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if net.layer(l_i).FM(FM_i).in(in_i).trainable,
                    W = [W; net.layer(l_i).FM(FM_i).in(in_i).RF.w(:)];
                end % of trainable condition
            end % of input loop

        end % of FM loop
    end % of layer loop

end % of function GET_TRAINABLE_PARAMETERS