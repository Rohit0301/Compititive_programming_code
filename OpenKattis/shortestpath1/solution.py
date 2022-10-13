import sys
import io
import os

from collections import defaultdict
from queue import PriorityQueue

input = io.BytesIO(os.read(0,os.fstat(0).st_size)).readline

while True:
	n, m, q, s = map(int, input().split())
	if (n + m + q + s) == 0:
		break
	arr = defaultdict(lambda: [])
	for i in range(m):
		u, v, w = map(int, input().split())
		arr[u].append((w, v))

	distance = defaultdict(lambda: 2e9)
	visited = defaultdict(lambda: False)
	short_path = PriorityQueue(maxsize=m)

	distance[s] = 0;
	short_path.put((0, s))

	while not short_path.empty():
		node = short_path.get()[1]

		if visited[node]: continue
		visited[node] = True

		for w, n in arr[node]:
			if distance[n] > w + distance[node]:
				distance[n] = w + distance[node]
				short_path.put((distance[n], n))

	for i in range(q):
		query = int(input())
		if distance[query] == 2e9:
			sys.stdout.write("Impossible\n")
			sys.stdout.flush()
		else:
			sys.stdout.write(str(distance[query]) + '\n')
			sys.stdout.flush()
	sys.stdout.write('\n')
	sys.stdout.flush()
