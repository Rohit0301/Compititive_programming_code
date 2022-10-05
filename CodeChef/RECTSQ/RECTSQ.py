#import math library so as to use gcd in-built function.
import math
#Read the number of test cases.
t=int(input())
for l in range(t):
    #Read integers m and n
    m,n=map(int,input().split())
    gcd=math.gcd(m,n)
    # As we need to divide the rectangular area into minm number of square plots with same area 
    # we need to take side of the square plot as the greatest number which can divide both lenght and breadth of rectangular plot.
    # Minm number of square plots is area of rectangular plot divide by area of single sqaure plot.
    
    answ=(m*n)/(gcd**2)
    print(int(answ))