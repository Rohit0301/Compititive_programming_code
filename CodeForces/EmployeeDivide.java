//problem: https://codeforces.com/problemset/problem/935/A

import java.util.Scanner;
public class EmployeeDivide{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int noEmp = sObj.nextInt();
        //System.out.print(noEmp);
        int result = 0;
        for(int i=1; i<=noEmp/2; i++){
            if(noEmp%i==0){
                //System.out.println(i);
                result++;
            }
        }
        System.out.print(result);
    }
}