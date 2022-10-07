//problem: https://codeforces.com/problemset/problem/1337/B

import java.util.Scanner;

public class Dragon{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            int hp = sObj.nextInt();
            int halfSpell = sObj.nextInt();
            int lightning = sObj.nextInt();
            while(hp>20 && halfSpell > 0){
                hp = hp/2 + 10;
                halfSpell--;
            }
            hp -= lightning*10;
            if(hp <= 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}