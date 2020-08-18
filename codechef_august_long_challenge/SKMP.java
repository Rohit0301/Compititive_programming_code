import java.util.*;
import java.lang.*;
import java.io.*;
 public class SKMP{
 	public static String start,end;
 	public static int flag;
	public static void main(String[] args)throws IOException {
	
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s=br.readLine();
			String pattern=br.readLine();


			TreeMap<Character,Integer> smap=new TreeMap<>();
			TreeMap<Character,Integer> pmap=new TreeMap<>();

			for(int i=0;i<s.length();i++){
				if(smap.containsKey(s.charAt(i))==true)
					smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
				else
					smap.put(s.charAt(i),1);
			}

			for(int i=0;i<pattern.length();i++){
				if(pmap.containsKey(pattern.charAt(i))==true)
					pmap.put(pattern.charAt(i),pmap.get(pattern.charAt(i))+1);
				else
					pmap.put(pattern.charAt(i),1);
			}

            for(int i=0;i<pattern.length();i++){
            	smap.put(pattern.charAt(i),smap.get(pattern.charAt(i))-1);
            }


           
           String str="";
           flag=0;
            start="";
            end="";
           for(Map.Entry<Character,Integer> map:smap.entrySet()){
           	char c=map.getKey();
           	String dumy="";
           	int value=map.getValue();
           	dumy=func(c,value); 

           	  if(flag==1){
           	  	end=end+dumy;
           	  }
           	  else{
           	  	function(pattern,c,dumy);
           	  }
           	  
           }

  

     String answer=start+pattern+end;
      System.out.println(answer);


 
		}
	
}
public static void function(String pattern,char c,String dumy){
              
           	  for(int i=0;i<pattern.length();i++){
                  if(c<pattern.charAt(i)){
                  	start=start+dumy;
                  	break;
                  }
                  else if(c>pattern.charAt(i))
                  {
                  	end=end+dumy;
                  	flag=1;
                  	break;
                  }
           	  }

}


public static String func(char s,int value){
	String a="";
	if(value==1)
		return a+s;
	if(value==2)
		return a+s+s;
	if(value==3)
		return a+s+s+s;
	if(value==4)
		return a+s+s+s+s;
	if(value==5)
		return a+s+s+s+s+s;
	if(value==6)
		return a+s+s+s+s+s+s;
	if(value==7)
		return a+s+s+s+s+s+s+s;
	if(value==8)
		return a+s+s+s+s+s+s+s+s;
	if(value==9)
		return a+s+s+s+s+s+s+s+s+s;
	if(value==10)
		return a+s+s+s+s+s+s+s+s+s+s;
	if(value>=11){
		for(int i=0;i<value;i++){
			a=a+s;
		}
	}
		
return a;
}
 
 }
