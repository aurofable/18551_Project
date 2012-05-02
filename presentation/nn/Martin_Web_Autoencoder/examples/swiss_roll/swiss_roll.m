function swiss_roll ( n, N_all, batch_size, err_type )
% function swiss_roll ( n, N, batch_size, err_type )
% This function generates a swiss roll and uses the autoencoder to
% reduce the dimension.
%
% INPUTS: n -- autoencoder layers (e.g. [ 3 8 4 2 ])
%         N -- vector with number of samples for swiss roll
%              [train test] (e.g. [4000 1000])
%         batchsize -- number of batches (e.g. [50 500])
%         err_type -- 1 for cross entropy, 2 for reconstruction
%
% OUTPUTS: 6 plots showing errors, reductions and reconstructions of
%          the swiss roll.
%
% This code was taken from the LLE webpage and modified by S. Martin
% 4/18/2007 to perform reduction using the autoencoder with the
% swiss roll dataset.

N = sum(N_all);

% PLOT TRUE MANIFOLD

fprintf('Generating Swiss Roll dataset ...\n');

  tt0 = (3*pi/2)*(1+2*[0:0.02:1]); hh = [0:0.125:1]*30;
  xx = (tt0.*cos(tt0))'*ones(size(hh));
  yy = ones(size(tt0))'*hh;
  zz = (tt0.*sin(tt0))'*ones(size(hh));
  cc = tt0'*ones(size(hh));

% GENERATE SAMPLED DATA
  tt = (3*pi/2)*(1+2*rand(1,N));  height = 21*rand(1,N);
  X = [tt.*cos(tt); height; tt.*sin(tt)];
  
%scale data between 0 and 1
X = (X-repmat(min(min(X)),3,N))./(repmat(max(max(X))-min(min(X)),3,N));

% RUN AutoEncoder ALGORITHM

fprintf('Running the autoencoder ...\n');
[Wb, RBM_error, BP_error] = train_AE ( X(:,1:N_all(1)), ...
    X(:,(N_all(1)+1):(N_all(1) + N_all(2))), ...
	n, [50, 100], batch_size, err_type );

Y = AE_forward ( X, Wb, n );
R = AE_inverse ( Y, Wb, n );

% make plots

% plot errors in figures 1 & 2
plot_errors ( n, RBM_error, BP_error );

  % actual manifold
  figure(3)
  surf(xx,yy,zz,cc);
  view([12 20]);
  axis([-15,20,0,32,-15,15]);
  title('Actual Manifold');
  
% SCATTERPLOT OF SAMPLED DATA
  figure(4)
  scatter3(X(1,:),X(2,:),X(3,:),12,tt,'+');
  view([12 20]); 
  title('Sampled Manifold');

% SCATTERPLOT OF EMBEDDING
  figure(5)
  scatter(Y(1,:),Y(2,:),12,tt,'+');
  title('2D Representation');
  
% reconstructed swiss roll
  figure (6)
  scatter3(R(1,:),R(2,:),R(3,:),12,tt,'+');
  title ('Reconstructed Swiss Roll');