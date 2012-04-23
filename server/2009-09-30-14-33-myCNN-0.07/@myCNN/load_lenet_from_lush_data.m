function net = load_lenet_from_lush_data(net, dirname)
% method NET = LOAD_LENET_FROM_LUSH_DATA(NET, DIRNAME, READ_FULL_STATE)
% loads LeNet5 from lush data into (existing) LeNet5 myCNN network NET.
%
% INPUT:
%   NET             - myCNN object
%   DIRNAME         - path to the lush data
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
% Last update: 2009-09-03

    net = load_C_layer(net, 'c0', 'c0', dirname); % load layer CO
    net = load_S_layer(net, 's0', 's0', dirname); % load layer SO
    net = load_C_layer(net, 'c1', 'c1', dirname); % load layer C1
    net = load_S_layer(net, 's1', 's1', dirname); % load layer S1
    net = load_C_layer(net, 'c2', 'c2', dirname); % load layer C2
    net = load_F_layer(net, 'out', 'f', dirname); % load layer F (Output)

end % of method load_lenet_from_lush_data

%--------------------------------------------------------------------------------
function net = load_C_layer(net, layer_tag, file_prefix, dirname)
    fprintf('Loading C-layer [%s] data from directory %s: [', layer_tag, dirname)

    ind = tag2ind(net, layer_tag);
    filename = [dirname file_prefix '.table'];

    %---------------------------------------------------------
    %  connection table
    fprintf('connection table')

    connections = read_lush_array(filename) + 1;
    n_connections = size(connections, 2);

    %---------------------------------------------------------
    %  kernels
    fprintf(', kernels')
    prefix = [dirname file_prefix '.kernel.'];
    d      = read_dddata(prefix);
    n_kers = size(d.x, ndims(d.x));

    if n_connections ~= n_kers,
        error('Number of connections (%g) differs from number of kernels (%g) in %s.', ...
            n_connections, n_kers, layer_tag);
    end

    filled_in_slots = zeros(net.layer(ind).n_FMs, 1);

%      fprintf('\n%s in connections:\n', layer_tag);
    for kernel_i = 1:n_kers,
        src_FM = connections(1, kernel_i);
        dst_FM = connections(2, kernel_i);
%          fprintf('[%g -> %g]\n', src_FM, dst_FM);
        in_slot = filled_in_slots(dst_FM) + 1;
        if in_slot > net.layer(ind).FM(dst_FM).n_in,
            error('"in" slots are full (%g) in feature map %g of layer %s.', net.layer(ind).FM(dst_FM).n_in, dst_FM, layer_tag);
        end
        filled_in_slots(dst_FM) = in_slot;
        net.layer(ind).FM(dst_FM).in(in_slot).RF.w       = d.x(:,:,kernel_i);
        net.layer(ind).FM(dst_FM).in(in_slot).RF.dw      = d.dx(:,:,kernel_i);
        net.layer(ind).FM(dst_FM).in(in_slot).RF.ddw     = d.ddx(:,:,kernel_i);
        net.layer(ind).FM(dst_FM).in(in_slot).RF.kernel  = d.x(:,:,kernel_i);
        net.layer(ind).FM(dst_FM).in(in_slot).RF.rkernel = rot90(d.x(:,:,kernel_i), 2);
        net.layer(ind).FM(dst_FM).in(in_slot).src_FM     = src_FM;
    end % of FM loop

    %---------------------------------------------------------
    %  biases
    fprintf(', biases')
    prefix = [dirname  file_prefix '.bias.'];
    d      = read_dddata(prefix);
    n_FMs  = numel(d.x);

    if net.layer(ind).n_FMs ~= n_FMs,
        error('Number of biases in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [bias_prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).b   = d.x(FM_i);
        net.layer(ind).FM(FM_i).db  = d.dx(FM_i);
        net.layer(ind).FM(FM_i).ddb = d.ddx(FM_i);
    end % of FM loop

    %---------------------------------------------------------
    %  sums
    fprintf(', sums')
    prefix = [dirname  file_prefix '.sum.'];
    d      = read_dddata(prefix);
    n_FMs = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_C_layer', ...
            '\nNumber of sums FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).sum.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    %---------------------------------------------------------
    %  state
    fprintf(', state')
    prefix = [dirname  file_prefix '.state.'];
    d      = read_dddata(prefix);
    n_FMs = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        error('Number of state FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).out.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    fprintf('] done.\n')
end % of function load_C_layer

%--------------------------------------------------------------------------------
function net = load_S_layer(net, layer_tag, file_prefix, dirname)
    fprintf('Loading S-layer [%s] data from directory %s: [', layer_tag, dirname)

    ind = tag2ind(net, layer_tag);

    %---------------------------------------------------------
    %  weights
    fprintf('weights')
    prefix = [dirname file_prefix '.coeff.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        error('Number of kernels in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).in(1).RF.w       = d.x(FM_i);
        net.layer(ind).FM(FM_i).in(1).RF.dw      = d.dx(FM_i);
        net.layer(ind).FM(FM_i).in(1).RF.ddw     = d.ddx(FM_i);
        net.layer(ind).FM(FM_i).in(1).RF.kernel  = repmat(d.x(FM_i), net.layer(ind).FM(FM_i).in(1).RF.size);
        net.layer(ind).FM(FM_i).in(1).RF.rkernel = rot90(net.layer(ind).FM(FM_i).in(1).RF.kernel, 2);
    end % of FM loop

    %---------------------------------------------------------
    %  biases
    fprintf(', biases')
    prefix = [dirname  file_prefix '.bias.'];
    d      = read_dddata(prefix);
    n_FMs  = numel(d.x);
    if net.layer(ind).n_FMs ~= n_FMs,
        error('Number of biases in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).b   = d.x(FM_i);
        net.layer(ind).FM(FM_i).db  = d.dx(FM_i);
        net.layer(ind).FM(FM_i).ddb = d.ddx(FM_i);
    end % of FM loop


    %---------------------------------------------------------
    %  state
    fprintf(', state')
    prefix = [dirname  file_prefix '.state.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_S_layer', ...
            '\nNumber of state FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix  'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
        return
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).out.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    %---------------------------------------------------------
    %  subs
    fprintf(', subs')
    prefix = [dirname  file_prefix '.sub.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_S_layer', ...
            '\nNumber of subs FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).sub.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).sub.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).sub.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    %---------------------------------------------------------
    %  subs
    fprintf(', sums')
    prefix = [dirname  file_prefix '.sum.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_S_layer', ...
            '\nNumber of sums FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).sum.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    fprintf('] done.\n')

end % of function load_S_layer

%--------------------------------------------------------------------------------
function net = load_F_layer(net, layer_tag, file_prefix, dirname)
    fprintf('Loading F-layer [%s] data from directory %s: [', layer_tag, dirname)

    ind = tag2ind(net, layer_tag);

    %---------------------------------------------------------
    %  weights
    fprintf('weights')

    prefix = [dirname file_prefix '.weight.'];
    d      = read_dddata(prefix);
    [n_src_FM n_dst_FM] = size(d.x);
    if n_dst_FM ~= net.layer(ind).n_FMs,
        error('Number of destination FM (%g) in %s differs from number of columns (%g) in file %s.', ...
            net.layer(ind).n_FMs, layer_tag, n_dst_FM, [prefix 'x']);
    end

    for dst_FM = 1:n_dst_FM,
        for src_FM = 1:n_src_FM,
            net.layer(ind).FM(dst_FM).in(src_FM).RF.w       = d.x(src_FM, dst_FM);
            net.layer(ind).FM(dst_FM).in(src_FM).RF.dw      = d.dx(src_FM, dst_FM);
            net.layer(ind).FM(dst_FM).in(src_FM).RF.ddw     = d.ddx(src_FM, dst_FM);
            net.layer(ind).FM(dst_FM).in(src_FM).RF.kernel  = d.x(src_FM, dst_FM);
            net.layer(ind).FM(dst_FM).in(src_FM).RF.rkernel = rot90(d.x(src_FM, dst_FM), 2);
        end % source feature map loop
    end % destination feature map loop

    %---------------------------------------------------------
    %  biases
    fprintf(', biases')
    prefix = [dirname  file_prefix '.bias.'];
    d      = read_dddata(prefix);
    n_FMs  = numel(d.x);
    if net.layer(ind).n_FMs ~= n_FMs,
        error('Number of biases in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).b   = d.x(FM_i);
        net.layer(ind).FM(FM_i).db  = d.dx(FM_i);
        net.layer(ind).FM(FM_i).ddb = d.ddx(FM_i);
    end % of FM loop

    %---------------------------------------------------------
    %  sums
    fprintf(', sums')
    prefix = [dirname  file_prefix '.sum.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_F_layer', ...
            '\nNumber of subs FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).sum.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).sum.ddx = d.ddx(:,:,FM_i);
    end % of FM loop


    %---------------------------------------------------------
    %  state
    fprintf(', state')
    prefix = [dirname  'mout.'];
    d      = read_dddata(prefix);
    n_FMs  = size(d.x, ndims(d.x));

    if net.layer(ind).n_FMs ~= n_FMs,
        warning('myCNN:load_lenet_from_lush_file:load_F_layer', ...
            '\nNumber of state FM in %s (%g) differs from number of feature maps (%g) in the layer %s.', ...
            [prefix 'x'], n_FMs, net.layer(ind).n_FMs, layer_tag);
        return
    end

    for FM_i = 1:n_FMs,
        net.layer(ind).FM(FM_i).out.x   = d.x(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.dx  = d.dx(:,:,FM_i);
        net.layer(ind).FM(FM_i).out.ddx = d.ddx(:,:,FM_i);
    end % of FM loop

    fprintf('] done.\n')

end % of function load_F_layer

%--------------------------------------------------------------------------------
function d = read_dddata(filename_prefix)
    d.x   = read_lush_array([filename_prefix 'x']);
    d.dx  = read_lush_array([filename_prefix 'dx']);
    d.ddx = read_lush_array([filename_prefix 'ddx']);
end % of function read_dddata