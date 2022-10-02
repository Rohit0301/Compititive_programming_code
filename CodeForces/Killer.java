// problem: https://codeforces.com/problemset/problem/776/A

import java.util.Scanner;

public class Killer{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] persons = new String[2];
        String[] temp = new String[2];
        int i = 0;
        int x = 0;
        for(String s: sObj.nextLine().split(" ")){
            persons[i] = s;
            i++;
        }
        int scenarios = Integer.parseInt(sObj.nextLine());
        System.out.println(persons[0] + " " + persons[1]);
        for(int j=0; j<scenarios; j++){
            x=0;
            for(String z: sObj.nextLine().split(" ")){
                temp[x] = z;
                x++;
            }
            if(persons[0].equals(temp[0])){
                persons[0] = temp[1];
            }
            else{
                persons[1] = temp[1];
            }
            System.out.println(persons[0] + " " + persons[1]);
        }
    }
}