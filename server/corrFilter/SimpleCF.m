% Simple CF

% a = double(x003);

tst = ifft2(fft2(a).*conj(H{1}));

tst = tst./max(max(tst));

psrMaxt = max(max(tst));
psrMeant = mean(mean(tst));

PSRt = abs((psrMaxt - psrMeant)/(std(tst(:))));

mesh(fftshift(abs(tst)));
