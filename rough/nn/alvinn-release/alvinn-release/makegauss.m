function y = makegaussians

for mu = 0:290
  y(:,mu+1) = gauss(0:29,mu/10,pi)';
end



function y=gauss(x,mu,sigma)

 y = 2*exp(-((x-mu)/sigma).^2) - 1;
