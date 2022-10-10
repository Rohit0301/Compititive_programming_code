class Solution {
    int maxVal=INT_MAX,ans;
public:
    int threeSumClosest(vector<int>& nums, int target) {
        
        
        sort(nums.begin(),nums.end());
        int len = nums.size();
       for(int i=0;i<len;i++){
           int start=i+1,end=len-1;
           while(start<end){
               int val = nums[i]+nums[start]+nums[end];
               int  temp = abs(val-target);
               if(val==target) return target;
               else if(temp<maxVal){
                   maxVal = temp;
                   ans=val;
               }
               if(val>target)end--;
               else start++;
           }
           
       }
        
        return ans;
    }
    
    
    
    
};