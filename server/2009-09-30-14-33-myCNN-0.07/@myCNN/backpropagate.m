function net = backpropagate(net, target_out)
% method NET = BACKPROPAGATE(NET, TARGET_OUT)
% propagates first derivatives of the error back through the network
%
% INPUT:
%   NET             - myCNN object
%   TARGET_OUT      - desired output data
%
% OUTPUT:
%   NET             - updated version of NET
%
% BACKPROPAGATE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01



%      %% Check input parameters
%      if (~net.n_out_FMs) || (isempty(net.out_FMs)),
%          error('Can''t find output feature maps!')
%      end
%
%      if exist('target_out', 'var') && ~isempty(target_out),
%          if ~iscell(target_out), target_out = {target_out}; end
%          if net.n_out_FMs ~= numel(target_out),
%              error(sprintf('Number of output feature maps [%d] is inconsistent with number of network''s [%s] output feature maps [%d]', ...
%                      numel(target_out), net.tag, net.n_out_FMs))
%          end
%          % TODO: check output dimensions
%      else
%          target_out = cell(net.n_out_FMs, 1);
%          for oFM_i = 1:net.n_out_FMs,
%              ol  = net.out_FMs(1,oFM_i);  % layer index of output FM
%              oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of output FM
%              target_out{oFM_i} = zeros(net.layer(ol).FM(oFM).out.size(1:2));
%          end % of out FM
%      end % of desired output existence condition

%

    if ~iscell(target_out),
        if numel(target_out) == net.n_out_FMs,
            target_out = num2cell(target_out);
        else
            target_out = {target_out};
        end
    end

    %% Set up dE_wrt_dx for output FMs of the output layers
    for oFM_i = 1:net.n_out_FMs,
        ol  = net.out_FMs(1,oFM_i);  % layer index of output FM
        oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of output FM
        net.layer(ol).FM(oFM).out.dx = net.layer(ol).FM(oFM).out.x - target_out{oFM_i};
    end % of out FM

    %% We consider a natural order of the layers (the source layer has index less then
    % the destination layer), so the backpropagation should go in the order of layer
    % index descend

    for l_i = net.n_layers:-1:1,
        switch net.layer(l_i).type
        case 'S', net = backpropagate_S_layer(net, l_i);
        case 'C', net = backpropagate_C_layer(net, l_i);
        case 'F', net = backpropagate_F_layer(net, l_i);
        case 'M', net = backpropagate_M_layer(net, l_i);
        end
    end

end % of method BACKPROPAGATE