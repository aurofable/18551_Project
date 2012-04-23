function [net out] = propagate(net, inp)
% method [NET OUT] = PROPAGATE(NET, INP)
% propogates input data INP through the network NET.
%
% INPUT:
%   NET             - myCNN object
%   INP             - input data. If NET has several input layers
%                     INP should be cell array, each element of which
%                     corresponds to an input layer of NET.
%
% OUTPUT:
%   NET             - modified version of NET
%   OUT             - output
%
% PROPAGATE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    %% Check input
    if net.n_inp_FMs == 1,
        net.layer(net.inp_FMs(1,1)).FM(net.inp_FMs(2,1)).out.x = inp;
    elseif net.n_inp_FMs > 1,
        for iFM_i = 1:net.n_inp_FMs,
            il  = net.inp_FMs(1,iFM_i);  % layer index of input FM
            iFM = net.inp_FMs(2,iFM_i);  % FM number (in layer) of input FM
            net.layer(il).FM(iFM).out.x = inp{iFM_i};
        end % of input FM loop
    else
        error('WTF? The net does not have inputs?!?')
    end

%     inp_layers = find([net.layer.type] == 'I');
%     n_inp_layers = numel(inp_layers);
%     if exist('inp', 'var') && ~isempty(inp),
%         if ~iscell(inp), inp = {inp}; end
%          if n_inp_layers ~= numel(inp),
%              error(sprintf('Number of inputs [%d] is inconsistent with number of network''s [%s] input layers [%d]', ...
%                  numel(inp), net.tag, n_inp_layers))
%          end
%          if n_inp_layers > 0,
%              n_frames = 0;
%              for l = 1:n_inp_layers,
%                  inp_layer = inp_layers(l);
%                  [inp_rows inp_cols inp_frames] = size(inp{l});
%                  if n_frames>0 && n_frames ~= inp_frames,
%                      error(sprintf('Number of input frames [%d] in input #%d is inconsistent with total number of input frames [%d]', ...
%                          inp_frames, l, n_frames))
%                  end
%                  n_frames = inp_frames;
%                  for FM_i = 1:net.layer(inp_layer).n_FMs,
%                      if net.layer(inp_layer).FM(FM_i).out.size(1) ~= inp_rows || net.layer(inp_layer).FM(FM_i).out.size(2) ~= inp_cols,
%                          warning(sprintf('Input [%d] size [%dx%d] is inconsistent with the input layer [%s] out size [%dx%d].', ...
%                              l, inp_rows, inp_cols, net.layer(inp_layer).tag, net.layer(inp_layer).FM(FM_i).out.size(1:2)));
%                      end
%                  end % of FM loop
%              end % of input layer loop
%          else
%              error(sprintf('Network %s does not have inputs!', net.tag))
%          end % input layers number switch
%     else
%         n_frames = 1;
%         if n_inp_layers > 0,
%             inp = cell(n_inp_layers, 1);
%             for l = 1:n_inp_layers,
%                 inp{l} = zeros(net.layer(inp_layers(l)).FM(1).out.size(1:2));
%             end % of input layer loop
%         else
%             error( sprintf('Network %s does not have inputs!', net.tag) );
%         end % input layers number switch
%     end % of input existence condition

    for l_i = 1:net.n_layers,
        switch net.layer(l_i).type,
%             case 'I', % input layer - simplest case
%                 for FM_i = 1:net.layer(l_i).n_FMs,
%                     curr_input = curr_input + 1;
%                     net.layer(l_i).FM(FM_i).out.x = inp{curr_input};
%                 end % of FM loop
            case 'C', net = propagate_C_layer(net, l_i);
            case 'S', net = propagate_S_layer(net, l_i);
            case 'F', net = propagate_F_layer(net, l_i);
            case 'M', net = propagate_M_layer(net, l_i);
        end % of layer type switch
    end % of layer loop

    if nargout>1,
        if net.out_FM_equally_sized,
            if net.n_out_FMs == 1,
                ol  = net.out_FMs(1,1);  % layer index of out FM
                oFM = net.out_FMs(2,1);  % FM number (in layer) of out FM
                out = net.layer(ol).FM(oFM).out.x;
            else
                for oFM_i = 1:net.n_out_FMs,
                    ol  = net.out_FMs(1,oFM_i);  % layer index of out FM
                    oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of out FM
                    out(:,:,:,oFM_i) = net.layer(ol).FM(oFM).out.x; %#ok<AGROW>
                end % of out FM loop
                out = shiftdim( permute(out, [1 2 4 3]) );
            end
        else
            for oFM_i = 1:net.n_out_FMs,
                ol  = net.out_FMs(1,oFM_i);  % layer index of out FM
                oFM = net.out_FMs(2,oFM_i);  % FM number (in layer) of out FM
                out{oFM_i} = net.layer(ol).FM(oFM).out.x; %#ok<AGROW>
            end % of out FM loop
        end
    end % of out arguments check

end % of method PROPAGATE