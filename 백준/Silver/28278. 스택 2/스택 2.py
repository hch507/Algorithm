import sys
input= sys.stdin.readline

stack=[]
n= int(input())
m = [list(map(int, input().split())) for _ in range(n)]

for i in m:
    if(i[0]==1):
        stack.append(i[1])
    elif(i[0]==2):
        if(len(stack)>0):
            print((stack.pop()))
        else:
            print("-1")
    elif(i[0]==3):
        print(len(stack))
    elif(i[0]==4):
        if stack:
            print(0)
        else:
            print(1)
    elif(i[0]==5):
        if(len(stack)==0):
            print("-1")
        else:
            print(stack[-1])

