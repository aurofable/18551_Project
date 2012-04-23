function net = init_net(net, v, p)
% method NET = INIT_NET(NET, V, P)
% random initialization of the trainable parameters of the network NET.
%
% INPUT:
%   NET             - myCNN object
%   V               - parameter of wheight initialization [by default 1]
%   P               - parameter of wheight initialization [by default 2]
%
% OUTPUT:
%   NET             - updated version of NET
%
% INIT_NET is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-23

    if ~exist('v', 'var') || isempty(v), v = 1; end
    if ~exist('p', 'var') || isempty(p), p = 2; end

    ustd = 1 / sqrt(3);  % std of a random variable uniformly distributed in [-1; 1]  [ sqrt((1-(-1))^2/12) ]

    for l_i = 1:net.n_layers,
        if ~net.layer(l_i).trainable, continue, end
        for FM_i = 1:net.layer(l_i).n_FMs,
            if ~net.layer(l_i).FM(FM_i).trainable, continue, end

%             % initialization constant for current FM
%             c = v / net.layer(l_i).FM(FM_i).fan_in^(1/p);

            % init bias
            net.layer(l_i).FM(FM_i).b = 0; % LeCun does the same
            
            % initialization constant for the current input in of FM
            s = v / net.layer(l_i).FM(FM_i).fan_in^(1/p);

            % init weights (if necessary)
            for in_i = 1:net.layer(l_i).FM(FM_i).n_in,
                
%                 c = v / net.layer(l_i).FM(FM_i).in(in_i).fan_in^(1/p);

                if net.layer(l_i).FM(FM_i).in(in_i).trainable,
                    switch net.layer(l_i).type,
                    case 'S',

                        net.layer(l_i).FM(FM_i).in(in_i).RF.w = v / (prod(net.layer(l_i).FM(FM_i).in(in_i).RF.stride))^(1/p);
%                         net.layer(l_i).FM(FM_i).in(in_i).RF.w = s * (2*rand - 1);
%                         net.layer(l_i).FM(FM_i).in(in_i).RF.w = c * (2*rand-1)/ustd; % ????

                        net.layer(l_i).FM(FM_i).in(in_i).RF.kernel = ...
                            net.layer(l_i).FM(FM_i).in(in_i).RF.w * ones(net.layer(l_i).FM(FM_i).in(in_i).RF.size);

                    case {'C', 'F'},

                        net.layer(l_i).FM(FM_i).in(in_i).RF.w = ...
                             s * (2*rand(net.layer(l_i).FM(FM_i).in(in_i).RF.size) - 1);
%                         net.layer(l_i).FM(FM_i).in(in_i).RF.w = ...
%                              c * (2*rand(net.layer(l_i).FM(FM_i).in(in_i).RF.size)-1)/ustd;

                        net.layer(l_i).FM(FM_i).in(in_i).RF.kernel = net.layer(l_i).FM(FM_i).in(in_i).RF.w;

                    end % of layer type switch

                    net.layer(l_i).FM(FM_i).in(in_i).RF.rkernel = ...
                        rot90(net.layer(l_i).FM(FM_i).in(in_i).RF.kernel, 2);
                end % of trainable condition
            end % of input loop

        end % of FM loop
    end % of layer loop

end % of method INIT_NET