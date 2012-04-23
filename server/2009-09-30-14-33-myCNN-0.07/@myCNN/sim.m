function [out net] = sim(net, inp)
% method [OUT NET] = SIM(NET, INP)
% propogates input data INP through the network NET.
%
% INPUT:
%   NET             - myCNN object
%   INP             - input data. If NET has several input layers
%                     INP should be cell array, each element of which
%                     corresponds to an input layer of NET.
%
% OUTPUT:
%   OUT             - output
%   NET             - modified version of NET
%
% SIM is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-30

    [net out] = propagate(net, inp);

end % of method SIM