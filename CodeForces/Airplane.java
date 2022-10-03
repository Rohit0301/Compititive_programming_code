//problem: https://codeforces.com/problemset/problem/965/A

import java.lang.Math;
import java.util.Scanner;
public class Airplane{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        double k = sObj.nextDouble();
        double n = sObj.nextDouble();
        double s = sObj.nextDouble();
        double p = sObj.nextDouble();
        double total_sheet = k*Math.ceil(n/s);
        System.out.println((int) Math.ceil(total_sheet/p));
    }
}