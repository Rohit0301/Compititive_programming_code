1328. Break a Palindrome

 
   public String breakPalindrome(String s) {
        
        int l=s.length();
        if(l==1)
            return("");
        
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
          
            if(ch[i]!='a')
            {
                ch[i]='a';
                return(String.valueOf(ch));
            }
        }
        
            ch[l-1]++;
              return(String.valueOf(ch));
     
      
    }