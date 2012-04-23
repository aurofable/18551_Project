% Spring 2012, 18-551 Project
% James Chun, jtchun@andrew.cmu.edu

% quick script to display outline

function displayOutline(outline)
    if(~isempty(outline))
      hold on;
      plot(outline(:,2),outline(:,1),'g','LineWidth',2);
      %hold on;
      %plot(col, row,'gx','LineWidth',2);
   else
      %hold on; plot(col, row,'rx','LineWidth',2);
    end
end