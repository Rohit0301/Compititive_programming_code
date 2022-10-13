from math import gcd
while True:
	try:
		t=[int(i) for i in input().split()]
		lcm=t[0]
		for i in range(len(t)):
			lcm = (lcm*t[i]) // gcd(lcm,t[i])
		print(lcm)
	except EOFError:
		break

