function [y dy] = qsquash_and_dsquash(x)
%    y = 1.71593428 * tanh(2/3 * x);
%    dy/dx = 1.71593428 * 2/3 (1 - tanh(2/3 * x) ^ 2)
% single precision version

    PR = single(2/3);
    PO = single(1.71593428);
    A0 = single(1.0);
    A1 = single(0.125*PR);
    A2 = single(0.0078125*PR*PR);
    A3 = single(0.000325520833333*PR*PR*PR);

    negatives = x<0;
    dy = zeros(size(x), 'single');
    y  = ones(size(x), 'single');


    x = abs(x);
    small_values = x<13;
    t = x(small_values);

%      t = single(1) + t.*(single(0.083333333333333333) + t.*(single(0.003472222222222222) + t.*single(9.645061728385184e-05)));
    t = A0 + t.*(A1 + t.*(A2 + t.*(A3)));
    t = t .* t;
    t = t .* t;
    t = t .* t;
    t = t .* t;         % now t ~ exp(2*2/3 * |x|)

    y(small_values) = PO * (t - single(1))./(t + single(1));
    y(negatives) = - y(negatives);

    t = (t - single(1)) ./ (t + single(1));   % now t ~ tahn(2/3 * |x|)
    dy(small_values) = PR*PO - PR*PO.*t.*t;

%      y(small_values) = single(1.71593428) * t;
%      y(negatives) = - y(negatives);
%
%      dy(small_values) = single(1.143956186666667) * (1 - t.*t);

end % of function qsquash_and_dsquash