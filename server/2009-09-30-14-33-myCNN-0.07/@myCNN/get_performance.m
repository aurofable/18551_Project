function [RMSE RSE out miscl_rate] = get_performance(net, samples, targets)
% function [RMSE RSE OUT MISCL_RATE] = GET_PERFORMANCE(NET, SAMPLES, TARGETS)
% returns several performance measures of the network NET on test data (SAMPLES and TARGET)
%
% INPUT:
%   NET             - mynet object
%   SAMPLES         - input test data
%   TARGETS         - desired outputs
%
% OUTPUT:
%   RMSE            - root mean square error
%   RSE             - root square error
%   OUT             - output of the NET on the input data (SAMPLES)
%   MISCL_RATE      - misclassification rate

%
% GET_PERFORMANCE is a part of a matlab implementation of the extended
% convolutional network.
%
% Developed by Nikolay Chumerin
% http://sites.google.com/site/chumerin
%
% Last update: 2009-09-03

    sample_dimensions = ndims(samples);
    n_samples = size(samples, sample_dimensions(end));
    n_classes = size(targets, 1);

    [net out] = propagate(net, samples);

    maxima = double( repmat(max(out), [n_classes 1]) == out );
    correct_classifications  = sum((maxima == targets));
    miscl_rate = 1 - sum(correct_classifications) / n_samples;
    SE   = sum( (out - targets).^2);
    RSE  = sqrt(SE);
    RMSE = sqrt(mean(SE));

end % of function GET_PERFORMANCE