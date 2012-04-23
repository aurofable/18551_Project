function net = add_layer(net, tag, trainable, layer_type, n_FMs, in_con_mat, in_layers, RF_sizes, RF_strides)
% method NET = ADD_LAYER(NET, TAG, TRAINABLE, LAYER_TYPE, N_FMS, IN_CON_MAT, IN_LAYERS, RF_SIZES, RF_STRIDES)
% adds a layer to the network NET
%
% INPUT:
%   NET             - myCNN object
% TBD...
%
% OUTPUT:
%   NET             - trained version of NET
%
% ADD_LAYER is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    l = net.n_layers + 1;
    %----------------------------------------------------------------------
    if ~exist('tag', 'var') || isempty(tag),
        tag = sprintf('layer-%g', l);
    end
    fprintf('Adding layer %g [%s] to myCNN object [%s]:', l, tag, inputname(1));
    net.layer(l).tag = lower(tag);

    %----------------------------------------------------------------------
    if ~exist('layer_type', 'var') || isempty(layer_type),
        if l>1,
            switch net.layer(l-1).type,
                case {'I','S'},layer_type = 'C';
                case 'C',      layer_type = 'S';
                case 'F',      layer_type = 'R';
                case 'M',      layer_type = 'M';
                otherwise
                    error('Wrong layer_type of the layer %g [%s]!', l-1, net.layer(l-1).tag)
            end
        else
            layer_type = 'I'; % first layer by default is input layer
        end
    else
        layer_type = upper(layer_type(1));
        if ~strfind('ISCFR', layer_type),
            error('Unknown layer layer_type %s in layer %g [%s] (should be in [ISCFR] set)!', layer_type, l, tag)
        end
    end
    net.layer(l).type = layer_type;

    %----------------------------------------------------------------------
    % Set the number of feature maps of the current layer
    if ~exist('n_FMs', 'var') || isempty(n_FMs),
        if l==1,
            n_FMs = 1;
        else
            n_FMs = net.layer(l-1).n_FMs;
        end
    end
    net.layer(l).n_FMs = n_FMs;

    %----------------------------------------------------------------------
    % Create an input layer list of the current layer.
    % This list is used during the connectivity matrices set up
    if ~exist('in_layers', 'var') || isempty(in_layers),
        if l==1,
            in_layers = [];     % the input layer has no inputs
        else
            in_layers = l-1;  % by default we assume feed-forward architecture
        end
    end

    n_in_layers = numel(in_layers); % number of input layers (wrt to current)
    if iscell(in_layers),
        % convert from tags to numbers
        in_layers_list = zeros(1, n_in_layers);
        for il_i = 1:n_in_layers,
            layer_ID = in_layers{il_i};
            if ischar(layer_ID),
                layer_ID = find(strncmp({net.layer.tag}, layer_ID, length(layer_ID)), 1);
                if isempty(layer_ID),
                    error('Can''t find layer tag: %s!', layer_tag)
                end
            end
            in_layers_list(il_i) = layer_ID;
        end % in layer loop
        in_layers = in_layers_list;
    else
        in_layers = in_layers(:)';
    end

    %----------------------------------------------------------------------
    % input connectivity matrices [in_con_mat]
    n_FM_in_ilayer = zeros(1, n_in_layers);  % number of FMs in input layers
    if ~exist('in_con_mat', 'var') || isempty(in_con_mat),
        in_con_mat = cell(1, n_in_layers);
        % By default, for we set up one-to-one connections from previous
        % layer's FM to the curent layer's inputs (if it's possible)
        for il_i = 1:n_in_layers, % loop across all inputs
            il = in_layers(il_i); % input layer index
            n_FM_in_ilayer(il_i) = net.layer(il).n_FMs;    % store number of FMs in i-th input layer
            if (n_FM_in_ilayer(il_i) == 1) || (net.layer(l).type == 'F') || (net.layer(l).type == 'R'),
                in_con_mat{il_i} = true(n_FMs, n_FM_in_ilayer(il_i));
            else
                in_con_mat{il_i} = logical(eye(n_FMs, n_FM_in_ilayer(il_i)));
            end
        end % input layer loop
    else %% check correctness of the connectivity matrices
        for il_i = 1:n_in_layers,
            il = in_layers(il_i); % input layer index
            n_FM_in_ilayer(il_i) = net.layer(il).n_FMs;   % store number of FMs in i-th input layer
            if  (size(in_con_mat{il_i}, 1) ~= n_FMs)  || ...
                (size(in_con_mat{il_i}, 2) ~= n_FM_in_ilayer(il_i)),
                error('Wrong dimensionality of connectivity matrix for layer %s. Expected [%gx%g], but get [%gx%g].',...
                net.layer(il).tag, n_FMs, n_FM_in_ilayer(il_i), size(in_con_mat{il_i}));
            end % check if
        end % input layer loop
    end % parameter in_con_mat check

    % As connectivity is already known, we can set up the parameters of the layer now:
    % net.layer(l).FM(FM_i).n_in - number of inputs for feature map FM_i of the layer l
    for FM_i = 1:n_FMs,
        n_in = 0; % number of input connections for current feature map (FM_i)
        for il_i = 1:n_in_layers,
%             il = in_layers(il_i); % input layer index
            n_in = n_in + sum(in_con_mat{il_i}(FM_i,:));
        end % input layer loop
        net.layer(l).FM(FM_i).n_in = n_in; % number of inputs for current FM
        if net.layer(l).type ~='I',
            net.layer(l).FM(FM_i).in = [];
        end
    end % feature map loop

    % net.layer(l).FM(FM_i).in(in_i).src_layer  - source layer of the input in_i of net.layer(l).FM(FM_i)
    % net.layer(l).FM(FM_i).in(in_i).src_FM     - source FM of the input in_i of net.layer(l).FM(FM_i)

    in_i = 0;
    for il_i = 1:n_in_layers,
        [FM_indices il_FM_indices] = find(in_con_mat{il_i});
        for con_i = 1:numel(FM_indices),
            in_i = in_i + 1;
            FM_i = FM_indices(con_i);
            curr_FM_n_in = numel(net.layer(l).FM(FM_i).in) + 1;
            net.layer(l).FM(FM_i).in(curr_FM_n_in).src_layer = in_layers(il_i);
            net.layer(l).FM(FM_i).in(curr_FM_n_in).src_FM    = il_FM_indices(con_i);
        end % found connections loop
    end % input layer loop

    % check
    for FM_i = 1:n_FMs,
        if net.layer(l).type~='I' && numel(net.layer(l).FM(FM_i).in) ~= net.layer(l).FM(FM_i).n_in,
            error('In FM#%g of the layer %g [%s], number of input connections is %g (should be %g)!', ...
                    FM_i, l, tag, numel(net.layer(l).FM(FM_i).in), net.layer(l).FM(FM_i).n_in);
        end
        if net.layer(l).type =='I' && numel(net.layer(l).FM(FM_i).in)>0,
            net.layer(l).FM(FM_i).in = [];
            net.layer(l).FM(FM_i).n_in = 0;
        end
    end % feature map loop

    %----------------------------------------------------------------------
    % trainable flags (for each input of each FM)
    if ~exist('trainable', 'var') || isempty(trainable),
        switch net.layer(l).type,
            case 'I',   trainable = false;
            otherwise,  trainable = true;
        end
    end
    if numel(trainable) == 1,  % set up default values
        temp = logical(trainable);
        net.layer(l).trainable = temp;
        trainable = cell(1, net.layer(l).n_FMs);
        for FM_i = 1:n_FMs,
            trainable{FM_i} = repmat(temp, 1, net.layer(l).FM(FM_i).n_in);
        end % feature map loop
    else
        net.layer(l).trainable = true; % let biases of the layer by default be trainable
    end

    % intermediate check
    if numel(trainable) ~= n_FMs,
        error('Wrong number of elements in trainable array!')
    end

    % set
    for FM_i = 1:n_FMs,
        net.layer(l).FM(FM_i).trainable = any(trainable{FM_i});
        for in_i = 1:net.layer(l).FM(FM_i).n_in,
            net.layer(l).FM(FM_i).in(in_i).trainable = trainable{FM_i}(in_i);
        end % input (for the current FM)loop
    end % feature map loop

    %----------------------------------------------------------------------
    % receptive field (RF, kernel) sizes
    if ~exist('RF_sizes', 'var') || isempty(RF_sizes),
        % set default RF size values
        for FM_i = 1:n_FMs,
            n_in = net.layer(l).FM(FM_i).n_in; % number of input connections for current FM (FM_i)
            switch layer_type,
                case {'S', 'M'},
                    RF_sizes{FM_i} = repmat([2;2], 1, n_in); % for S-layer it's 2-by-2
                case 'C',
                    RF_sizes{FM_i} = repmat([5;5], 1, n_in); % for C-layer it's 5-by-5
                case {'F', 'R'},
                    RF_sizes{FM_i} = repmat([1;1], 1, n_in); % for F/O-layer it's 1-by-1
                otherwise
                    RF_sizes{FM_i} = [];
            end % switch
        end % feature map loop
    else
        if ~isa(RF_sizes, 'cell'),
            temp = RF_sizes(1:2)';
            RF_sizes = cell(n_FMs, 1);
            for FM_i = 1:n_FMs,
                RF_sizes{FM_i} = repmat(temp, 1, net.layer(l).FM(FM_i).n_in);
            end
        end
        % TODO: check correctness of RF_sizes as cell array
    end % parameter RF_sizes check

    %----------------------------------------------------------------------
    % receptive field strides
    if ~exist('RF_strides', 'var') || isempty(RF_strides),
        for FM_i = 1:n_FMs,
            switch layer_type,
                case {'I','S','M'},     RF_strides{FM_i} = RF_sizes{FM_i};
                case {'C','F','R'}, RF_strides{FM_i} = ones(size(RF_sizes{FM_i})); %[1 1]'; % ????
            end
        end
    else
        if ~isa(RF_strides, 'cell'),
            temp = RF_strides(1:2)';
            RF_strides = cell(n_FMs, 1);
            for FM_i = 1:n_FMs,
                RF_strides{FM_i} = repmat(temp, 1, net.layer(l).FM(FM_i).n_in);
            end
        end
    end

    for FM_i = 1:n_FMs,

        if net.layer(l).type =='I',
            out_size = RF_sizes{FM_i};
        else
%              net.layer(l).FM(FM_i).trainable = trainable;

            n_in = net.layer(l).FM(FM_i).n_in; % number of input connections for current FM (FM_i)
            prev_out_size = [];

            for in_i = 1:n_in,

                src_layer   = net.layer(l).FM(FM_i).in(in_i).src_layer;
                src_FM      = net.layer(l).FM(FM_i).in(in_i).src_FM;
                src_size    = net.layer(src_layer).FM(src_FM).out.size(1:2);

                RF_size     = RF_sizes{FM_i}(:,in_i)';
                RF_stride   = RF_strides{FM_i}(:,in_i)';

                out_size = ceil( (src_size - RF_size + 1) ./ RF_stride );

                if ~isempty(prev_out_size) && ~isequal(prev_out_size, out_size),
                    error('Cannot connect input#%g of FM#%g of layer#%g: wrong output size [%gx%g], while expected [%gx%g]', ...
                    in_i, FM_i, l, out_size, prev_out_size);
                end

                net.layer(l).FM(FM_i).in(in_i).RF.rows = RF_size(1);
                net.layer(l).FM(FM_i).in(in_i).RF.cols = RF_size(2);
                net.layer(l).FM(FM_i).in(in_i).RF.size = RF_size;
                net.layer(l).FM(FM_i).in(in_i).RF.stride = RF_stride;

                switch net.layer(l).type,
                    case {'S','M'},
                        net.layer(l).FM(FM_i).in(in_i).RF.w = 0;
                    otherwise,  
                        net.layer(l).FM(FM_i).in(in_i).RF.w = zeros(RF_size);
                end % switch

                net.layer(l).FM(FM_i).in(in_i).RF.kernel = zeros(RF_size);
                net.layer(l).FM(FM_i).in(in_i).RF.rkernel = zeros(RF_size); % rotated kernel
                net.layer(l).FM(FM_i).in(in_i).RF.dw   = zeros(size(net.layer(l).FM(FM_i).in(in_i).RF.w));
                net.layer(l).FM(FM_i).in(in_i).RF.ddw  = zeros(size(net.layer(l).FM(FM_i).in(in_i).RF.w));
                net.layer(l).FM(FM_i).in(in_i).RF.average_ddw  = zeros(size(net.layer(l).FM(FM_i).in(in_i).RF.w));

                prev_out_size = out_size;

            end % input loop

            net.layer(l).FM(FM_i).out.Gx  = zeros(out_size); % !!!
            net.layer(l).FM(FM_i).out.dx  = zeros(out_size);
            net.layer(l).FM(FM_i).out.ddx = zeros(out_size);

            % a bias for the feature map
            net.layer(l).FM(FM_i).b    = 0;
            net.layer(l).FM(FM_i).db   = 0;
            net.layer(l).FM(FM_i).ddb  = 0;
            net.layer(l).FM(FM_i).average_ddb  = 0;
        end % of check if current layer is an input one

        net.layer(l).FM(FM_i).out.size = out_size;
        net.layer(l).FM(FM_i).out.x    = zeros(out_size);

    end % feature map loop

    net.n_layers = l;

    switch lower(net.layer(l).tag)
    case {'out', 'output'},
        net.n_out_FMs = net.n_out_FMs + n_FMs;
        net.out_FMs = [ net.out_FMs [l*ones(1, n_FMs); 1:n_FMs] ]; % this is for back propogation

        net.out_FM_equally_sized = true;
        for oFM_i = 2:net.n_out_FMs,
            net.out_FM_equally_sized = net.out_FM_equally_sized & ...
                isequal(net.layer(net.out_FMs(1,oFM_i)).FM(net.out_FMs(2,oFM_i)).out.size, ...
                        net.layer(net.out_FMs(1,oFM_i-1)).FM(net.out_FMs(2,oFM_i-1)).out.size);
            if ~net.out_FM_equally_sized, break, end
        end

    case {'inp', 'input'},
        net.n_inp_FMs = net.n_inp_FMs + n_FMs;
        net.inp_FMs = [ net.inp_FMs [l*ones(1, n_FMs); 1:n_FMs] ]; % this is for forward propogation
    end
    
    fprintf(' done.\n');

end % of method ADD_LAYER