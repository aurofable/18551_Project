% tour(patterns,result,desired,start) -- run through the training patterns
%    
function tour(patterns,result,desired,start)

  if nargin < 3
    error('Usage:  TOUR(PATTERNS,RESULT,DESIRED,START)')
  end

  clf reset, whitebg(gcf,[0 0 0])

  if nargin < 4, start = 1; end

  for i=start:size(patterns,2)
    PlotAlvinn(i,patterns,result,desired)
  end
