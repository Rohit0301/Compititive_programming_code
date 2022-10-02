//problem: https://codeforces.com/problemset/problem/1325/B

import java.util.HashSet;
import java.util.Scanner;

public class Copy{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        int size = 0;
        for(int i=0; i<cases; i++){
            HashSet hSet = new HashSet();
            size = Integer.parseInt(sObj.nextLine());
            for(int j=0; j<size; j++){
                hSet.add(sObj.nextInt());
            }
            sObj.nextLine();
            System.out.println(hSet.size());
        }
    }
}