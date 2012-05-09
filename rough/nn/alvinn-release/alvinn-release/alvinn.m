% alvinn.m  -- Simulaton of ALVINN road following network

[NINPUTS, NPATS]  = size(Patterns);
[NOUTPUTS, NPATS] = size(Desired);
[NINPUTS,CVNPATS] = size(CVPatterns);
NHIDDENS = 4;
NHIDDENS2 = 4; % Added
Inputs1 = [ones(1,NPATS); Patterns];
CVInputs1 = [ones(1,CVNPATS); CVPatterns];

DerivIncr = 0.1;
%LearnSchedule = [50*4 0.001; 100*4 0.007; 50*4 0.004];
LearnSchedule = [4000 0.001];
Momentum = 0.9;
WeightDecay = 0.01;
sched_pointer = 1;
TSS_Limit = 0.1;

InitWeights1 = (rand(NHIDDENS,1+NINPUTS)-0.5)/sqrt(1+NINPUTS);
InitWeights2 = (rand(NHIDDENS2,1+NHIDDENS)-0.5)/sqrt(1+NHIDDENS);
InitWeights3 = (rand(NOUTPUTS,1+NHIDDENS2)-0.5)/sqrt(1+NHIDDENS2);
Weights1 = InitWeights1;
Weights2 = InitWeights2;
Weights3 = InitWeights3;
deltaW1 = 0;
deltaW2 = 0;
deltaW3 = 0;

epoch = 0;
TSS_Record = zeros(0,2);

alvinnhelper
