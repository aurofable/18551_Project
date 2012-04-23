function net = set_global_learning_rate(net, eta)
% method NET = SET_GLOBAL_LEARNING_RATE(NET, ETA)
% sets global learning rate for network NET.
%
% INPUT:
%   NET             - myCNN object
%   ETA             - new global learning rate
%
% OUTPUT:
%   NET             - modified version of NET
%
% SET_GLOBAL_LEARNING_RATE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    net.eta = eta;

end % of method SET_GLOBAL_LEARNING_RATE