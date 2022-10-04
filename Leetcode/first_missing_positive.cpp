class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int i=1,j=0,n=nums.size();
        long long a=nums[n-1];
        while(i<a+2){
            if(binary_search(nums.begin(),nums.end(),i)){
                i++;
            }
            else{
                return i;
            }
        }
        return 1;
    }
};

