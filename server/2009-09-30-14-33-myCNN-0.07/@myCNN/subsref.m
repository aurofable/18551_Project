function net = subsref(net, subscripts)
% function NET = SUBSREF(NET, SUBSCRIPTS)
% returns reference fields of a network NET
% (allows direct access to the object's NET fields)
% based on SUBREF version of Matlab's Neural Network Toolbox.

    err = 0;
    % For each level of subscripts
    for i = 1:numel(subscripts),
        subs = subscripts(i).subs;
        switch subscripts(i).type
            case '()',  % Paretheses
                eval('net=net(subs{:});', 'err=1;');
            case '{}',  % Curly bracket
                eval('net=net{subs{:}};', 'err=1;');
            case '.',   % Dot
                if isa(net, 'struct') || isa(net, 'myCNN')
                    f = fieldnames(net);
                    for j = 1:length(f),
                        if strcmpi(subs, f{j})
                            subs = f{j};
                            break;
                        end % of if
                    end % of fieldname loop
                end
                eval(['net=net.' subs ';'], 'err=lasterr;');
        end % of switch

        % Error message
        if err
            errmsg = lasterr;
            % Work around: remove any reference to variable net
            ind = findstr(errmsg,' ''net''');
            if (ind)
                errmsg(ind+(0:3)) = [];
            end
            error(errmsg)
        end % error branch
    end % of subscript loop

end % of function SUBSREF