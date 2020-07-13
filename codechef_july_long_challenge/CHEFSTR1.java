import java.io.*;
import java.util.*;
import java.lang.*;
public class CHEFSTR1{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			String s=br.readLine();
			String str[]=s.trim().split("\\s+");
			long arr[]=new long[n];
			long sum=0;
			for(int i=0;i<n;i++)
				arr[i]=Long.parseLong(""+str[i]);
			for(int i=0;i<n-1;i++){
                sum+=(Math.abs(arr[i]-arr[i+1]))-1;
             
			}

			System.out.println(sum);
		}
	}
}