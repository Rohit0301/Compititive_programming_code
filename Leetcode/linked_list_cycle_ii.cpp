/*
 https://leetcode.com/problems/linked-list-cycle-ii/description/
*/

ListNode *detectCycle(ListNode *head) {
	if(!head)
		return NULL;

	ListNode *fast = head;
	ListNode *slow = head;
	bool isCycle = false;

	while(fast && fast -> next)
	{
		slow = slow -> next;
		fast = fast -> next -> next;

		if(slow == fast)
		{
			isCycle = true;
			break;
		}
	}

	if(!isCycle)
		return NULL;

	slow = head;
	while(slow != fast)
	{
		slow = slow -> next;
		fast = fast -> next;
	}

	return fast;        
}