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
		 int t=0;
		 if(sc.hasNextInt())
		 {
		     t=sc.nextInt();
		 }
		 for(int i=0;i<t;i++)
		 {
		     
		     int n=sc.nextInt();
		     long arr[]=new long[n];
		     long alice=0,bob=0,wierd_distance=0;
		     long brr[]=new long[n];
		     for(int j=0;j<n;j++){
		         arr[j]=sc.nextLong();
		     }
		     for(int j=0;j<n;j++){
		         brr[j]=sc.nextLong();
		     }
		     
		    
		     for(int j=0;j<n;j++)
		     {
		         alice=alice+arr[j];
		         bob=bob+brr[j];
		         if(alice==bob)
		         {
		               if(arr[j]==brr[j])
		                 wierd_distance=wierd_distance+arr[j];
		             
		         }
		        
		     }
		     System.out.println(wierd_distance);
		 }
	}
}
