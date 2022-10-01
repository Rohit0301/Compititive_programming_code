import java.util.*;

public class Solution {

    public static String intToRoman(int num) {

        int arr[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String roman[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        // These two arrays will help us in converting each integer to its Roman
        // equivalent

        int no = 12, d; // Here no is the size of the array we defined above

        String ans = new String(""); 

  

        while (num > 0) {
            d = num / arr[no]; 

            num = num % arr[no]; 

           
          
            while (d > 0) {
                ans += roman[no];
                d--;
            }
            --no;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String s = intToRoman(number);
        System.out.print(s);
    }
}
