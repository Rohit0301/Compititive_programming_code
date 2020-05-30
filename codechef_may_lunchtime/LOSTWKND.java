/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc= new Scanner(System.in);
		 int t=0,n=5;
		 if(sc.hasNextInt())
		 {
		     t=sc.nextInt();
		 }
		 for(int i=0;i<t;i++)
		 {
		     int sum=0,remaining=0;
		 int arr[]=new int[5];
		 for(int j=0;j<n;j++)
		 {
		     
		     arr[j]=sc.nextInt();
		 }
		
		 int p=sc.nextInt();
		 
		 for(int j=0;j<n;j++)
		 {
		     arr[j]=arr[j]*p;
		 }
		
		 int k=0;
		 for( k=0;k<n-1;k++)
		 {
		     if(arr[k]>24)
		     {
		         remaining=arr[k]-24;
	
		          arr[k+1]=arr[k+1]+remaining;
		          
		     }
		     else if(arr[k]<24)
		     {
		         remaining=24-arr[k];
		 
		         arr[k+1]=arr[k+1]-remaining;
		     }
		     
		    
		 }
		 
		   //  System.out.println(arr[k]);
		 
		 
		 if(arr[k]>24)
		 {
		     System.out.println("Yes");
		 }
		 else
		 {
		     System.out.println("No");
		 }
		 
		 }
	}
}
