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
		if(sc.hasNextInt()){
		    t=sc.nextInt();
		    
		}
		for(int j=0;j<t;j++)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int price=0,ceil=0;
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    price=price+arr[i];
		    if(arr[i]>k)
		      ceil=ceil+k;
		  else
		    ceil=ceil+arr[i];
		}
		System.out.println(price-ceil);
		}
	}
}
