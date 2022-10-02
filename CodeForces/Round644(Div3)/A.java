import java.util.Scanner;
import java.lang.Math;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            int l = sObj.nextInt();
            int b = sObj.nextInt();
            System.out.println((int) Math.pow(Math.max(Math.max(l,b),2*Math.min(l,b)),2));
        }
    }
}