// https://codeforces.com/problemset/problem/1108/A

import java.util.Scanner;
public class Points{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int l = sObj.nextInt();
            sObj.nextInt();
            sObj.nextInt();
            int r = sObj.nextInt();
            if(l == r) l++;
            System.out.print(l + " ");
            System.out.println(r);
        }
    }
}