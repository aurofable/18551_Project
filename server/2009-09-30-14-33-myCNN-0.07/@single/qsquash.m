function y = qsquash(x)
%     y = 1.71593428 * tanh(2/3 * x);
    
    PR = single(2/3);
    PO = single(1.71593428);
    A0 = single(1.0);
    A1 = single(0.125*PR);
    A2 = single(0.0078125*PR*PR);
    A3 = single(0.000325520833333*PR*PR*PR);

    negatives = x<0;
    y  = ones(size(x), 'single');

    x = abs(x);
    small_values = x<13;
    t = x(small_values);

    t = A0 + t.*(A1 + t.*(A2 + t.*(A3)));
    t = t .* t;
    t = t .* t;
    t = t .* t;
    t = t .* t;         % now t ~ exp(2*2/3 * |x|)
    
    y(small_values) = PO * (t - single(1))./(t + single(1));
    y(negatives) = - y(negatives);
    
end