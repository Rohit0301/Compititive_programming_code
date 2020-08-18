import java.util.*;
import java.lang.*;
import java.io.*;
 public class CHEFWARS{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int h=sc.nextInt();
			int p=sc.nextInt();
			int a=-1;
			while(true){
				h=h-p;
				if(h<=0)
				{
                   a=1;
                   break;
				}
				p=p/2;
				if(p<=0){
					a=0;
					break;
				}
			}
			System.out.println(a);
		}
	
}

}


