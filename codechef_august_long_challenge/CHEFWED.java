import java.util.*;
import java.lang.*;
import java.io.*;
 public class CHEFWED{
 	public static int a[];
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
           
           int count=price(a);
           
           int en=enif(0,n);

           int dumy=func(a,k);
           int uni=count*k;
           int ene=en+k;

          if(dumy<=uni && dumy<=ene)
          	System.out.println(dumy);
          else if(uni<=dumy && uni<=ene)
           	System.out.println(uni);
           else
           	System.out.println(ene);

		}
	}

 public static int func(int a[],int k){
 	int j=0;
 	int min=Integer.MAX_VALUE;
 	for(int i=0;i<a.length-1;i++){
 		j=i+1;
 		int s=enif(0,i+1);
 		int p=enif(j,a.length);
 		int money=k+s+k+p;
 		if(money<min){
 			min=money;
 
 		}
 	}

       return min;
 }









public static int enif(int start,int end){
	int count=0;
	HashMap<Integer,Integer> smap=new HashMap<>();
	for(int i=start;i<end;i++){
				if(smap.containsKey(a[i])==true)
					smap.put(a[i],smap.get(a[i])+1);
				else
					smap.put(a[i],1);
			}

	for(Map.Entry<Integer,Integer> mp:smap.entrySet()){

		int value=mp.getValue();
		if(value>1)
			count+=value;

	}
	return count;
}

public static int price(int a[]){
	HashSet<Integer> set=new HashSet<>();
	int count=1;
	set.add(a[0]);
	for(int i=1;i<a.length;i++){
		if(set.contains(a[i])==true){
			count++;
			set.clear();
		
		}
			set.add(a[i]);
	}
	return count;
}  


}