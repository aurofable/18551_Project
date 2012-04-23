function data_dir = get_data_dir_on_host
% function data_dir = get_data_dir_on_host
% Returns the data directory name on the computer being used.
%
% OUTPUT
%   data_dir    - the data directory string.
%
% Matlab code by Nikolay Chumerin, K.U.Leuven, Belgium.
% Nikolay.Chumerin@med.kuleuven.be
% http://simone.neuro.kuleuven.be/nick
% Last update: 2009-01-12

    if ispc,
        hostname = lower(strtok(getenv('COMPUTERNAME'), '.'));
    else
        hostname = lower(strtok(getenv('HOSTNAME'), '.'));
    end

    switch host
        case {'sidonia' 'solaris' 'siren' 'simone' 'sue' 'smurfin', 'sunny'}
            data_dir = '/data/data2_sidonia/nick/';
        case {'noone-laptop' 'noone-at-home'},
            data_dir = 'd:/data/';
        otherwise
            error('I don''t know this machine. Sorry...')
    end % of host switch

end % of function get_data_dir_on_host