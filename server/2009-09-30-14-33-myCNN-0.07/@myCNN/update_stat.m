function net = update_stat(net)
% method NET = UPDATE_STAT(NET)
% updates statistics (number of trainable/nontrainable parameters,
% number of units, number of connections, fan-in) of a network NET.
%
% INPUT:
%   NET             - myCNN object
%
% OUTPUT:
%   NET             - updated version of NET
%
% UPDATE_STAT is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    net.n_neurons       = 0;
    net.n_connections   = 0;
    net.n_parameters    = 0;
    net.n_trainable_parameters = 0;

    for l = 1:net.n_layers,
        net.layer(l).n_neurons              = 0; %prod(net.layer(l).out.size);
        net.layer(l).n_trainable_parameters = 0;
        net.layer(l).n_parameters           = 0;
        net.layer(l).n_connections          = 0;

%          FM_size = net.layer(l).out.size(1:2); % all FMs in the layer should have the same size!!!

        for FM_i = 1:net.layer(l).n_FMs,

            FM_size = net.layer(l).FM(FM_i).out.size(1:2);
            FM_n_outputs = prod(FM_size);
            net.layer(l).FM(FM_i).n_neurons              = FM_n_outputs;  % number of neurons in each FM of the layer
            net.layer(l).FM(FM_i).n_connections          = 0;
            net.layer(l).FM(FM_i).n_parameters           = 0;
            net.layer(l).FM(FM_i).n_trainable_parameters = 0;
            net.layer(l).FM(FM_i).fan_in                 = 0;

            for in_i = 1:net.layer(l).FM(FM_i).n_in,

                net.layer(l).FM(FM_i).in(in_i).n_parameters = numel(net.layer(l).FM(FM_i).in(in_i).RF.w);
                net.layer(l).FM(FM_i).in(in_i).fan_in = prod(net.layer(l).FM(FM_i).in(in_i).RF.size);

                switch net.layer(l).type,
                case {'C', 'F', 'R'},
                    net.layer(l).FM(FM_i).in(in_i).n_connections = ...
                                    net.layer(l).FM(FM_i).in(in_i).fan_in * FM_n_outputs;
                otherwise,
                    net.layer(l).FM(FM_i).in(in_i).n_connections = ...
                                    (1 + net.layer(l).FM(FM_i).in(in_i).fan_in) * FM_n_outputs;
                end % of checking of output size

                if net.layer(l).FM(FM_i).in(in_i).trainable,
                    net.layer(l).FM(FM_i).in(in_i).n_trainable_parameters = net.layer(l).FM(FM_i).in(in_i).n_parameters;
                else
                    net.layer(l).FM(FM_i).in(in_i).n_trainable_parameters = 0;
                end

                net.layer(l).FM(FM_i).fan_in = net.layer(l).FM(FM_i).fan_in ...
                                                     + net.layer(l).FM(FM_i).in(in_i).fan_in;

                net.layer(l).FM(FM_i).n_parameters = net.layer(l).FM(FM_i).n_parameters ...
                                                     + net.layer(l).FM(FM_i).in(in_i).n_parameters;

                net.layer(l).FM(FM_i).n_trainable_parameters = net.layer(l).FM(FM_i).n_trainable_parameters ...
                                                     + net.layer(l).FM(FM_i).in(in_i).n_trainable_parameters;

                net.layer(l).FM(FM_i).n_connections = net.layer(l).FM(FM_i).n_connections ...
                                                     + net.layer(l).FM(FM_i).in(in_i).n_connections;
            end % input loop

            switch net.layer(l).type,
            case 'C',
                net.layer(l).FM(FM_i).n_connections = net.layer(l).FM(FM_i).n_connections + FM_n_outputs;
            case 'F',
                net.layer(l).FM(FM_i).n_connections = net.layer(l).FM(FM_i).n_connections + 1;
%              case 'O',
%                  net.layer(l).FM(FM_i).n_connections = net.layer(l).FM(FM_i).n_connections;
            end % of layer type switch

            % take care about the bias
            % ? chould we add the bias connection if there is only (one) subsample input????
            if net.layer(l).type ~= 'I',
                if net.layer(l).type ~= 'R',
                    net.layer(l).FM(FM_i).n_parameters = net.layer(l).FM(FM_i).n_parameters + 1;
                    if net.layer(l).trainable,
                        net.layer(l).FM(FM_i).n_trainable_parameters = net.layer(l).FM(FM_i).n_trainable_parameters + 1;
                    end
                end

                % layer stat update
                net.layer(l).n_neurons              = net.layer(l).n_neurons + net.layer(l).FM(FM_i).n_neurons;
                net.layer(l).n_connections          = net.layer(l).n_connections + net.layer(l).FM(FM_i).n_connections;
                net.layer(l).n_parameters           = net.layer(l).n_parameters + net.layer(l).FM(FM_i).n_parameters;
                net.layer(l).n_trainable_parameters = net.layer(l).n_trainable_parameters ...
                                                        + net.layer(l).FM(FM_i).n_trainable_parameters;
            end % of if layer type

        end % feature map loop

        % net stat update
        net.n_neurons               = net.n_neurons + net.layer(l).n_neurons;
        net.n_connections           = net.n_connections + net.layer(l).n_connections;
        net.n_parameters            = net.n_parameters + net.layer(l).n_parameters;
        net.n_trainable_parameters  = net.n_trainable_parameters + net.layer(l).n_trainable_parameters;
    end % layer loop

end % of method UPDATE_STAT