import java.io.*;
import java.util.*;
import java.lang.*;
public class ADAKING{
	public static void main(String []args)throws IOException{
	 try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int k=Integer.parseInt(br.readLine());
			char arr[][]={
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}
			};
          int j=0,l=0;
			
				for(int i=0;i<k;i++)
				{
					if(l==8)
					{
						j++;
						l=0;
					}

						arr[j][l+1]='X';
						arr[j+1][l]='X';
						arr[j+1][l+1]='X';
						arr[j][l]='.';
					l++;
				}
				arr[0][0]='O';
				for(int i=0;i<8;i++){
					for(j=0;j<8;j++){
						System.out.print(arr[i][j]+"");
					}
					System.out.println();
				}
				System.out.println();
			
		}
    }
    catch(Exception e){
    	return ;
    }
}
}