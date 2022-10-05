class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int a=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                a=i;
            }
        }
        if(a<0){
            for(int i=0;i<nums.size();i++){
                if(nums[i]<nums[nums.size()-1]  ){
                    if(nums[i]<target && nums[i+1]>target){
                        a=i+1;
                    }
                }
                if(nums[i]==nums[nums.size()-1]){
                    if(target>nums[i]){
                        a=i+1;
                        ;
                    }
                }
                if(nums[i]==nums[0]){
                    if(target<nums[i]){
                        a=0;
                    }
                }
            }
        }
        return a;
    }
};
