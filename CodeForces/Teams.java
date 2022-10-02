//problem: https://codeforces.com/problemset/problem/1092/B

import java.util.Scanner;
import java.util.Arrays;

public class Teams{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sObj.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        for(int i=n-1; i>=0; i--){
            if(i%2==0){
                total -= arr[i];
            }
            else{
                total += arr[i];
            }
        }
        System.out.println(total);
    }
}