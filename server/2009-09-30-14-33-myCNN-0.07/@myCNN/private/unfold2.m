function [out urows ucols] = unfold2(inp, ker_size, strides)
% function [OUT UROWS UCOLS] = UNFOLD2(INP, KER_SIZE, STRIDES)
% Does 2D unfolding of the input INP, whcih means cutting INP into pieces of size KER_SIZE
% slided over INP with shifts STRIDES.
%
% INPUT:
%   INP             - input 2D matrix
%   KER_SIZE        - kernel size [rows cols]
%   STRIDES         - strides (kernel shifts), optional parameter (by default STRIDES=KER_SIZE)
%
% OUTPUT:
%   OUT             - unfolded INP (3D array of size [KER_SIZE(1) KER_SIZE(2) UROWS*UCOLS])
%   UROWS           - number of unfolded rows
%   UCOLS           - number of unfolded cols
%
% EXAMPLE:
%   x = [1  2  3  4
%        5  6  7  8
%        9  10 11 12];
%
%   [ux ur uc] = unfold2(x, [2 2], [1 1]);
% Produces 3D (2x2x6) array ux:
%   ux(:,:,1) = [1 2; 5 6]
%   ux(:,:,2) = [5 6; 9 10]
%   ux(:,:,3) = [2 3; 6 7]
%   ux(:,:,4) = [6 7; 10 11]
%   ux(:,:,5) = [3 4; 7 8]
%   ux(:,:,6) = [7 8; 11 12]
% and two scalars:
%   ur = 2   (unfolded rows)
%   uc = 3   (unfolded columns)
%
% UNFOLD2 is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-24

    if nargin<3,
        strides = ker_size;
    end

    inp_rows_range = 1:strides(1):(size(inp, 1) - ker_size(1) + 1);
    inp_cols_range = 1:strides(2):(size(inp, 2) - ker_size(2) + 1);

    urows = numel(inp_rows_range);
    ucols = numel(inp_cols_range);

    out = zeros(ker_size(1), ker_size(2), urows*ucols, class(inp));
    i = 1;
    for c = inp_cols_range,
        for r = inp_rows_range,
            out(:,:,i) = inp(r:r+ker_size(1)-1, c:c+ker_size(2)-1);
            i = i + 1;
        end % inp rows loop
    end % inp cols loop

end % of function UNFOLD2