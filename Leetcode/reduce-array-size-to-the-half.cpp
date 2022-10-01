class Solution {
public:
    int minSetSize(vector<int>& arr) {
        unordered_map<int,int> map;
        vector<int> v;
        for(int i=0;i<arr.size();i++) {
            map[arr[i]]++;
        }
        unordered_map<int,int>::iterator it;
        for(it=map.begin();it!=map.end();it++) {
            v.push_back(it->second);
        }
        sort(v.begin(),v.end(),greater<int>());
        int sum=0;
        for(int i=0;i<v.size();i++) {
            sum+=v[i];
            if(sum>=arr.size()/2) {
                return i+1;
            }
        }
        return arr.size();
    }
};