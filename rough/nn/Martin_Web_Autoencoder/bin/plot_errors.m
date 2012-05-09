function plot_errors ( n, RBM_error, BP_error )
% function plot_errors ( n, RBM_error, BP_error )
% This function displays the error plots using the results of the
% train_AE.m.
%
% INPUTS: n -- autoencoder dimensions.
%         RBM_error, BP_error -- error matrices as returned by train_AE.m.
%
% OUTPUTS: Error plots are shown in figures 1 & 2.
%
% S. Martin
% 4/6/2007

% RBM error plot is in figure 1
figure(1)
clf
plot(RBM_error');
for i = 1:(length(n)-1)
    RBM_leg{i} = ['RBM ',num2str(n(i)),'-',num2str(n(i+1))];
end
legend (RBM_leg);
title('Reconstruction Error for RBM pre-training');
xlabel('Iteration');
ylabel('Mean Squared Error');

% BP error plot is in figure 2
figure(2)
clf
plot(BP_error');
legend('Training','Testing');
title('Reconstruction Error for fine-tuning');
xlabel('Iteration');
ylabel('Mean Squared Error');