//problem: https://codeforces.com/problemset/problem/758/A

import java.util.Scanner;
public class Equality{
    public static int findGreatest(String[] arr){
        int max = Integer.MIN_VALUE;
        for(String ele: arr){
            if(Integer.parseInt(ele) > max){
                max = Integer.parseInt(ele);
            }
        }
        return max; 
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        String[] input = sObj.nextLine().split(" ");
        int greatest = findGreatest(input);
        int total = 0;
        for(String ele: input){
            total += greatest - Integer.parseInt(ele);
        }
        System.out.println(total);
    }
}