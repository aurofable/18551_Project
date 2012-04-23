function data = read_idx_data(filename)
% function DATA = READ_IDX_DATA(FILENAME)
% Read data from lush IDX data file.
%
% INPUT
%   FILENAME    - name of the lush IDX file
%
% OUTPUT
%   DATA        - result data
%
% Matlab code by Nikolay Chumerin, K.U.Leuven, Belgium.
% Nikolay.Chumerin@med.kuleuven.be
% http://simone.neuro.kuleuven.be/nick
% Last update: 2009-01-12

    % check parameters
    if ~exist('filename', 'var') || isempty(filename),
        error('Should be at least one parameter - filename!');
    end

    % try to open file
    try
        f = fopen(filename);
    catch %#ok<*CTCH>
        error(['Can''data open file ' filename]);
    end

    % check file's signature / magic number
    magic = int32(fread(f, 4, 'uint8'));

    switch magic(3),
        case 08, format = 'uint8';      % 0x08: unsigned byte
        case 09, format = 'int8';       % 0x09: signed byte
        case 13, format = 'single';     % 0x0D: float (4 bytes)
        case 14, format = 'double';     % 0x0E: double (8 bytes)
        otherwise
            error('Unsupported data format');
    end % of format switch

    % Read dimensions
    ndim = double(magic(4));                % number of dimensions
    dims = fread(f, ndim, 'uint32', 'ieee-be')'; % dimensions

    if ndim == 1,
        dims = [dims 1];
        ndim = 2;
    end

    data = reshape(fread(f, prod(dims), ['*' format]), fliplr(dims)); % reshape
    data = permute(data, ndim:-1:1);       % permute dimensions

    fclose(f);  % close the file
    
end % of function READ_IDX_DATA