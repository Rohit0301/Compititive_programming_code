/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
      
    ListNode dummy_head(0);
    dummy_head.next = head;

    ListNode* slow = &dummy_head; 
    ListNode* fast = &dummy_head;

    for (int i = 1; i <= n + 1; i++)
        fast = fast->next;

    while(fast != nullptr) 
    {
        fast = fast->next;
        slow = slow->next;
    }

    ListNode *to_be_deleted = slow->next;
    slow->next = slow->next->next;
    
    delete to_be_deleted;

    return dummy_head.next;
    }
};