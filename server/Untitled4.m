% random test script

x = 7*randn(100, 1) + 2*randn(100, 1);
y = 2*randn(100, 1) + 4*randn(100, 1);

p = polyfit(x, y, 1);
p1 = [0 p(2)];
p2 = [-1*p(1)/p(2) 0];
a = p1 - p2;

figure
scatter(x, y);
hold on
plot([p1(1),p2(1)], [p1(2),p2(2)], 'r');
%hold off

remIndex = [];
for i = 1:length(x)
    b = [x(i) y(i)] - p2;
    d = abs(y(i) - p1(1)*x(i) - p2(2)) / sqrt(p1(1) * p1(1) + 1);
    if d > 2
        remIndex = [remIndex i];
    end
end

x(remIndex) = [];
y(remIndex) = [];

%figure
scatter(x, y, 'g');
hold off
%plot([p1(1),p2(1)], [p1(2),p2(2)], 'g');
%hold off