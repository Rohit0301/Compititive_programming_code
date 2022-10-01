class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        set<string> ans;
        string morse[26] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < words.size(); i++) {
            string s;
            for (int j = 0; j < words[i].size(); j++) {
                s += morse[words[i][j] - 'a'];
            }
            ans.insert(s);
        }
        return ans.size();
    }
};