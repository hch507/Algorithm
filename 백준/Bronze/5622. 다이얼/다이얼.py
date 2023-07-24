import sys
input = sys.stdin.readline

l =['ABC','DEF','GHI','JKL','MNO','PQRS','TUV',"WXYZ"]
n = list(map(str,input().rstrip()))
sum=0
for i in n:
    for j in l:
        if(i in j):
            sum= sum+int(l.index(j))+3

print(sum)