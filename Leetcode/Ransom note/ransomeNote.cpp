class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        
        map<char,int>m1,m2;
        
        for(int i=0;i<magazine.size();i++){
            
            m1[magazine[i]]++;
        }
        
        for(int i=0;i<ransomNote.size();i++){
            
            m1[ransomNote[i]]--;
        }
        
        for(auto it=m1.begin();it!=m1.end();it++){
            
            if(it->second<0) return false;
        }
        return true;
        
        
        
        
    }
};
