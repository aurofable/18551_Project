function net = create_lenet_structure_from_lush_data(dirname)

    trainable       = true;
    nontrainable    = false;

    if ~exist('dirname', 'var') || isempty(dirname) || ~exist(dirname, 'dir'),
        dirname = '/home/nick/Projects/MCCOOP/code/KUL/nick/recognition/multiclass/Lenet/best-lenet-10-16-180-7/';
        warning(sprintf('Using default directory: %s', dirname));
    end

    if ~exist('read_full_state', 'var') || isempty(read_full_state),
        read_full_state = false;
    end

    % C0
    [C0_kernel_rows C0_kernel_cols C0_FM_number] = size(read_lush_array([dirname 'c0.kernel.x']));
    [C0_out_rows C0_out_cols C0_out_number] =size(read_lush_array([dirname 'c0.sum.x']));
    if C0_out_number~=C0_FM_number, error('Inconsistent data in layer C0!'); end

    input_cols = C0_out_cols + C0_kernel_cols - 1;
    input_rows = C0_out_rows + C0_kernel_rows - 1;

    % S0
    [S0_out_rows S0_out_cols S0_out_number] =size(read_lush_array([dirname 's0.sum.x']));
    if S0_out_number~=C0_FM_number, error('Inconsistent data in layer S0!'); end

    S0_FM_number    = C0_FM_number; % == S0_out_number
    if rem(C0_out_rows, S0_out_rows) || rem(C0_out_cols, S0_out_cols), error('Problem with strides in S0!'); end
    S0_kernel_rows  = ceil(C0_out_rows / S0_out_rows);  % !!! don't care about strides?
    S0_kernel_cols  = ceil(C0_out_cols / S0_out_cols);  % !!! don't care about strides?

    % C1
    [C1_kernel_rows C1_kernel_cols C1_kernel_number] = size(read_lush_array([dirname 'c1.kernel.x']));
    [C1_out_rows C1_out_cols C1_FM_number] =size(read_lush_array([dirname 'c1.sum.x']));

    S0C1_conn_arcs = read_lush_array([dirname 'c1.table']) + 1;
    S0C1_conn_matrix{1} = zeros(C1_FM_number, S0_FM_number);
    for i = 1:size(S0C1_conn_arcs, 2),
        S0C1_conn_matrix{1}(S0C1_conn_arcs(2,i), S0C1_conn_arcs(1,i)) = 1;
    end % arc loop

%
%      S0C1_conn_arcs =   [0 0;  1 0;  2 0
%                          2 1;  3 1;  4 1
%                          4 2;  5 2;  6 2
%                          6 3;  7 3;  8 3
%                          8 4;  9 4;  0 4
%                          1 5;  2 5;  3 5
%                          2 6;  3 6;  4 6;  5 6
%                          4 7;  5 7;  6 7;  7 7
%                          6 8;  7 8;  8 8;  9 8
%                          8 9;  9 9;  0 9;  1 9
%                          1 10; 3 10; 5 10; 8 10
%                          3 11; 4 11; 5 11; 6 11
%                          0 12; 2 12; 7 12; 9 12
%                          1 13; 2 13; 6 13; 7 13
%                          0 14; 3 14; 8 14; 9 14
%                          0 15; 1 15; 2 15; 3 15; 4 15;  5 15; 6 15; 7 15; 8 15; 9 15]' + 1;


    % S1
    [S1_out_rows S1_out_cols S1_out_number] =size(read_lush_array([dirname 's1.sum.x']));
    if S1_out_number~=C1_FM_number, error('Inconsistent data in layer S1!'); end
    S1_FM_number    = C1_FM_number; % == S0_out_number
    if rem(C1_out_rows, S1_out_rows) || rem(C1_out_cols, S1_out_cols), error('Problem with strides in S1!'); end
    S1_kernel_rows  = ceil(C1_out_rows / S1_out_rows);  % !!! don't care about strides?
    S1_kernel_cols  = ceil(C1_out_cols / S1_out_cols);  % !!! don't care about strides?


    % C2
    [C2_kernel_rows C2_kernel_cols C2_kernel_number] = size(read_lush_array([dirname 'c2.kernel.x']));
    [C2_out_rows C2_out_cols C2_FM_number] =size(read_lush_array([dirname 'c2.sum.x']));
    if C2_FM_number * S1_FM_number ~= C2_kernel_number, error('Incorrect kernel number in layer C2!'); end

%      S1C2_conn_matrix{1} = ones(C2_FM_number, S1_FM_number);  % S1 is fully connected to C2

    S1C2_conn_arcs = read_lush_array([dirname 'c2.table']) + 1;
    S1C2_conn_matrix{1} = zeros(C2_FM_number, S1_FM_number);
    for i = 1:size(S1C2_conn_arcs, 2),
        S1C2_conn_matrix{1}(S1C2_conn_arcs(2,i), S1C2_conn_arcs(1,i)) = 1;
    end % arc loop

    % F layer
    F_FM_number = numel(read_lush_array([dirname 'f.sum.x']));

    net = mylenet('myLeNet', [input_rows input_cols]);  % creates object with 32x32 input layer
    net = add_layer(net, 'C0',  trainable, 'C', C0_FM_number);                      % C0 layer
    net = add_layer(net, 'S0',  trainable, 'S', S0_FM_number);                      % S0 layer
    net = add_layer(net, 'C1',  trainable, 'C', C1_FM_number, S0C1_conn_matrix);    % C1 layer
    net = add_layer(net, 'S1',  trainable, 'S', S1_FM_number);                      % S1 layer
    net = add_layer(net, 'C2',  trainable, 'C', C2_FM_number, S1C2_conn_matrix, [], [S1_out_rows S1_out_cols]); % C2 layer
    net = add_layer(net, 'out', trainable, 'F', F_FM_number);                      % output layer
    net = update_stat(net);

end % of function create_lenet_structure_from_lush_data