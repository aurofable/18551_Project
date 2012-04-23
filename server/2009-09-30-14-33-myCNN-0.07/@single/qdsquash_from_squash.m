function dy = qdsquash_from_squash(y)
    %     PR = single(0.66666666);
    %     PO = single(1.71593428);
%     dy = PR/PO * (PO - y).*(PO + y);
    dy = single(2/3/1.71593428) * ( single(1.71593428^2) - y.^2 );
end % of function qdsquash_from_squash