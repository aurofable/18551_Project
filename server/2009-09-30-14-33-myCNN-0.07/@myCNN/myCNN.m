function net = myCNN(netID, inp_size, eta, momentum, nu, datatype)
% function NET = MYCNN(NETID, INP_SIZE, ETA, MOMENTUM, NU, DATATYPE)
% Constructor of a myCNN object.
%
% INPUT:
%   NETID           - myCNN object ID (string or existing myCNN object)
%   INP_SIZE        - size of inputs [by default 32x32]
%   ETA             - global learning rate of the net [0.001]
%   MOMENTUM        - global momentum of the net [0.5]
%   NU              - parameter  [0.02]
%   DATATYPE        - datatype of parameters []
%
% OUTPUT:
%   NET             - new myCNN object
%
% myCNN is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-01

    if nargin >= 1,
        if isa(netID, 'myCNN')
            net = netID;
            return
        end
        if ~ischar(netID),
            error('first parameter should be string or myCNN object');
        end
        tag = netID;
    else
        tag = 'CNN';
        n_inp_FMs = 1;
    end

    if nargin >= 2 && ~isempty(inp_size),
        if numel(inp_size) < 2,
            rows = ceil(sqrt(inp_size));
            cols = ceil(inp_size/rows);
            inp_size = [rows cols];
            n_inp_FMs = 1;
        elseif numel(inp_size) == 2
            n_inp_FMs = 1;
        elseif numel(inp_size) > 2
            n_inp_FMs = inp_size(3);
            inp_size = inp_size(1:2);
        end
    else
        inp_size = [32 32];
    end

    if ~exist('eta', 'var')     || isempty(eta),        eta      = 0.001; end
    if ~exist('momentum', 'var')|| isempty(momentum),   momentum = .5; end
    if ~exist('nu', 'var')      || isempty(nu),         nu       = .02; end
    if ~exist('datatype', 'var')|| isempty(datatype),   datatype = 'single'; end

    % create minimal structure of the object (net)
    net.tag                                         = tag;
    net.eta                                         = eta;          % global learning rate of the net
    net.momentum                                    = momentum;     % momentum (inertia) of the net training
    net.nu                                          = nu;           % LM parameter
    net.datatype                                    = datatype;
    net.n_connections                               = 0;
    net.n_neurons                                   = 0;
    net.n_parameters                                = 0;
    net.n_trainable_parameters                      = 0;
    net.n_layers                                    = 0;
    net.n_out_FMs                                   = 0;
    net.out_FMs                                     = [];
    net.out_FM_equally_sized                        = true;
    net.n_inp_FMs                                   = 0;
    net.inp_FMs                                     = [];
    net.layer(1).type                               = '';
    net.layer(1).FM(1).trainable                    = false;   % trainable flag
    net.layer(1).FM(1).in(1).n_parameters           = 0;

    % attach class name
    net = class(net, 'myCNN');

    % add first (Input) layer
    net = add_layer(net, ...        % myCNN object
                    'input', ...    % layer tag
                    false, ...      % trainable flag
                    'I', ...        % layer type
                    n_inp_FMs, ...  % number of feature maps
                    [], ...         % input connectivity matrix
                    [], ...         % list of input layers
                    {inp_size});    % size of input

    fprintf('myCNN object [%s] has been successfully created.\n', net.tag)

end % of constructor myCNN