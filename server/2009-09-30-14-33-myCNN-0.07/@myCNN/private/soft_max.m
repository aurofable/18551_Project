function [f dfx dfa] = soft_max(x, a)
% function [F DFX DFA] = SOFT_MAX(X, A)
% computes soft-max like operation of X over its first two dimensions
% with parameter A. The operation is defined by
%       F = \sum_i(X[i]*exp(A*X[i]) / \sum_i(exp(A*X[i])
% and its first partial derivatives w.r.t X and A.
% The behaviour of the SOFT_MAX is defined by the parameter A and it is:
% close to MAX if A>>1 (e.g. A=100), close to MIN if A<<-1 (e.g. A=-100)
% and coincides with MEAN iff A==0. 
%
%
% INPUT:
%   X               - input array
%   A               - soft-max parameter
%
% OUTPUT:
%   F              - result of soft-max
%   DFX            - first partial derivative of F w.r.t X (dF/dX)
%   DFA            - first partial derivative of F w.r.t A (dF/dA)
%
% SOFT_MAX is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-28

    size_x = size(x);
    if numel(size_x)>2,        
        x_higher_dims = size_x(3:end);
    end
    
    n_slices = prod(x_higher_dims); % size(x, 3);
    x = reshape(x, [size_x(1:2) n_slices]);

    if n_slices == 1,
        s = exp(a*x);   S = sum(s(:));
        p = x .* s;     P = sum(p(:));
        q = x .* p;     Q = sum(q(:));
        f = P / S;
        if nargout > 1,
            dfx = (1 + a * (x - f)) .* s / S;
            if nargout > 2,
                dfa = Q / S - f*f;
            end % of nargout > 2 branch
        end % of nargout > 1 branch
    else % n_slices > 1
        rows = size_x(1);
        cols = size_x(2);

        if numel(a) == 1,
            a = a(ones(n_slices, 1)); % instead of repmat
        end

        b = repmat( reshape(a, [1 1 n_slices]), [rows cols 1]);
        s = exp(b.*x);  S = sum(sum(s));
        p = x .* s;     P = sum(sum(p));
        q = x .* p;     Q = sum(sum(q));
        f = P ./ S;
        if nargout > 1,
            dfx = shiftdim( 1 + b .* ( x - repmat(f, [rows cols 1]) ) .* s ./ repmat( S, [rows cols 1]));
            dfx = reshape( dfx, [rows cols x_higher_dims]);
            if nargout > 2,
                dfa = reshape( Q ./ S - f.*f, [x_higher_dims 1]);
            end % of nargout > 2 branch
        end % of nargout > 1 branch
        f = reshape(f, [x_higher_dims 1]);
    end % of n_slices == 1 if
    
end % of function soft_max