% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu
% noisify is used to making the training set noisy

function output = noisify(DataSet)
    numNoiseInputs = 5; % removing rotation for now
    output = cell(length(DataSet), 1);
    for i = 1:length(DataSet)
        char = DataSet{i};
        outChar = cell(length(char), 1);
        for j = 1:length(char)
            img = char{j};
            flips = randi(0:1, [numNoiseInputs 1]);
            for k = 1:numNoiseInputs
                if (flips(k) == 1)
                    switch k
                        case 1 % Gaussian
                            img = imnoise(img, 'gaussian');
                        case 2 % localvar
                            img = imnoise( img(:,:,1), 'localvar', [0:0.1:1], [0:0.1:1].^3); 
                        case 3
                            img = imnoise(img, 'poisson');
                        case 4
                            img = imnoise(img, 'salt & pepper');
                        case 5
                            img = imnoise(img, 'speckle');
                        %case 6
                            %img = imrotate(img, unidrnd(40) - 20);
                    end %switch
                end %if
            end %for
            outChar{j} = img;
        end %for
        output{i} = outChar;
    end
return