function dH = get_diag_Hessian(net)
% method DH = GET_DIAG_HESSIAN(NET)
% returns estimate of the diagonal of the Hessian of all
% trainable parameters of the network NET as a column vector.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   DH              - diagonal of the Hessian
%
% GET_DIAG_HESSIAN is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    dH = [];
    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end

        for FM_i = 1:net.layer(l_i).n_FMs,

            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            dH = [dH; net.layer(l_i).FM(FM_i).ddb]; %#ok<*AGROW>

            % collect weights
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if net.layer(l_i).FM(FM_i).in(in_i).trainable,
                    dH = [dH; net.layer(l_i).FM(FM_i).in(in_i).RF.ddw(:)];
                end % of trainable condition
            end % of input loop

        end % of FM loop
    end % of layer loop

end % of method GET_DIAG_HESSIAN