//problem: https://codeforces.com/problemset/problem/1/A

// import java.util.Scanner;
// import java.lang.Math;

// public class TheatreSquare{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int l = sObj.nextInt();
//         int b = sObj.nextInt();
//         float side = (float) sObj.nextInt();

//         System.out.println((int) (Math.ceil(l/side) + Math.ceil(b/side)));
//     }
// }

import java.util.Scanner;
import java.lang.Math;

public class TheatreSquare{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long l = sObj.nextLong();
        long b = sObj.nextLong();
        double side = (double) sObj.nextInt();
        //System.out.println("Side: " + side);
        long total = 0;
        if(l<=side && b<=side){
            System.out.print(1);
            return;
        }
        else{
            total += Math.ceil(Math.max(l,b) / side);
            if(Math.min(l,b) > side){
                total *= Math.ceil(Math.min(l,b) / side);
            }
        }
        System.out.println(total);
    }
}