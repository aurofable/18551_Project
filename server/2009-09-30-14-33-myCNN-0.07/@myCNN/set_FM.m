function net = set_FM(net, layer_ID, FM_range, x, dx, ddx)
% method NET = SET_FM(NET, LAYER_ID, FM_RANGE, X, DX, DDX)
% sets up feature map outputs and derivatives to proposed values.
%
% INPUT:
%   NET             - myCNN object
%   LAYER_ID        - ID of layer, which is being changed
%   FM_RANGE        - list of indices of feature maps (FMs) to change
%   X               - array of outputs (out.x) for selected FMs
%   DX              - array of first derivatives (out.dx)
%   DDX             - array of second derivatives (out.ddx)
%
% OUTPUT:
%   NET             - modified version of NET
%
% SET_FM is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    if ischar(layer_ID),
        l = tag2ind(layer_ID);
    else
        l = layer_ID;
    end

    if ~exist('FM_range', 'var') || isempty(FM_range),
        FM_range = 1:net.layer(l).n_FMs;
    end

    max_FM  = max(FM_range);
    skip_dx  = ~exist('dx', 'var')  || ~isempty(dx)  || ~isequal(size(x), size(dx));
    skip_ddx = ~exist('ddx', 'var') || ~isempty(ddx) || ~isequal(size(x), size(ddx));
    if (max_FM > net.layer(l).n_FMs), error('FM_range is inconsistent with n_FMs of layer %g.', l); end
    if (max_FM > size(x, 3)), error('FM_range is inconsistent with number of slices in x.'); end

    for i = 1:numel(FM_range),
        FM_i = FM_range(i);
        net.layer(l).FM(FM_i).out.x = x(:,:,FM_i);
        if ~skip_dx,
            net.layer(l).FM(FM_i).out.dx  = dx(:,:,FM_i);
        end
        if ~skip_ddx,
            net.layer(l).FM(FM_i).out.ddx = ddx(:,:,FM_i);
        end
    end

end % of method SET_FM