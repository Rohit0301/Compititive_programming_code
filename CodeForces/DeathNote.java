//problem: https://codeforces.com/problemset/problem/1016/A

import java.util.Scanner;
public class DeathNote{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int days = sObj.nextInt();
        int max = sObj.nextInt();
        int[] arr = new int[days];
        for(int z=0; z<days; z++){
            arr[z] = sObj.nextInt();
        }
        int modMax = max;
        for(int i=0; i<days; i++){
            //System.out.println("leftInPage: " + modMax + "\nToPrintToday: " + arr[i]);

            if(arr[i]<modMax){
                System.out.print(0);
                modMax = modMax - arr[i];
            }
            else{
                System.out.print((arr[i]-modMax)/max + 1);
                modMax = max - ((arr[i]-modMax) % max);
            }
            System.out.print(" ");
        }
    }
}