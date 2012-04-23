function log_it(msg, varargin)
    global logfilename save_log
    if exist('save_log', 'var') && ~isempty(save_log) && save_log && exist('logfilename', 'var'),
        logfile = fopen(logfilename, 'A');
        fprintf(logfile, '[%04g-%02g-%02g-%02g-%02g-%06.3f]', clock);
        fprintf(logfile, [' ' msg '\n'], varargin{:});
        fclose(logfile)
    end
    fprintf('[%04g-%02g-%02g-%02g-%02g-%06.3f]', clock);
    fprintf([' ' msg '\n'], varargin{:});
end