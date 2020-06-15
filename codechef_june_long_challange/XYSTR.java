/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int t=0;
	  if(sc.hasNextInt())
	    t=sc.nextInt();
	  for(int j=0;j<t;j++)
	   {
	       String s=sc.next();
	       int max_pair=0;
	        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1))
            {
                max_pair=max_pair+1;
                i++;
            }
        
	        }
	       System.out.println(max_pair);
	   }
	}
}
