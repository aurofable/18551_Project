function PlotAlvinnWeightVector(i,w1,w2)

  % Plot input-to-hidden and hidden-to-output weights as a single 32x32 array.
  %
  % Start with a row of 30 hidden-to-output weights,
  %     with a "65" at beginning & end. (Color 65 = black)
  % Then a row of all-black pixels.
  % Then the input-to-hidden weights, a 30x32 array.

  pic = [65 w2(:,i+1)' 65; ones(2,32)*65; reshape(w1(i,2:end),30,32)];

  image(pic*63+1)
  axis off
  text(10,35,sprintf('Hidden Unit %d',i))
