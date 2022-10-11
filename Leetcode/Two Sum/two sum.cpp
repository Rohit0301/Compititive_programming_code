class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,vector<int>> m;
        int i=0;
        for(auto x : nums ){
            m[x].push_back(i);
            i++;
        }
        i=0;
        for(auto x : nums){
            if(m.find(target-x)!=m.end()){
                if((2*x)==target){
                    if(m[x].size()>1){
                        vector<int> v;
                        v.push_back(m[x][0]);
                        v.push_back(m[x][1]);
                        return v;
                    }
                }
                else{
                    vector<int> v;
                    v.push_back(i);
                    v.push_back(m[target-x][0]);
                    return v;
                }
            }
            i++;
        }
        return {};
    }
};