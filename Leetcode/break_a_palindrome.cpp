class Solution {
public:
    string breakPalindrome(string palindrome) {
        int l=palindrome.size();
        if(l==1) return "";
        
        for(int i=0;i<l;i++){
            if(i==l/2 && l&1){
                continue;
            }
            if(palindrome[i]>'a'  ){
                palindrome[i]='a';
                break;
            }
            if(i==l-1){
                palindrome[l-1]='b';
            }
        }
        return palindrome;
    }
};