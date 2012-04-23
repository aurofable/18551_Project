function hostname = host
% function hostname = host
% Returns the name of the host computer on which current function is beeing executed.
%
% OUTPUT
%   hostname    - the name of the host
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

end % of function host