function out = subsample2(inp, sizes, strides)

    inp_rows_range = 1:strides(1):(size(inp,1)-sizes(1)+1);
    inp_cols_range = 1:strides(2):(size(inp,2)-sizes(2)+1);
    out = zeros(numel(inp_rows_range), numel(inp_cols_range), size(inp,3), class(inp));
    for c = 0:(sizes(2)-1),
        for r = 0:(sizes(1)-1),
            out = out + inp(r+inp_rows_range, c+inp_cols_range, :);
        end % inp rows loop
    end % inp cols loop

end % of function subsample2