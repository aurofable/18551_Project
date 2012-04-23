% example of the convolutional network with the non-scalar output

net = myCNN('cnn', [32 32]);  % creates a new myCNN object with input 32x32 pixels
net = add_layer(net, 'C1',  true, 'C', 6);  % add a trainable C-layer with 6 FMs, and default parameters:
                                            % RF size 5x5, RF strides 1x1 etc.                                            
net = add_layer(net, 'S2',  true, 'S');     % add a trainable S-layer with RF size 2x2 and RF strides 2x2
net = add_layer(net, 'output',  true, 'C'); % add the last (C-) layer with default parameters
net = update_stat(net);
net = init_net(net, 1, 2);

% created network has 4 layers: 
%    input, C1 (convolutional), S2 (subsampling), output (convolutional).
% Let's see what we have as the output of the 1-st FM of the the last (4-th) layer

net.layer(4).FM(1).out

% [input]-> 1@32x32 -[C1:6@5x5]-> 6@28x28 -[S2:6@2x2]-> 6@14x14 -[output:6@5x5]-> 6@10x10
% So output has 6 feature maps with each of size 10-by-10
