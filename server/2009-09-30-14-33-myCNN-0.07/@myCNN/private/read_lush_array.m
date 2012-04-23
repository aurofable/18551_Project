function data = read_lush_array(filename, binary)
% function DATA = READ_LUSH_ARRAY(FILENAME, BINARY)
% Read data from lush data file.
%
% INPUT
%   FILENAME    - name of the lush data file.
%   BINARY      - flag showing if the data are stored in binary (default) or in ASCII format.
%
% OUTPUT
%   DATA        - result data
%
% Matlab code by Nikolay Chumerin, K.U.Leuven, Belgium.
% Nikolay.Chumerin@med.kuleuven.be
% http://simone.neuro.kuleuven.be/nick
% Last update: 2009-01-12

    if ~exist('filename', 'var') || isempty(filename),
        error('Should be at least one parameter - filename!');
    end

    if ~exist('binary', 'var') || isempty(binary),
        binary = true;
    end

    % try to open file
    try
        f = fopen(filename);
    catch %#ok<*CTCH>
        error(['Can''data open file ' filename]);
    end

    % check file's signature / magic number
    if binary,
        magic = int32(fread(f, 1, 'int32'));
        switch upper(dec2hex(magic)),
            case '1E3D4C51', format = 'single';
            case '1E3D4C52', error('Can''data read packed matrices, yet :(')% format = 'packed';
            case '1E3D4C53', format = 'double';
            case '1E3D4C54', format = 'int32'; % ??? 'integer'
            case '1E3D4C56', format = 'short'; % ??? short
            case '1E3D4C55', format = 'uint8'; % byte
            otherwise
                error('File %s is not binary lenet table file!', filename);
        end
        % Read dimensions
        ndim = fread(f, 1, 'int32');             % number of dimensions
        if ndim>0,
            dims = fread(f, max(3, ndim), 'int32');   % dimensions
        else
            ndim = 2;
            dims = [1 1];
        end

    else
        if ~strcmp(fscanf(f,'%4c', 1), '.MAT')
            error('File %s is not ascii lenet table file!', filename);
        end
        format = 'double';
        ndim   = fscanf(f,'%d', 1);     % number of dimensions
        dims   = fscanf(f,'%d', ndim)'; % dimensions
    end

    dims = dims(1:ndim);
    dims = dims(:)';
    if ndim == 1,
        dims = [dims 1];
%         ndim = 2;
    end
 
    % read data
    if binary,
        data = fread(f, prod(dims), format);
    else
        data = fscanf(f, '%f', prod(dims));
    end
    data = reshape(data, fliplr(dims));      % reshape

    switch lower(format),
        case 'single',  data = single(data);
        case 'double',  data = double(data);
        case 'int32',   data = int32(data);
        case 'short',   data = short(data);
        case 'uint8',   data = uint8(data);
    end
    %  data   = permute(data,[ndim:-1:1]);       % permute dimensions
    fclose(f);  % close the file
    
end % of function READ_LUSH_ARRAY