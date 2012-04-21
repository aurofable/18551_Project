% Script to process new data images

img = imread('received.jpg');
chars = segment(img);
displayChars(chars);

%%
for i=38:42
   dataIndex = dataIndex + 1;
   a{dataIndex} = chars{i};
end