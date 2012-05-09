% alvinnhelper.m
%
% This script does the training, following LearnSchedule.

for i = 1:10000

  if epoch >= sum(LearnSchedule(1:sched_pointer,1))
    sched_pointer = sched_pointer + 1;
    if sched_pointer > size(LearnSchedule,1), return, end
  end
  LearnRate = LearnSchedule(sched_pointer,2);
  epoch = epoch+1;

  bp_innerloop_alvinn
  TSS_Record(epoch,1) = TSS;
  if TSS >= min(TSS_Record(1:end-1,1))
  else
    Best_Weights = {Weights1 Weights2 Weights3};
    Best_Index = epoch;
  end

  [CVResult1,CVResult2,CVResult3,CVTSS] = ...
	forwprop(CVInputs1,CVDesired,Weights1,Weights2,Weights3);
  TSS_Record(epoch,2) = CVTSS;
  if CVTSS >= min(TSS_Record(1:end-1,2))
  else
    Best_CV_Weights = {Weights1 Weights2 Weights3};
    Best_CV_Index = epoch;
  end

%   if rem(epoch-1,5) == 0
%       figure(1), PlotAlvinn(max(1,rem(epoch,NPATS)), Patterns,Result2,Desired)
%       figure(2), PlotAlvinnWeights(Weights1,Weights2)
%       figure(3); clf reset, whitebg(gcf,[0 0 0])
%       plot(TSS_Record), hold on, axis([0 200 0 25])
%       plot(Best_Index,TSS_Record(Best_Index,1),'oy')
%       plot(Best_CV_Index,TSS_Record(Best_CV_Index,2),'om')
%       legend('Error','CV Error')
%       drawnow
%   end
  
     %fprintf('Epoch %4d:  Error = %9.3f   CVError = %9.3f\n', ...
		%epoch,TSS,CVTSS);
        fprintf('L2: %d, L3: %d, Epoch %4d:  Error = %9.3f   CVError = %9.3f\n', ...
		l2,l3,epoch,TSS,CVTSS);

  if TSS < TSS_Limit, break, end

  end
