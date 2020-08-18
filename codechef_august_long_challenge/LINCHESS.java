import java.util.*;
import java.lang.*;
import java.io.*;
 public class LINCHESS{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			long k=sc.nextLong();
			long p[]=new long[n];
			for(int i=0;i<n;i++)
				p[i]=sc.nextLong();

			
			PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
			for(int i=0;i<n;i++){
				if(k%p[i]==0)
					pq.add(p[i]);
			}
			if(pq.size()==0)
				System.out.println("-1");
			else
			System.out.println(pq.peek());
		}
	
}

}


