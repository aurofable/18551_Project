% Quick script to show images

function displayChars(char)

display = [];
displayRow = [];
for i = 1:length(char)
    displayRow = [displayRow char{i}];
    if (mod(i, 5) == 0) 
        display = [display; displayRow];
        displayRow = [];
    end
end
imshow(display);
end