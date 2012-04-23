function net = adapt_net(net)
% method NET = ADAPT_NET(NET)
% adapts all trainable parameters of the network.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% ADAPT_NET is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-23

    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end
        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

            % adapt bias
            net.layer(l_i).FM(FM_i).b = ...
                net.layer(l_i).FM(FM_i).b ...
                - net.layer(l_i).FM(FM_i).b_mu .* net.layer(l_i).FM(FM_i).deltab;

            % loop over inputs to the current feature map
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                if ~net.layer(l_i).FM(FM_i).in(in_i).trainable, continue, end

                % adapt weights
                net.layer(l_i).FM(FM_i).in(in_i).RF.w = ...
                    net.layer(l_i).FM(FM_i).in(in_i).RF.w ...
                    - net.layer(l_i).FM(FM_i).in(in_i).RF.w_mu .* net.layer(l_i).FM(FM_i).in(in_i).RF.deltaw;

                if net.layer(l_i).type == 'S',
                    net.layer(l_i).FM(FM_i).in(in_i).RF.kernel = ...
                        ones(net.layer(l_i).FM(FM_i).in(in_i).RF.size) * net.layer(l_i).FM(FM_i).in(in_i).RF.w;
                else
                    net.layer(l_i).FM(FM_i).in(in_i).RF.kernel = net.layer(l_i).FM(FM_i).in(in_i).RF.w;
                end
                net.layer(l_i).FM(FM_i).in(in_i).RF.rkernel = rot90(net.layer(l_i).FM(FM_i).in(in_i).RF.kernel, 2);

            end % of input loop
        end % of FM loop
    end % of layer loop

end % of method ADAPT_NET