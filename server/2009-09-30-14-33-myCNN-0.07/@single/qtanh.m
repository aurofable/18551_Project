function y = qtanh(x)
    negatives = x<0;
    y = ones(size(x), class(x));
    x = abs(x);
    small_values = x<13;
    t = x(small_values);
%     t = (1 + t.*(0.125 + t.*(0.0078125 + t.*0.000325520833333))).^16;
    t = (1 + t.*(0.125 + t.*(0.0078125 + t.*0.000325520833333)));
    t = t .* t;
    t = t .* t;
    t = t .* t;
    t = t .* t;
    % now t ~ exp(2*x)

    y(small_values) = (t - 1) ./ (t + 1);
    y(negatives) = - y(negatives);
end % of funtion qtanh