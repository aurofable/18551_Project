function display(net)
% method DISPLAY(NET)
% shows the network main properties
%
% INPUT
%   NET             - myCNN object
%
% DISPLAY is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03


    fprintf('%s = mynet object:\n', inputname(1));
    fprintf('number of layers:               %d [%s]\n', net.n_layers, [net.layer.type]);
    fprintf('number of neurons:              %d\n', net.n_neurons);
    fprintf('number of connections:          %d\n', net.n_connections);
    fprintf('number of parameters:           %d\n', net.n_parameters);
    fprintf('number of trainable parameters: %d\n', net.n_trainable_parameters);

    for l = 1:length(net.layer),
        fprintf('    layer %g [%s], type:%s\n', l, net.layer(l).tag, net.layer(l).type);
        fprintf('        number of feature maps:         %d\n',  net.layer(l).n_FMs);
        fprintf('        number of neurons:              %d\n', net.layer(l).n_neurons);
        fprintf('        number of connections:          %d\n', net.layer(l).n_connections);
        fprintf('        number of parameters:           %d\n', net.layer(l).n_parameters);
        fprintf('        number of trainable parameters: %d\n', net.layer(l).n_trainable_parameters);
    end % of layer loop

end % of method DISPLAY