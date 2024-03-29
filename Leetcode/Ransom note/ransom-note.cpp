class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char,int> map;
        for(int i=0;i<ransomNote.size();i++) {
            map[ransomNote[i]]++;
        }
        for(int i=0;i<magazine.size();i++) {
            if(map[magazine[i]]>0) {
                map[magazine[i]]--;
            }
        }
        for(auto i=map.begin();i!=map.end();i++) {
            if(i->second>0) {
                return false;
            }
        }
        return true;
    }
};