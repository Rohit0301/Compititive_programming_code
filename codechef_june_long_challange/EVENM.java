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
	     // int arr[]=new int[n*n];
	     ArrayList<Integer> arr=new ArrayList<>();
	      for(int i=1;i<=n*n;i++)
	      {
	          arr.add(i);
	      }
	      int a=n-1;
	      int m=a;
	      for(int i=n;i<arr.size();i++)
	      {
	           arr.set(i,arr.get(i)+a);
	          a=a-2;
	          if(a==-m-2)
	          {
	            
	              i=i+n;
	              a=m;
	          }
	         
	      }
	      int p=0;
	      String s="";
	      for(int i=0;i<n;i++){
	          s=""+arr.subList(p,p+n);
	         s= s.replaceAll(",","");
	          s=s.replace("[","");
	          s=s.replace("]","");
	          System.out.print(s);
	          System.out.println();
	          p=p+n;
	      }
	    
	   }
	}
}
