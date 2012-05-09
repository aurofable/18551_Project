function PA_showimage(patno)

  ud = get(gcf,'UserData');
  ud{2} = patno;
  Patterns = ud{3};
  Result = ud{4};
  Desired = ud{5};

  delete(findobj(gcf,'Tag','a1'));
  axes('Position',[1/27 2/35 25/27 25/35]);
  pic = reshape(Patterns(:,patno),30,32);
  image(pic*31+32)
  xlabel(['Road Image #' int2str(patno)])
  set(gca,'xtick',0,'ytick',[],'Tag','a1')

  delete(findobj(gcf,'Tag','a2'));
  if length(Result) > 1
    axes('position',[3/27 30/35 20/27 1/35]);
    image(Result(:,patno)'*31+32)
    xlabel('Network Output')
    set(gca,'xtick',0,'ytick',[],'Tag','a2')
  end

  delete(findobj(gcf,'Tag','a3'));
  axes('position',[3/27 33/35 20/27 1/35]);
  image(Desired(:,patno)'*31+32)
  xlabel('Correct Steering Direction')
  set(gca,'xtick',0,'ytick',[],'Tag','a3')

  drawnow
