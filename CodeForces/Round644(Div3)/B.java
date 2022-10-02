import java.util.Scanner;
import java.util.Arrays;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            int min = 2147483647;
            for(int j=0; j<size; j++){
                arr[j] = sObj.nextInt();
            }
            Arrays.sort(arr);
            for(int x=0; x<size - 1; x++){
                int temp = 0;
                temp = arr[x+1] - arr[x];if(temp < min){
                    min = temp;
                } 
            }
             System.out.println(min);
        }
    }
}