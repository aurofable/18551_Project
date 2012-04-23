function y = qdsquash(x)
%    y = 1.71593428 * tanh(2/3 * x);
%    dy/dx = 1.71593428 * 2/3 (1 - tanh(2/3 * x) ^ 2)
    y = zeros(size(x), class(x));
    x = abs(x);
    small_values = x<13;
    t = x(small_values);
    t = 1 + t.*(0.083333333333333333 + t.*(0.003472222222222222 + t.*9.645061728385184e-05));
    t = t .* t;
    t = t .* t;
    t = t .* t;
    t = t .* t;         % now t ~ exp(2*2/3 * |x|)
    t = (t-1)./(t+1);   % now t ~ tahn(2/3 * |x|)
    y(small_values) = 1.143956186666667 * (1 - t.*t);
 end