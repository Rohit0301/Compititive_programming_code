// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {

        priority_queue<int> pq(nums.begin(),nums.end());

	    for(int i=1;i<k;++i) pq.pop();

	    return pq.top();        
    }
};