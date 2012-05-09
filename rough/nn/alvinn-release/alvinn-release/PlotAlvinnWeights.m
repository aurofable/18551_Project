function PlotAlvinnWeights(Weights1,Weights2)

  clf, whitebg(gcf,[0 0 0]), 
  alvinn_colormap = [0*(1:32), 1:32; 0*(1:64); 32:-1:1, 0*(1:32)]'/32;
  green = max(0,((1:64)-48)/20)'; green=max(green,flipud(green));
  alvinn_colormap(:,2) = green;
  alvinn_colormap = [alvinn_colormap; 0 0 0] .^ (1/2);
  colormap(alvinn_colormap)

  w1min=min(min(Weights1)); w1max=max(max(Weights1));
  w2min=min(min(Weights2)); w2max=max(max(Weights2));

  w1 = (Weights1-w1min)/(w1max-w1min);
  w2 = (Weights2-w2min)/(w2max-w2min);

  subplot(2,2,1)
  PlotAlvinnWeightVector(1,w1,w2)

  subplot(2,2,2)
  PlotAlvinnWeightVector(2,w1,w2)

  subplot(2,2,3)
  PlotAlvinnWeightVector(3,w1,w2)

  subplot(2,2,4)
  PlotAlvinnWeightVector(4,w1,w2)
