class Solution(object):
    def reverseString(self, arr):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        s=0
        e=len(arr)-1
        while(s<=e):
            arr[s],arr[e]=arr[e],arr[s]
            s+=1
            e-=1
        return(arr)
        