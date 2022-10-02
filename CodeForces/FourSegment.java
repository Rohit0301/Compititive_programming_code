// Problem: https://codeforces.com/problemset/problem/1468/E

import java.util.Scanner;
import java.util.Arrays;
public class FourSegment{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int[] sides = new int[4];
            for(int i=0; i<4; i++) sides[i] = sObj.nextInt();
            Arrays.sort(sides);
            System.out.println(sides[0] * sides[2]);
        }
    }
}