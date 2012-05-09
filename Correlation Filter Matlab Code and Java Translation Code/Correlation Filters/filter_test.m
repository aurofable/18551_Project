% 18-551 Spring 2012
% Alex Baran

% generates training images
function out = filter_test(input, allFil)

% selects starting image
q = double(input);
q = imresize(q, [32 32]);

% rotations
qR = imresize(q, [37 37]);
q3p = imrotate(qR, 3);
q3n = imrotate(qR, -3);

% cropping
q3pR = imcrop(q3p, [5 5 31 31]);
q3nR = imcrop(q3n, [5 5 31 31]);

% filters
h1 = fspecial('gaussian', [5 5], 0.5);
h2 = fspecial('gaussian', [5 5], 0.35);
h3 = fspecial('gaussian', [5 5], 0.65);

% passing image through filters
c1 = imfilter(q, h1);
c2 = imfilter(q, h2);
c3 = imfilter(q, h3);

c4 = imfilter(q3pR, h1);
c5 = imfilter(q3pR, h2);
c6 = imfilter(q3pR, h3);

c7 = imfilter(q3nR, h1);
c8 = imfilter(q3nR, h2);
c9 = imfilter(q3nR, h3);

% sizing and setting output
out = cell(3,1);
out{1} = q;
out{2} = q3pR;
out{3} = q3nR;

if allFil == 1
    out = cell(12,1);
    out{1} = q;
    out{2} = c1;
    out{3} = c2;
    out{4} = c3;
    out{5} = q3pR;
    out{6} = c4;
    out{7} = c5;
    out{8} = c6;
    out{9} = q3pR;
    out{10} = c7;
    out{11} = c8;
    out{12} = c9;
end

if allFil == 2
    out = cell(28,1);
    out{1} = q;
    out{2} = c1;
    out{3} = c2;
    out{4} = c3;
    out{5} = q3pR;
    out{6} = c4;
    out{7} = c5;
    out{8} = c6;
    out{9} = q3pR;
    out{10} = c7;
    out{11} = c8;
    out{12} = c9;
    % rotations
    q6p = imrotate(qR, 6);
    q6n = imrotate(qR, -6);
    q9p = imrotate(qR, 9);
    q9n = imrotate(qR, -9);
    % cropping
    q6pR = imcrop(q6p, [5 5 31 31]);
    out{13} = q3pR;
    q6nR = imcrop(q6n, [5 5 31 31]);
    out{17} = q3pR;
    q9pR = imcrop(q9p, [7 7 31 31]);
    out{21} = q3pR;
    q9nR = imcrop(q9n, [7 7 31 31]);
    out{25} = q3pR;
    % filtering
    c10 = imfilter(q6pR, h1);
    c11 = imfilter(q6pR, h2);
    c12 = imfilter(q6pR, h3);
    out{14} = c10;
    out{15} = c11;
    out{16} = c12;

    c13 = imfilter(q6nR, h1);
    c14 = imfilter(q6nR, h2);
    c15 = imfilter(q6nR, h3);
    out{18} = c13;
    out{19} = c14;
    out{20} = c15;

    c16 = imfilter(q9pR, h1);
    c17 = imfilter(q9pR, h2);
    c18 = imfilter(q9pR, h3);
    out{22} = c16;
    out{23} = c17;
    out{24} = c18;

    c19 = imfilter(q9nR, h1);
    c20 = imfilter(q9nR, h2);
    c21 = imfilter(q9nR, h3);
    out{26} = c19;
    out{27} = c20;
    out{28} = c21;
end

% out = {q; c1; c2; c3; q3pR; c4; c5; c6; q3nR; c7; c8; c9; q6pR; };

% plots
% subplot(7,4,1); imshow(q);
% subplot(7,4,2); imshow(c1);
% subplot(7,4,3); imshow(c2);
% subplot(7,4,4); imshow(c3);
% subplot(7,4,5); imshow(q3pR);
% subplot(7,4,6); imshow(c4);
% subplot(7,4,7); imshow(c5);
% subplot(7,4,8); imshow(c6);
% subplot(7,4,9); imshow(q3nR);
% subplot(7,4,10); imshow(c7);
% subplot(7,4,11); imshow(c8);
% subplot(7,4,12); imshow(c9);
% subplot(7,4,13); imshow(q6pR);
% subplot(7,4,14); imshow(c10);
% subplot(7,4,15); imshow(c11);
% subplot(7,4,16); imshow(c12);
% subplot(7,4,17); imshow(q6nR);
% subplot(7,4,18); imshow(c13);
% subplot(7,4,19); imshow(c14);
% subplot(7,4,20); imshow(c15);
% subplot(7,4,21); imshow(q9pR);
% subplot(7,4,22); imshow(c16);
% subplot(7,4,23); imshow(c17);
% subplot(7,4,24); imshow(c18);
% subplot(7,4,25); imshow(q9nR);
% subplot(7,4,26); imshow(c19);
% subplot(7,4,27); imshow(c20);
% subplot(7,4,28); imshow(c21);
