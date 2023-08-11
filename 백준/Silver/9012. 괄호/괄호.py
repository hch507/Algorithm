import sys
input = sys.stdin.readline

m= int(input())

l = [list(map(str, input().rstrip())) for _ in range(m)]

for i in l:
    s = []
    for j in i:
        if(j=='('):
            s.append(j)
        elif(j==')'):
            if len(s)==0:
                s.append(j)
                break
            else:
                s.pop()

    if not s:
        print("YES")
    else:
        print("NO")
