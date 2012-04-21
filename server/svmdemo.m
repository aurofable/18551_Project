% SVM with libsvm
% Xu Cui, 2009/10/07

%% two classes, linear

% data setup: our data contains two classes, each N samples. The data is 2D
N = 500;
l = [ones(N,1); -ones(N,1)]; % label
d = [l/2 + randn(2*N,1)/2  l-randn(2*N,1)/2]; % data


% plot original data for visual inspection
figure('color','w');
pos = find(l==1);
plot(d(pos,1),d(pos,2),'r.');
pos = find(l==-1);
hold on; plot(d(pos, 1),d(pos, 2),'b.');
axis equal

% SVM with linear kernel (-t 0). We want to find the best parameter value C
% using 2-fold cross validation (meaning use 1/2 data to train, the other
% 1/2 to test). Please note the parameter -g (gamma) is useless for linear
% kernel
bestcv = 0;
for log2c = -1.1:3.1,
  for log2g = -4.1:1.1,
    cmd = ['-t 0 -v 2 -c ', num2str(2^log2c), ' -g ', num2str(2^log2g)];
    cv = svmtrain(l, d, cmd);
    if (cv >= bestcv),
      bestcv = cv; bestc = 2^log2c; bestg = 2^log2g;
      fprintf('%g %g %g (best c=%g, g=%g, rate=%g)\n', log2c, log2g, cv, bestc, bestg, bestcv);
    end
  end
end

% After finding the best parameter value for C, we train the entire data
% again using this parameter value
cmd = ['-t 0 -c ', num2str(bestc), ' -g ', num2str(bestg)];
tic;model = svmtrain(l, d, cmd);toc

% now plot support vectors
hold on;
sv = full(model.SVs);
plot(sv(:,1),sv(:,2),'ko');

% now plot decision area
[xi,yi] = meshgrid([min(d(:,1)):0.1:max(d(:,1))],[min(d(:,2)):0.1:max(d(:,2))]);
dd = [xi(:),yi(:)];
tic;[predicted_label, accuracy, decision_values] = svmpredict(zeros(size(dd,1),1), dd, model);toc
pos = find(predicted_label==1);
hold on;
redcolor = [1 0.8 0.8];
bluecolor = [0.8 0.8 1];
h1 = plot(dd(pos,1),dd(pos,2),'s','color',redcolor,'MarkerSize',5,'MarkerEdgeColor',redcolor,'MarkerFaceColor',redcolor);
pos = find(predicted_label==-1);
hold on;
h2 = plot(dd(pos,1),dd(pos,2),'s','color',bluecolor,'MarkerSize',5,'MarkerEdgeColor',bluecolor,'MarkerFaceColor',bluecolor);
uistack(h1, 'bottom');
uistack(h2, 'bottom');

%% two classes, non-linear, radial basis function: exp(-gamma*|u-v|^2)

% data setup: our data contains two classes, each N samples. The data is 2D
N = 500;
d = (rand(2*N,2)-0.5)*6;
l = -1*ones(size(d,1),1);
% here are 3 examples, uncomment one of them
pos = find((d(:,1).^2 + d(:,2).^2)<1); % one circle in the middle
%pos = find(((d(:,1)+1).^2 + d(:,2).^2)<1 | ((d(:,1)-2).^2 + d(:,2).^2)<1); %two circles
%pos = find(d(:,1)<0  & d(:,2)<0 | d(:,1)>0 &  d(:,2)>0); % quadrant
l(pos) = 1;

% normalization, but we don't do it here
% d = (d -repmat(min(d,[],1),size(d,1),1))*spdiags(1./(max(d,[],1)-min(d,[],1))',0,size(d,2),size(d,2));

% plot original data for visual inspection
figure('color','w');
pos = find(l==1);
plot(d(pos,1),d(pos,2),'r.');
pos = find(l==-1);
hold on; plot(d(pos, 1),d(pos, 2),'b.');
axis equal

% SVM with radial kernel (-t 2). We want to find the best parameter value C
% and gamma
% using 2-fold cross validation (meaning use 1/2 data to train, the other
% 1/2 to test). 
bestcv = 0;
for log2c = -1.1:3.1,
  for log2g = -4.1:1.1,
    cmd = ['-t 2 -v 2 -c ', num2str(2^log2c), ' -g ', num2str(2^log2g)];
    cv = svmtrain(l, d, cmd);
    if (cv >= bestcv),
      bestcv = cv; bestc = 2^log2c; bestg = 2^log2g;
      fprintf('%g %g %g (best c=%g, g=%g, rate=%g)\n', log2c, log2g, cv, bestc, bestg, bestcv);
    end
  end
end

% After finding the best parameter value for C, we train the entire data
% again using this parameter value
cmd = ['-t 2 -c ', num2str(bestc), ' -g ', num2str(bestg)];
tic;model = svmtrain(l, d, cmd);toc

% now plot support vectors
hold on;
sv = full(model.SVs);
plot(sv(:,1),sv(:,2),'ko');

% now plot decision area
[xi,yi] = meshgrid([min(d(:,1)):0.1:max(d(:,1))],[min(d(:,2)):0.1:max(d(:,2))]);
dd = [xi(:),yi(:)];
tic;[predicted_label, accuracy, decision_values] = svmpredict(zeros(size(dd,1),1), dd, model);toc
pos = find(predicted_label==1);
hold on;
redcolor = [1 0.8 0.8];
bluecolor = [0.8 0.8 1];
h1 = plot(dd(pos,1),dd(pos,2),'s','color',redcolor,'MarkerSize',5,'MarkerEdgeColor',redcolor,'MarkerFaceColor',redcolor);
pos = find(predicted_label==-1);
hold on;
h2 = plot(dd(pos,1),dd(pos,2),'s','color',bluecolor,'MarkerSize',5,'MarkerEdgeColor',bluecolor,'MarkerFaceColor',bluecolor);
uistack(h1, 'bottom');
uistack(h2, 'bottom');

%% three classes, linear

% data setup: our data contains two classes, each N samples. The data is 2D
N = 500;
l = [ones(N,1); -ones(N,1); -3*ones(N,1);]; % label
d = [l/2 + randn(size(l))/3  l-randn(size(l))/3]; % data
d(2*N+1:end,:) = [l(2*N+1:end)/3 + randn(N,1)/3  l(2*N+1:end)/3-randn(N,1)/3+1.5]; % data

% plot original data for visual inspection
figure('color','w');
pos = find(l==1);
plot(d(pos,1),d(pos,2),'r.');
pos = find(l==-1);
hold on; plot(d(pos, 1),d(pos, 2),'b.');
pos = find(l==-3);
hold on; plot(d(pos, 1),d(pos, 2),'k.');
axis equal

% SVM with linear kernel (-t 0). We want to find the best parameter value C
% using 2-fold cross validation (meaning use 1/2 data to train, the other
% 1/2 to test). Please note the parameter -g (gamma) is useless for linear
% kernel
bestcv = 0;
for log2c = -1.1:3.1,
  for log2g = -4.1:1.1,
    cmd = ['-t 0 -v 2 -c ', num2str(2^log2c), ' -g ', num2str(2^log2g)];
    cv = svmtrain(l, d, cmd);
    if (cv >= bestcv),
      bestcv = cv; bestc = 2^log2c; bestg = 2^log2g;
      fprintf('%g %g %g (best c=%g, g=%g, rate=%g)\n', log2c, log2g, cv, bestc, bestg, bestcv);
    end
  end
end

% After finding the best parameter value for C, we train the entire data
% again using this parameter value
cmd = ['-t 0 -c ', num2str(bestc), ' -g ', num2str(bestg)];
tic;model = svmtrain(l, d, cmd);toc

% now plot support vectors
hold on;
sv = full(model.SVs);
plot(sv(:,1),sv(:,2),'ko');

% now plot decision area
[xi,yi] = meshgrid([min(d(:,1)):0.1:max(d(:,1))],[min(d(:,2)):0.1:max(d(:,2))]);
dd = [xi(:),yi(:)];
tic;[predicted_label, accuracy, decision_values] = svmpredict(zeros(size(dd,1),1), dd, model);toc
pos = find(predicted_label==1);
hold on;
redcolor = [1 0.8 0.8];
bluecolor = [0.8 0.8 1];
blackcolor = [0.8 0.8 0.8];
h1 = plot(dd(pos,1),dd(pos,2),'s','color',redcolor,'MarkerSize',5,'MarkerEdgeColor',redcolor,'MarkerFaceColor',redcolor);
pos = find(predicted_label==-1);
hold on;
h2 = plot(dd(pos,1),dd(pos,2),'s','color',bluecolor,'MarkerSize',5,'MarkerEdgeColor',bluecolor,'MarkerFaceColor',bluecolor);
hold on;
pos = find(predicted_label==-3);
h3 = plot(dd(pos,1),dd(pos,2),'s','color',blackcolor,'MarkerSize',5,'MarkerEdgeColor',blackcolor,'MarkerFaceColor',blackcolor);
uistack(h1, 'bottom');
uistack(h2, 'bottom');
uistack(h3, 'bottom');


%% Test libsvm's performance
result = [];
for N = [100 500 1000 ]
    for dim = [2 6 10 20 50 100]

    l = [ones(N,1); -ones(N,1)]; % label
    d = [l/2 + randn(2*N,1)/1  l-randn(2*N,1)/1 randn(2*N, dim-2)]; % data

    tic;model = svmtrain(l,d,'-t 0');x = toc;
    tic;[predicted_label, accuracy, decision_values] = svmpredict(l, d, model);y = toc;
    
    result = [result; [N dim x y]];
    
    end
end

disp(result)

%%


% calculate w and b
w = model.SVs' * model.sv_coef;
b = -model.rho;

if model.Label(1) == -1
  w = -w;
  b = -b;
end
disp(w)
disp(b)

% plot the boundary line
% x = [min(d(:,1)):.01:max(d(:,1))];
% y = (-b - w(1)*x ) / w(2);
% hold on;
% plot(x,y)


pause(1)

return