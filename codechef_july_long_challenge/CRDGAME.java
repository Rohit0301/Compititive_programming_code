import java.io.*;
import java.util.*;
import java.lang.*;
public class CRDGAME{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			
			
			int pc=0, pm=0;
			
			for(int i=0;i<n;i++){
				int sumc=0,summ=0;
				String s=br.readLine();
			    String str[]=s.trim().split("\\s+");    
			    for(int j=0;j<str[0].length();j++)
			       sumc+=Integer.parseInt(""+str[0].charAt(j));
			    for(int j=0;j<str[1].length();j++)
			       summ+=Integer.parseInt(""+str[1].charAt(j));  
                 if(sumc>summ)
                 	pc++;
                 else if(sumc<summ)
                 	pm++;
                 else{
                 	pc++;
                 	pm++;
                 }
			}

		if(pc>pm)
		  System.out.println(0+" "+pc);
		 else if(pc<pm)
		 System.out.println(1+" "+pm);
		 else
		 System.out.println(2+" "+pc);	

		
		}
	}
}