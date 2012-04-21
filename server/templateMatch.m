% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% Implements template matching with segmented image

function output = templateMatch(chars, templateBank)
    
    output = zeros(1, length(chars));
    for i = 1:length(chars)
        thumbnail = imresize(chars{i}, 0.25);
        vote = zeros(length(templateBank), 1);
        for j = 1:length(templateBank)
            c = ifft2(fft2(thumbnail).*conj(fft2(templateBank{j})));
            c = c./max(max(c));
            c = 1 - mean(c);
           vote(j) = max(max(c));
        end
        
        [maxVal index] = max(vote);
        output(i) = index;
    end
end

