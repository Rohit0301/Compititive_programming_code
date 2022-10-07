//problem: https://codeforces.com/problemset/problem/937/A

import java.util.Scanner;
import java.util.HashSet;

public class Diploma{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet<Integer> hSet = new HashSet<Integer>();
        int n = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<n; i++){
            hSet.add(sObj.nextInt());
        }
        int count = 0;
        for(int ele: hSet){
            if(ele == 0){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}