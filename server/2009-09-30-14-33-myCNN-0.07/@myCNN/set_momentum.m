function net = set_momentum(net, momentum)
% method NET = SET_MOMENTUM(NET, MOMENTUM)
% sets momentum (learning inertia parameter) of network NET.
%
% INPUT:
%   NET             - myCNN object
%   MOMENTUM        - new momentum
%
% OUTPUT:
%   NET             - modified version of NET
%
% SET_MOMENTUM is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01

    net.momentum = momentum;

end % of method SET_MOMENTUM