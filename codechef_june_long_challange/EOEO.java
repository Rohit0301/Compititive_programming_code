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
		    long values=0;
		    long TS=sc.nextLong();
		    if(TS%2!=0)
		    {
		        values=(TS-1)/2;
		    }
		    else{
		        while(TS>=1)
		        {
		            TS=TS/2;
		            if(TS%2!=0)
		            {
		                values=(TS-1)/2;
		                break;
		            }
		        }
		        
		    }
		    System.out.println(values);
		}
	}
}
