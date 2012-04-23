function [samples targets labels classes] = get_MNIST_data(mnist_file, inp_rows, inp_cols, ...
            classes_to_select, samples_per_class, resize_samples, samples_coeff)
        
    if ~exist('mnist_file', 'var') || isempty(mnist_file),                      mnist_file = 'D:/datasets/MNIST/train_data.mat'; end
    if ~exist('inp_rows', 'var') || isempty(inp_rows),                            inp_rows = 32; end
    if ~exist('inp_cols', 'var') || isempty(inp_cols),                            inp_cols = inp_rows; end
    if ~exist('classes_to_select', 'var') || isempty(classes_to_select), classes_to_select = '0123456789'; end
    if ~exist('samples_per_class', 'var') || isempty(samples_per_class), samples_per_class = 100; end
    if ~exist('resize_samples', 'var')  || isempty(resize_samples),         resize_samples = false; end
    if ~exist('samples_coeff', 'var') || isempty(samples_coeff),             samples_coeff = 1; end
    if ~exist('data_', 'var') || isempty(samples_coeff),             samples_coeff = 1; end

    n_classes = numel(classes_to_select);

    if ~exist(mnist_file, 'file'), 
        mnist_dir = [fileparts(mnist_file) '/'];
        mnist2matlab(mnist_dir)
    end
    
    load(mnist_file);

    selection = zeros(n_classes, samples_per_class);
    for c_i = 1:n_classes,
        class_label = uint8(classes_to_select(c_i)-'0');
        class_indices = find(labels == class_label);                    %#ok<*NODEF> % select samples labelled as class_label
        class_indices = class_indices(randperm(numel(class_indices)));  % randomly permute found indices
        class_indices = class_indices(1:samples_per_class);             % get only what is needed
        selection(c_i,:) = class_indices;                          % add to the index selection
    end
    
    selection = selection(randperm(numel(selection)));
    labels  = labels(selection);
    samples = double(images(:,:,selection)); %#ok<NODEF>


    [in_rows in_cols n_samples] = size(samples);
    classes = unique(labels);
    n_classes = numel(classes);

    targets = -ones(n_classes, n_samples);
    for cl_i = 1:n_classes,
        targets(cl_i, labels == classes(cl_i) ) = +1;
    end
    if (in_rows~=inp_rows) || (in_cols~=inp_cols),
        if resize_samples,
            fprintf('Resizing samples [%gx%g]->[%gx%g]:', in_rows, in_cols, inp_rows, inp_cols)
            transformed_samples = zeros(inp_rows, inp_cols, n_samples, class(samples));
            for i = 1:n_samples,
                transformed_samples(:,:,i) = imresize(samples(:,:,i), [inp_rows inp_cols]);
            end
            fprintf(' done.\n');
        else
            if (inp_rows < in_rows) || (inp_cols < in_cols),
                fprintf('Cropping samples [%gx%g]->[%gx%g]:', in_rows, in_cols, inp_rows, inp_cols)
                transformed_samples = samples((1:inp_rows)+floor((in_rows-inp_rows)/2), ...
                                            (1:inp_cols)+floor((in_cols-inp_cols)/2), :);
                fprintf(' done.\n');
            else
                fprintf('Padding samples [%gx%g]->[%gx%g]:', in_rows, in_cols, inp_rows, inp_cols)
                transformed_samples = zeros(inp_rows, inp_cols, n_samples);
                transformed_samples((1:in_rows)+floor(abs(in_rows-inp_rows)/2), ...
                                    (1:in_cols)+floor(abs(in_cols-inp_cols)/2), :) = samples;
                fprintf(' done.\n');
            end
        end
        samples = transformed_samples;
        clear transformed_samples
    end

    fprintf('Normalizing samples:')
    for i = 1:n_samples,
        sample = samples(:,:,i);
        sample = sample - mean(sample(:));
        sample_std = std(sample(:));
        if sample_std > 0,
            sample = sample / sample_std;
        end
        samples(:,:,i) = sample;
    end
    
    samples = samples * samples_coeff; 
    fprintf(' done.\n');
    
end