rows     = 32;
cols     = rows;
n_images = 1;

test_images = zeros(rows, cols, n_images, 'uint8');

%  test_images(:,:,3) = 255;
%
test_images(:,:,1) = uint8(rand(rows, cols)*256);
%
%  subplot(131); imshow(test_images(:,:,1));
%  subplot(132); imshow(test_images(:,:,2));
%  subplot(133); imshow(test_images(:,:,3));
%



file_name   = ['test-random-image'];
fi          = fopen(file_name, 'w', 'ieee-be');
fwrite(fi, 2051, 'int32');
fwrite(fi, size(test_images, 3), 'int32');
fwrite(fi, size(test_images, 1), 'int32');
fwrite(fi, size(test_images, 2), 'int32');
fwrite(fi, permute(test_images, [2 1 3]), 'uint8');
fclose(fi);

save([file_name '.mat'], 'test_images')
