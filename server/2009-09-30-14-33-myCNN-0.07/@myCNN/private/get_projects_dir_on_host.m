function proj_dir = get_projects_dir_on_host
% function proj_dir = get_projects_dir_on_host
% Returns projects directory on the computer being used.
%
% OUTPUT
%   proj_dir    - the data directory string.
%
% Matlab code by Nikolay Chumerin, K.U.Leuven, Belgium.
% Nikolay.Chumerin@med.kuleuven.be
% http://simone.neuro.kuleuven.be/nick
% Last update: 2009-01-14

    if isunix,
        host = lower(strtok(getenv('HOSTNAME'), '.'));
    else
        host = lower(strtok(getenv('COMPUTERNAME'), '.'));
    end

    switch host
        case {'sidonia' 'solaris' 'siren' 'simone' 'sue' 'smurfin', 'sunny'}
            proj_dir = '/home/nick/work/projects/';
        case {'noone-laptop' 'noone-at-home'},
            proj_dir = 'd:/projects/';
        otherwise
            error('I don''t know this machine. Sorry...')
    end % of host switch

end % of function get_data_dir_on_host