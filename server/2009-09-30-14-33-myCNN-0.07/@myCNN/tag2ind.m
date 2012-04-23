function layer_index = tag2ind(net, layer_tag)
% function LAYER_INDEX = TAG2IND(NET, LAYER_TAG)
% returns index of the layer from its tag.
%
% INPUT:
%   NET             - myCNN object
%   LAYER_TAG       - layer's tag (string)
%
% OUTPUT:
%   LAYER_INDEX     - desired index of the layer
%
% TAG2IND is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03


    layer_index = find(strncmp({net.layer.tag}, layer_tag, length(layer_tag)), 1);

    if isempty(layer_index),
        warning('myCNN:tag2ind', 'Can''t find layer tag: %s!', layer_tag)
    end

end % of function TAG2IND