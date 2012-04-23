clf
%  subplot(8, 1, [1 2])
subplot('Position', [.05 .80 .9 .16])
plot(0:numel(E)-1, E)
title(sprintf('RMSE: %-12.9f', E(end)) , 'FontSize', FontSize)
set(gca, 'FontSize', FontSize-2)

subplot('Position', [.05 .64 .9 .10])
plot(0:numel(MCR)-1, 100*MCR)
title(sprintf('Misclassification rate: %7.4f%%', 100*MCR(end)) , 'FontSize', FontSize)
set(gca, 'FontSize', FontSize-2)

subplot('Position', [.05 .48 .9 .10])
plot(0:numel(etas)-1, etas)
title(sprintf('Global learning rate (eta): %-12.9f', etas(end)), 'FontSize', FontSize)
set(gca, 'FontSize', FontSize-2)

subplot('Position', [.05 .37 .9 .05])
imagesc(out)
axis off
colormap gray
title('Actual output (sorted)', 'FontSize', FontSize)

subplot('Position', [.05 .25 .9 .05])
imagesc(sorted_targets)
axis off
colormap gray
title('Desired output (sorted)', 'FontSize', FontSize)

subplot('Position', [.05 .13 .9 .05])
imagesc((out>0)-(out<=0))
axis off
box on
colormap gray
title('Classification by sign (sorted)', 'FontSize', FontSize)

subplot('Position', [.05 0.01 .9 .05])
imagesc((repmat(max(out), [size(out, 1) 1]) == out)*2 - 1)
axis off
colormap gray
title('Classification by max (sorted)', 'FontSize', FontSize)
drawnow