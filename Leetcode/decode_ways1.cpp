class Solution {
public:
    int numDecodings(string s) {
        vector<int> dp(s.size()+1,0);
        if(s[0]!='0') // if string starts with zero
        dp[0]=1;
        for(int i=1;i<s.size();i++){
            if(s[i-1]=='0'&&s[i]=='0')dp[i]=0;
            else if(s[i-1]=='0'&&s[i]!='0')dp[i]=dp[i-1];
            else if(s[i-1]!='0'&&s[i]=='0'){ 
                    if(s[i-1]=='1'||s[i-1]=='2')dp[i]=i>=2?dp[i-2]:1;
					// previous element can only be 1 or 2 as 30 is out of bound.
                    else dp[i]=0;
            }else{
                if(stoi(s.substr(i-1,2))<=26){
                    dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
                }else{
                    dp[i]=dp[i-1];
                }
            }
        }
        return dp[s.size()-1];
    }
};