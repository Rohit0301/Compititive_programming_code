import math
T = int(input())
for i in range(T):
    a, b, d = map(int, input().split())
    _gcd = math.gcd(a, b)

    if d % _gcd != 0:
        print("No")
    else:
        print("Yes")
