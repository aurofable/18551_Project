function [s ds] = squash_and_dsquash(t)
%  function [s ds] = squash_and_dsquash(t)
    s   = 1.71593428 * tanh(0.6666666666666666667 * t);
    ds  = 0.388515268001212 * (1.71593428 - s) .* (1.71593428 + s);
end % of function squash_and_dsquash