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
		 for(int j=0;j<t;j++){
		     int n=sc.nextInt();
		     int arr[]=new int[n];
		     int i=0;
		     for(int k=0;k<n;k++){
		         arr[k]=sc.nextInt();
		     }

		     int five=0,ten=0;
		     String ans="NO";
		     for(i=0;i<n;i++){
		          if(arr[0]!=5)
		               {
		                   ans="NO";
		                   break;
		               }
		         else if(arr[i]==5)
		            {
		                five=five+1;
		            }
		         else if(arr[i]==10)
		            {
		               if(five==0)
		               {
		                ans="NO";
		                break;
		               }
		               else
		               {
		                   ten=ten+1;
		                   five=five-1;
		               }
		            }
		         else if(arr[i]==15)
		            {
		               if(ten>0)
		               {
		                ten=ten-1;
		  
		               }
		               else if(five>1)
		               {
		                  
		                   five=five-2;
		               }
		               else
		               {
		                   ans="NO";
		                   break;
		               }
		            }
		         
		 }
		         if(i==n)
		          ans="YES";
		       
		     System.out.println(ans);
		 }
	}
}
