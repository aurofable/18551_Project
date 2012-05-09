%% Class Definion of the Non-Negative Sparse AutoEncoder (NNSAE)
% The class defines fields that store model parameters and implements methods of the
% NNSAE. The NNSAE uses shared weights. The class is designed to be used with 
% non-negative data distributions.
%
% HowTo use this class:
% - Preparations:
%   1) create an NNSAE object by calling the constructor with your
%   specifications and call the method init
%   2) after loading the dataset, train the NNSAE by calling the method 
%   train with your dataset.
%   NOTE: if you want to apply multiple training epochs call this function repeatedly
% - Apply trained NNSAE to new data:
%   1) Call method apply with the new data sample and compare with the
%   reconstruction (output argument).
%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%          Copyright (c) 2012 F. R. Reinhart, CoR-Lab                 %%%
%%%          Univertiy Bielefeld, Germany, http://cor-lab.de            %%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%
% The program is free for non-commercial and academic use. Please contact the
% author if you are interested in using the software for commercial purposes.
% The software must not be modified or distributed without prior permission
% of the authors. Please acknowledge the authors in any academic publications
% that have made use of this code or part of it. Please use this BibTex for
% reference:
% 
%    A. Lemme, R. F. Reinhart and J. J. Steil. 
%    "Online learning and generalization of parts-based image representations 
%     by Non-Negative Sparse Autoencoders". Submitted to Neural Networks,
%                              OR
%    A. Lemme, R. F. Reinhart and J. J. Steil. "Efficient online learning of
%    a non-negative sparse autoencoder". In Proc. ESANN, 2010.
%
% Please send your feedbacks or questions to:
%                           freinhar_at_cor-lab.uni-bielefeld.de
%                           alemme_at_cor-lab.uni-bielefeld.de
classdef NNSAE < handle

    
    properties
        inpDim = 0; %number of input neurons (and output neurons)
        hidDim = 0; %number of hidden neurons
        
        inp = [];   %vector holding current input
        out = [];   %output neurons
        g = [];     %neural activity before non-linearity
        h = [];     %hidden neuron activation
        a = [];     %slopes of activation functions
        b = [];     %biases of activation functions
        W = [];     %shared network weights, i.e. used to compute hidden layer activations and estimated outputs
        
        lrateRO = 0.01; %learning rate for synaptic plasticity of read-out layer (RO)
        regRO = 0.0002; %numerical regularization constant
        decayP = 0;     %decay factor for positive weights [0..1]
        decayN = 1;     %decay factor for negative weights [0..1]

        lrateIP = 0.001;    %learning rate for intrinsic plasticity (IP)
        meanIP = 0.2;       %desired mean activity, a parameter of IP
    end
    
    methods
        %% Constructor for a NNSAE class 
        % input: 
        %  - inpDim gives the Data sample dimension
        %  - hidDim specifies size of the hidden layer
        % output
        %  - net is the created Non-Negative Sparse Autoencoder
        function net = NNSAE(inpDim, hidDim)
            net.inpDim = inpDim;
            net.hidDim = hidDim;
            
            %create initial fields
            net.inp = zeros(net.inpDim,1);
            net.out = zeros(net.inpDim,1);
            net.g = zeros(net.hidDim,1);
            net.h = zeros(net.hidDim,1);
            net.a = ones(net.hidDim,1);
            net.b = zeros(net.hidDim,1);
            net.W = 2 * (rand(net.inpDim, net.hidDim) - 0.5 * ones(net.inpDim, net.hidDim));
        end
        
        %% initialize NNSAE
        % input: 
        %  - net is a Non-Negative Sparse Autoencoder object
        function init(net)
            %init weights (this is already a non-negative initialization which is, however, not necessary)
            net.W = 0.025 * (2 * rand(net.inpDim, net.hidDim) - 0.5 * ones(net.inpDim, net.hidDim)) + 0.025;
            
            %init slopes of activation functions
            net.a = ones(net.hidDim,1);
            
            %init bias with a good guess (not necessary, but accelerates learning)
            net.b = -3 * ones(net.hidDim,1);
        end
        
        %% Apply new data
        % Xhat = apply(net, X)
        % this function processes data sampels without learning
        %
        % input: 
        %  - net is a Non-Negative Sparse Autoencoder object
        %  - X is a N x M matrix holding the data input, N is the number of samples and M the dimension of each data sample
        % output
        %  - Xhat reconstructed Input sampels N x M
        function Xhat = apply(net, X)
            if isvector(X)
                %for a single input sample
                net.inp = X;
                net.update();
                Xhat = net.out;
            else
                %for entire data matrix
                Xhat = zeros(size(X));
                for i=1:size(X,1)
                    net.inp = X(i,:)';
                    net.update();
                    Xhat(i,:) = net.out';
                end
            end
            
        end
         
        %% Train the network
        % This function adapts the weight matrix W and parameters a and b
        % of the non-linear activation function (intrinsic plasticity)
        %
        % input: 
        %  - X is a N x M matrix holding the data input, N is the number of samples and M the dimension of each data sample
        function train(net, X)
            numSamples = size(X,1);
            p = randperm(numSamples); %for randomized presentation
            for i=1:numSamples
                %set input
                net.inp = X(p(i),:)';
                
                %forward propagation of activities
                net.update();
                
                %calculate adaptive learning rate
                lrate = net.lrateRO/(net.regRO + sum(power(net.h, 2)));

                %calculate error
                error = net.inp - net.out;
            
                %update weights
                net.W = net.W + lrate * error * net.h';

                %decay function for positive weights
                if net.decayP > 0
                    idx = find(net.W > 0);
                    net.W(idx) = net.W(idx) - net.decayP * net.W(idx);
                end
                
                %decay function for negative weights
                if net.decayN == 1
                    %pure NN weights!
                    net.W = max(net.W, 0);
                elseif net.decayN > 0
                    idx = find(net.W < 0);
                    net.W(idx) = net.W(idx) - net.decayN * net.W(idx);
                end
                
                %intrinsic plasticity
                hones = ones(net.hidDim,1);
                tmp = net.lrateIP * (hones - (2.0 + 1.0/net.meanIP) * net.h + power(net.h, 2)/net.meanIP);
                net.b = net.b + tmp;
                net.a = net.a + net.lrateIP * hones ./ net.a + net.g .* tmp;
            end
        end
        
        %% Update network activation
        % This helper function computes the new activation pattern of the
        % hidden layer for a given input. Note that net.inp field has to be set in advance.
        function update(net)
            %excite network
            net.g = net.W' * net.inp;

            %apply activation function
            net.h = 1 ./ (1 + exp(-net.a .* net.g - net.b));

            %read-out
            net.out = net.W * net.h;
        end
        
    end
    
end

