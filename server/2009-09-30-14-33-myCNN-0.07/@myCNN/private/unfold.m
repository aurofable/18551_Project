function out = unfold(inp, win_size, strides)
% function OUT = UNFOLD(INP, WIN_SIZE, STRIDES)
% Unfolds the input array INP over its first two dimensions, which means
% cutting INP into pieces of size WIN_SIZE slided over INP with shifts STRIDES. 
% UNFOLD properly works with arrays of dimensionality more then 2, preserving their
% dimensionality.
%
% INPUT:
%   INP             - input array
%   WIN_SIZE        - window size [rows cols]
%   STRIDES         - strides (window shifts), optional parameter (by default STRIDES=WIN_SIZE)
%
% OUTPUT:
%   OUT             - unfolded INP
%
% EXAMPLE:
%   X = reshape(1:4*3*2, [4 3 2]);  % create a 3D (4x3x2) array 
%   UX = unfold(X, [2 2], [1 1]);
% Produces 5D ([2x2]x[3x2]x2) array UX, where the first two dimensions are [2x2] windows,
% which were 'slided' 3 times in vertically and 2 times horizontally [3x2].
% The last (5th) dimension [2], in this case, corresponds to the number of the slices
% in the input array X (size(X, 3) == 2). 
% 
% UNFOLD is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-28

    if nargin<3,
        strides = win_size;
    end

    inp_size = size(inp);
    if numel(inp_size)>2,
        inp_higher_dims = inp_size(3:end);
    else
        inp_higher_dims = 1;
    end
    
    inp_rows_range = 1:strides(1):(inp_size(1) - win_size(1) + 1);
    inp_cols_range = 1:strides(2):(inp_size(2) - win_size(2) + 1);

    urows = numel(inp_rows_range);
    ucols = numel(inp_cols_range);

    out = zeros( [win_size urows ucols inp_higher_dims], class(inp) );

    for s_i = 1:prod(inp_higher_dims),
        for c_i = 1:ucols,
            c = inp_cols_range(c_i);
            for r_i = 1:urows,
                r = inp_rows_range(r_i);
                out(:, :, r_i, c_i, s_i) = inp(r:r+win_size(1)-1, c:c+win_size(2)-1, s_i);
            end % inp rows loop
        end % inp cols loop
    end % inp slices loop

end % of function UNFOLD