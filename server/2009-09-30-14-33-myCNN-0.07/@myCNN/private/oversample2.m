function out = oversample2(inp, sizes, strides)

%      sizes = size(inp);
    out = zeros(size(inp).*strides + sizes - strides, class(inp));
    in_rows_range = 1:sizes(1);
    in_cols_range = 1:sizes(2);

    r_off = 0;                  % row offset
    for r = 1:size(inp, 1),     % current row in inp
        c_off = 0;              % column offset
        for c = 1:size(inp, 2), % current column in dY
            out(r_off+in_rows_range, c_off+in_cols_range) = ...
                out(r_off+in_rows_range, c_off+in_cols_range) + inp(r,c);
            c_off = c_off + strides(2); % update column offset
        end % inp cols loop
        r_off = r_off + strides(1); % update row offset
    end % inp rows loop

end % of function oversample2