import java.util.Scanner;
public class E{

    public static boolean check(int[][] arr, int row, int col){
        if(arr[row][col] == 0){
            return true;
        }
        if(arr[row+1][col]==0){
            if(arr[row][col+1] == 0){
                //System.out.println("no for: " +row + " " + col);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int size = sObj.nextInt();
            sObj.nextLine();
            int j = 0;
            int[][] arr = new int[size][size];
            for(int i=0; i<size; i++){
                j=0;
                for(char ele: sObj.nextLine().toCharArray()){
                    arr[i][j] = Integer.parseInt(String.valueOf(ele));
                    j++;
                }
            }
            boolean flag = true;
            for(int x=0; x<size-1; x++){
                //flag = true;
                for(int y=0; y<size-1; y++){
                    //System.out.println("checking for: " +x + " " + y);
                    if(!check(arr, x, y)){
                        flag = false;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}