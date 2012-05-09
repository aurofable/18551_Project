function PA_buttons(dir)

  ud = get(gcbf,'UserData');

  patno = ud{2};
  Patterns = ud{3};
  NPATS = size(Patterns,2);

  newpatno = patno+dir;
  if newpatno < 1, newpatno = NPATS;
   elseif newpatno > NPATS, newpatno = 1;
  end

  ud{2} = newpatno;
  set(gcf,'UserData',ud)

  PA_showimage(newpatno)
