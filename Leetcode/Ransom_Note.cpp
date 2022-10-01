class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        //ransomeNote can be constructed from magazine if magazine contains all the letter used in making     ransomeNote
        unordered_map<char, int> m;
        
        //store all the char of magazine so that it can be searched easily
        for(auto x: magazine){
            m[x]++;
        }
        
		for(auto x: ransomNote){
		//magazine  have this char of ransomeNote, used once, decrease frequency
		// when hit's zero return false.(we r using post decrement)
            if(!m[x]--){
                return false;
            }
        }
        return true;
    }
};
