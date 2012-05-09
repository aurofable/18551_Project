% [Result1,Result2,TSS] = forwprop(Inputs1,Desired,Weights1,Weights2)

function [Result1,Result2,Result3,TSS] = forwprop(Inputs1,Desired,Weights1,Weights2,Weights3)

  NPATS = size(Inputs1,2);

  % Forward propagate activations:
  NetIn1 = Weights1 * Inputs1;
  Result1 = tanh(NetIn1);

  Inputs2 = [ones(1,NPATS); Result1];
  NetIn2 = Weights2 * Inputs2;
  Result2 = tanh(NetIn2);
  
  Inputs3 = [ones(1,NPATS); Result2];
  NetIn3 = Weights3 * Inputs3;
  Result3 = tanh(NetIn3);

  % Calculate the error:
  %Result2Error = Result2 - Desired;
  Result3Error = Result3 - Desired;
  TSS = sum(sum(Result3Error.^2))/NPATS;