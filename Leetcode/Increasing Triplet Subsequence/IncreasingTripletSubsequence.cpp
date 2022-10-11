class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
      int a = INT_MAX;
      int b = INT_MAX;
    
      int n = nums.size();
        
        for(auto n:nums){
            if(n <= a)a = n;
            else if( n <= b)b = n;
            else return true;
        }
        return false;
    }
};