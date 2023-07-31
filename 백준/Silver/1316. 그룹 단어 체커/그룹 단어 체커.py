import sys
input = sys.stdin.readline

n= int(input())
l= [input() for _ in range(n)]

a=0

for i in l:
    de = []
    cnt = 0
    for j in range(len(i)):

        if(len(de)>0):
            if(i[j]==i[j-1]):
                de.append(cnt)
            else:
                cnt=cnt+1
                de.append(cnt)
        else:
            de.append(cnt)
    if(de[-1]==len(set(i))-1):
        a=a+1

print(a)