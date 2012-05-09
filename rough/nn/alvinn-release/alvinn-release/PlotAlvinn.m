function PlotAlvinn(patno,Patterns,Result,Desired)

% PlotAlvinn(patno,Patterns,Result,Desired)
%   patno is an integer from 1 to size(Patterns,2)
%   Patterns is of size NINPUTS x NPATS
%   Result is either of size NOUTPUTS x 1, or is 0.
%   Desired is of size NOUTPUTS x 1

ud = get(gcf,'UserData'); setup = 1;

if iscell(ud)
  if strcmp(ud{1},'PlotAlvinn')
    setup = 0;
  end
end

if setup
  clf reset, whitebg(gcf,[0 0 0])
  alvinn_colormap = [0*(1:32), 1:32; 0*(1:64); 32:-1:1, 0*(1:32)]'/32;
  green = max(0,((1:64)-48)/20)'; green=max(green,flipud(green));
  alvinn_colormap(:,2) = green;
  alvinn_colormap = [alvinn_colormap; 0 0 0] .^ (1/2);
  colormap(alvinn_colormap)

  upbutton = uicontrol(gcf,'Units','normalized', ...
	  'Position',[24.5/27 32.5/35 2/27 2/35],'String','+', ...
	  'CallBack','PA_buttons(1)');

  downbutton = uicontrol(gcf,'Units','normalized', ...
	  'Position',[24.5/27 29.5/35 2/27 2/35],'String','-', ...
	  'CallBack','PA_buttons(-1)');
end

set(gcf,'UserData',{'PlotAlvinn',patno,Patterns,Result,Desired})

PA_showimage(patno)
