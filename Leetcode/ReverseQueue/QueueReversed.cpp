
#include <bits/stdc++.h>
using namespace std;


void Print(queue<int>& Queue)
{
	while (!Queue.empty()) {
		cout << Queue.front() << " ";
		Queue.pop();
	}
}

// Function to reverse the queue
void reverseQueue(queue<int>& q)
{
	// base case
	if (q.size() == 0)
		return;
	// storing front(first element) of queue
	int fr = q.front();

	// removing front
	q.pop();

	// asking recursion to reverse the queue
	// leftover queue
	reverseQueue(q);

	// placing first element

	q.push(fr);
}


int main()
{
	queue<int> Queue;
	Queue.push(1);
	Queue.push(2);
	Queue.push(3);
	Queue.push(4);
	Queue.push(5);
	Queue.push(6);
	Queue.push(7);
	Queue.push(8);
	Queue.push(9);
	Queue.push(10);

	reverseQueue(Queue);
	Print(Queue);
}
