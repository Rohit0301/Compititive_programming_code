//problem: https://codeforces.com/problemset/problem/1291/A

import java.util.Scanner;

public class Ebne{
    public static void main(String[] args){
       Scanner sObj = new Scanner(System.in);
       int nos = Integer.parseInt(sObj.nextLine());
       for(int z=0; z<nos; z++){
           int size = Integer.parseInt(sObj.nextLine());
           int[] arr = new int[size];
           int index = 0;
           int nOdd = 0;
           for(char c: sObj.nextLine().toCharArray()){
              arr[index] = Integer.parseInt(String.valueOf(c));
              if(arr[index] % 2 ==1){
                nOdd++;
              }
              index++;
           }
           if(nOdd<=1){
               System.out.println(-1);
               continue;
           }
           else{
               int count=2;
               for(int intg: arr){
                   //System.out.print(intg+ " assad");
                   if(intg %2 == 1 && count >0){
                       System.out.print(intg);
                       count--;
                   }
               }
               System.out.println();
           }
       }
    }
}