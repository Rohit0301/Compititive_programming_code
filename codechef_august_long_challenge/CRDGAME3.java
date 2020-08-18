import java.util.*;
import java.lang.*;
import java.io.*;
 public class CRDGAME3{



  public static int card(int p){
     int sum=0;
     int div=0;
     div=p/9;
     p=p-(div*9);
     sum+=div;

     div=p/8;
     p=p-(div*8);
     sum+=div;

     div=p/7;
     p=p-(div*7);
     sum+=div;

     div=p/6;
     p=p-(div*6);
     sum+=div;

     div=p/5;
     p=p-(div*5);
     sum+=div;

     div=p/4;
     p=p-(div*4);
     sum+=div;

     div=p/3;
     p=p-(div*3);
     sum+=div;

     div=p/9;
     p=p-(div*9);
     sum+=div;

     div=p/2;
     p=p-(div*2);
     sum+=div;

     div=p/1;
     p=p-(div*1);
     sum+=div;

     return sum;

  }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int pc=sc.nextInt();
			int pr=sc.nextInt();
			int fpc=card(pc);
			int fpr=card(pr);
			if(fpr<=fpc)
				System.out.println("1 "+fpr);
			else
				System.out.println("0 "+fpc);
		}
	
}


}
