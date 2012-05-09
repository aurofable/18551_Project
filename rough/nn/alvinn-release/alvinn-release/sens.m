
for i=1:30
  w = 5+floor(i/(30/7));
  im(i,:) = -0.6*ones(1,96);
  im(i,(48-w):(48+w-1)) = 0.6;
end

y=zeros(960,0);
for i=3:61
  s = im(:,i:(i+31));
  y(:,i) = s(:);
end

SensInputs1 = [ones(1,size(y,2)); y];
SensDesired = zeros(30,size(y,2));

[SensResult1,SensResult2,SensTSS] = ...
	forwprop(SensInputs1,SensDesired,Weights1,Weights2);

clf
plot(SensResult1')
legend('1','2','3','4',0)
