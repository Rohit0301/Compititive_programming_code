class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:

        ptrA = headA
        ptrB = headB
        while ptrA!=ptrB:
            if ptrA==None:
                ptrA = headB
            else:
                ptrA=ptrA.next
                
            if ptrB==None:
                ptrB = headA
            else:
                ptrB=ptrB.next
        
        return ptrA
