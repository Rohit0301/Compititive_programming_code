import java.util.Arrays;
import java.util.Scanner;

public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            int evnCount = 0;
            for(int j=0; j<size; j++){
                arr[j] = sObj.nextInt();
                if(arr[j]%2 == 0){
                    evnCount++;
                }
            }
            if(evnCount % 2 == 0){
                System.out.println("YES");
                continue;
            }
            Arrays.sort(arr);
            boolean isYes = false;
            for(int x=0; x<size-1; x++){
                //System.out.println("h: " + arr[x]);
                if(arr[x+1] - arr[x] == 1){
                    isYes = true;
                }
            }
            if(isYes){
                 System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}