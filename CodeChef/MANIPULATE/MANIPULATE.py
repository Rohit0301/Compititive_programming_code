#Read no.of testcases
t=int(input())
for l in range(t):
    #Read x and y
    #If y numb of guards is greater than x the guards that can be manipulated 
    # we say it is not possible for Ezio to mainpulate all guards
    x,y=map(int,input().split())
    if y>x:
        print("NO")
    else:
        print("YES")