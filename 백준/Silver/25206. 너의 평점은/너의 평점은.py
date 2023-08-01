import sys
input = sys.stdin.readline
rating = {'A+':4.5, 'A0':4.0, 'B+':3.5 , 'B0':3.0, 'C+':2.5, 'C0':2.0, 'D+':1.5, 'D0':1.0,'F':0}
sum=0
rate=0
for i in range(20):
    n,m,v = map(str, input().split())
    if (v=='P'):
        continue

    rate += float(m) * rating[v]
    sum += float(m)

print(rate/sum)