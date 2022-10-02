#Read the number of test cases.
T = int(input())
for tc in range(T):
    # Read integers N and X.
    (n, x) = map(int, input().split(' '))
    if(x<n/2):
        print(x)
    else:
        print(n-x)