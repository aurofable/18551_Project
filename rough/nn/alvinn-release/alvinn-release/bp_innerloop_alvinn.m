% bp_innerloop.m
%
% Inner loop of the backpropagtion learning algorithm.
% One hidden layer.  Uses tanh as the transfer function.
%
% Uses the following global variables for input and/or output:
%    Inputs1   -  input patterns
%    Desired   -  desired output patterns
%    LearnRate -  learning rate parameter
%    Momentum  -  momentum parameter
%    DerivIncr -  increment to the derivative of the transfer function
%                   (Fahlman's trick; typical value 0.2)
%    WeightDecay - should be zero for no decay.
%    Weights1  -  first weight layer (updated by this routine)
%    Weights2  -  second weight layer (updated by this routine)
%    deltaW1   -  initialize to 0 before first call
%    deltaW2   -  initialize to 0 before first call
%    TSS       -  total sum-squared error (set by this routine)

  % Forward propagate activations:
  NetIn1 = Weights1 * Inputs1;
  Result1 = tanh(NetIn1);

  Inputs2 = [ones(1,NPATS); Result1];
  NetIn2 = Weights2 * Inputs2;
  Result2 = tanh(NetIn2);
  
  % Added
  Inputs3 = [ones(1,NPATS); Result2];
  NetIn3 = Weights3 * Inputs3;
  Result3 = tanh(NetIn3);

  % Added
  Result3Error = Result3 - Desired;
  TSS = sum(sum(Result3Error.^2))/NPATS;
  In3Error = Result3Error .* (DerivIncr + cosh(NetIn3).^(-2));
  
  % Backward propagate errors:
  %Result2Error = Result2 - Desired;
  %TSS = sum(sum(Result2Error.^2))/NPATS;
  %In2Error = Result2Error .* (DerivIncr + cosh(NetIn2).^(-2));

  Result2Error = Weights3' * In3Error;
  In2Error = Result2Error(2:end,:) .* (DerivIncr + cosh(NetIn2).^(-2));
  
  Result1Error = Weights2' * In2Error;
  In1Error = Result1Error(2:end,:) .* (DerivIncr + cosh(NetIn1).^(-2));

  % Calculate the weight updates:
  dW3 = In3Error * Inputs3';
  dW2 = In2Error * Inputs2';
  dW1 = In1Error * Inputs1';

  deltaW3 = -LearnRate/size(Weights3,2) * dW3 + Momentum * deltaW3;
  deltaW2 = -LearnRate/size(Weights2,2) * dW2 + Momentum * deltaW2;
  deltaW1 = -LearnRate/size(Weights1,2) * dW1 + Momentum * deltaW1;

  Weights3 = (Weights3 + deltaW3) .* (1-WeightDecay);
  Weights2 = (Weights2 + deltaW2) .* (1-WeightDecay);
  Weights1 = (Weights1 + deltaW1) .* (1-WeightDecay);

