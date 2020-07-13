import java.io.*;
import java.util.*;
import java.lang.*;
public class PTMSSNG{
	public static void main(String args[]) throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		int testcase=Integer.parseInt(buffer.readLine());
		while(testcase-->0){
			int n=Integer.parseInt(buffer.readLine());
			long a[]=new long[4*n-1];
			long b[]=new long[4*n-1];
			int l=0;
			for(int k=0;k<4*n-1;k++){
				String string=buffer.readLine();
			    String str[]=string.trim().split("\\s+");
                a[l]=Long.parseLong(""+str[0]);
                b[l]=Long.parseLong(""+str[1]);
                l++;

			}
			long a1=a[0];
			long b1=b[0];
			for(int i=1;i<4*n-1;i++){
                   a1=a1^a[i];
                   b1=b1^b[i];
			}
			System.out.println(a1+" "+b1);
		}
	}
}