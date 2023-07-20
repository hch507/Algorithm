import sys
input= sys.stdin.readline

l=[]
for i in range(10):
    n= int(input())
    l.append(n%42)

print(len(set(l)))