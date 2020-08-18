//partially accpeted (only for first subtask)

import java.util.*;
import java.lang.*;
import java.io.*;
public class SUBSFREQ{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		   int n=sc.nextInt();
		    long a[]=new long[n];
		   for(int i=0;i<n;i++)
		   	a[i]=sc.nextLong();
            long ans;
            long mod=1000000007L;
           for(int i=n-1;i>=0;i--){
           ans=power(2,i,mod);
           System.out.print(ans+" ");
           }
           
                     
         System.out.println();

		}
		
	}
	public static long power(long x, long y, long p) 
    {  
        long res = 1;       
        x = x % p;  
        if(x==0) return 0;
        while (y > 0) 
        { 
   
      
            if((y & 1)==1) 
                res = (res * x) % p;
            y = y >> 1;  
            x = (x*x)%p;  
        } 
        return res; 
    } 





	// public static long power(int n){
	// 	long mod=1000000007;
	// 	long ans=1;
	// 	for(int i=0;i<n;i++){
 //           ans=((ans)*2)%mod;
	// 	}
	// 	return ans;
	// }

	// public static void printArray(int n){
	// 	for(int i=0;i<n;i++){
	// 		System.out.print(b[i]+" ");
	// 	}
 //       System.out.println();
	// }

	// public static void subtract(int n){
	// 	for(int i=1;i<n;i++){
 //           b[i-1]=b[i-1]-b[i];
	// 	}

	// 	int sum=0;
	// 	int i=0;
	// 	if(a.length>2 && a[0]==a[1]){
	// 	for(i=0;i<n-1;i++){
	// 		if(a[i]==a[i+1]){
	// 			sum=b[i];
	// 			sum=sum+b[i+1];
 //                b[i]=0;
 //                b[i+1]=sum;
	// 		}
	// 		else
	// 			break;
	// 	}
	// }

	// 	for(int j=n-2;j>i;j--){
	// 		if(a[j]==a[j+1]){
	// 			sum=b[j];
	// 			sum=sum+b[j+1];
 //                b[j+1]=0;
 //                b[j]=sum;
	// 		}
	// 		else
	// 			sum=0;
	// 	}
	
       
 //       printArray(n);
	// }

	// public static int power(int n){
	// 	int mod=1000000007;
	// 	int ans=1;
	// 	for(int i=0;i<n;i++){
 //           ans=((ans%mod)*2)%mod;
	// 	}
	// 	return ans;
	// }

	// public static void solveQuestion(int n){
	// 	int k=n;
	// 	b=new int [n];
	// 	for(int i=0;i<n;i++){
	// 		b[i]=power(k)-1;
	// 		//System.out.println(b[i]+" /");
	// 		k--;
	// 	}

	// 	subtract(n);
	// }
}