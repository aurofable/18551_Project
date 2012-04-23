function net = newLeNet5(inp_rows, inp_cols, n_classes, eta, momentum, parS2C3_cmat, parC5_nFMs)

    if ~exist('inp_rows', 'var')  || isempty(inp_rows),  inp_rows = 32; end
    if ~exist('inp_cols', 'var')  || isempty(inp_cols),  inp_cols = inp_rows; end
    if ~exist('n_classes', 'var') || isempty(n_classes), n_classes = 10; end
    if ~exist('eta', 'var') || isempty(eta), eta = 5e-4; end
    if ~exist('momentum', 'var') || isempty(momentum), momentum = 0; end
    if ~exist('parS2C3_cmat', 'var') || isempty(parS2C3_cmat),
        S2C3_cmat{1} = [1 0 0 0 1 1 1 0 0 1 1 1 1 0 1 1
                        1 1 0 0 0 1 1 1 0 0 1 1 1 1 0 1
                        1 1 1 0 0 0 1 1 1 0 0 1 0 1 1 1
                        0 1 1 1 0 0 1 1 1 1 0 0 1 0 1 1
                        0 0 1 1 1 0 0 1 1 1 1 0 1 1 0 1
                        0 0 0 1 1 1 0 0 1 1 1 1 0 1 1 1]';
    else
        S2C3_cmat{1} = parS2C3_cmat;
    end
    if ~exist('parC5_nFMs', 'var') || isempty(parC5_nFMs), parC5_nFMs = 120; end

    trainable       = true;
    none            = [];

    % C1 layer
    C1_nFMs  = size(S2C3_cmat{1}, 2);
    C1_is    = [inp_rows inp_cols];
    C1_ks    = [5 5];
    C1_ss    = [1 1];
    C1_os    = ceil((C1_is - C1_ks + 1) ./ C1_ss);

    % S2 layer
    S2_ks   = [2 2];
    S2_is   = C1_os;
    S2_ss   = S2_ks;
    S2_nFMs = C1_nFMs;
    S2_os   = ceil((S2_is - S2_ks + 1) ./ S2_ss);

    % C3 layer
    C3_nFMs = size(S2C3_cmat{1}, 1);
    C3_is   = S2_os;
    C3_ks   = [5 5];
    C3_ss   = [1 1];
    C3_os   = ceil((C3_is - C3_ks + 1) ./ C3_ss);

    % S4 layer
    S4_ks   = [2 2];
    S4_nFMs = C3_nFMs;
    S4_is   = C3_os;
    S4_ss   = S4_ks;
    S4_os   = ceil((S4_is - S4_ks + 1) ./ S4_ss);

    % C5 layer
    C5_ks   = S4_os;
    C5_nFMs = parC5_nFMs;
    C5_is   = S4_os;
    C5_ss   = [1 1];
    C5_os   = ceil((C5_is - C5_ks + 1) ./ C5_ss);

    % F6 layer
    F6_nFMs = n_classes;
%     F6_is   = C5_os;
    F6_ks   = C5_os;
    F6_ss   = [1 1];
%     F6_os   = ceil((F6_is - F6_ks + 1) ./ F6_ss); % == [1x1]

    S4C5_cmat{1} = ones(C5_nFMs, S4_nFMs);  % S4 is fully connected to C5

    net = myCNN('LeNet', [inp_rows inp_cols], eta, momentum);  % creates object
    net = add_layer(net, 'C1',  trainable, 'C', C1_nFMs, none, none, C1_ks, C1_ss);
    net = add_layer(net, 'S2',  trainable, 'S', S2_nFMs, none, none, S2_ks, S2_ss);
    net = add_layer(net, 'C3',  trainable, 'C', C3_nFMs, S2C3_cmat, none, C3_ks, C3_ss);
    net = add_layer(net, 'S4',  trainable, 'S', S4_nFMs, none, none, S4_ks, S4_ss);
    net = add_layer(net, 'C5',  trainable, 'C', C5_nFMs, S4C5_cmat, none, C5_ks, C5_ss);
    net = add_layer(net, 'out', trainable, 'F', F6_nFMs, none, none, F6_ks, F6_ss);
    net = update_stat(net);
    net = init_net(net, 1, 2);
    
end % of function newLeNet5