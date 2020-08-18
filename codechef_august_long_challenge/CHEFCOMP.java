//parially accepted (only for 1 subset)


import java.lang.*;
import java.util.*;
import java.io.*;
public class CHEFCOMP{

  private static	ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
  private static int p[];
  private static long a[];
  private static long b[];
  private static int d[];
  private static int count;
  private static int n;
  private static int visited[];
  private static int publicNode;
  private static int vis;
  
	public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		n=Integer.parseInt(br.readLine());
		int v,u;
		visited=new int[n+2];
		d=new int[n+2];
		count=1;
		initialise(n);
		clear(n);


		for(int i=0;i<n-1;i++){
      String s=br.readLine();
      String str[]=s.trim().split("\\s+");
			v=Integer.parseInt(str[0]);
          u=Integer.parseInt(str[1]);
           adj.get(v).add(u);
           adj.get(u).add(v);
		}

         p=new int[n+2];
         String ps=br.readLine();
         String pst[]=ps.trim().split("\\s+");
        for(int i=0;i<n;i++){
        	p[i+1]=Integer.parseInt(pst[i]);
        }


         a=new long[n+2];
         String ass=br.readLine();
         String as[]=ass.trim().split("\\s+");
        for(int i=0;i<n;i++)
        	a[i+1]=Long.parseLong(as[i]);


         b=new long[n+2];
         String bss=br.readLine();
         String bs[]=bss.trim().split("\\s+");
        for(int i=0;i<n;i++)
        	b[i+1]=Long.parseLong(bs[i]);


        vis=0;
        for(int i=1;i<=n;i++){
         publicNode=p[i];
       	    dfs(p[i]);
       	    remove(p[i]);
       	    count++;
       	    vis++;
        }
       	printFunction();

	}
 }




  public static void remove(int v){
 	for(int i=0;i<adj.size();i++){
 		if(adj.get(i).contains(v)){
 			adj.get(i).remove(new Integer(v));
 		}
 	}
 for(int i=1;i<=n;i++)
   if(i!=v)
    visited[i]=0;
 }


 public static void clear(int n){
		for(int i=0;i<=n;i++){
			adj.get(i).clear();
		}
	}

public static void initialise(int n){
	for(int i=0;i<=n;i++){
     		adj.add(new ArrayList<>());
     		d[i]=-1;
     		visited[i]=0;
     	}
}



	public static void printFunction(){
         for(int i=1;i<=n;i++)
         	System.out.print(d[i]+" ");
         System.out.println();

	}

	public static void dfs(int v){
		visited[v]=v1;
   
		b[v]=b[v]-Math.min(a[publicNode],b[v]);
    
		if(b[v]<=0)
		{
      if(d[v]<=0)
			d[v]=count;
    else
      d[v]=Math.min(d[v],count);
		
		}
	   
		int child[]=new int[n+1];
		int i=0;

		for(int c:adj.get(v))
		{
           child[i]=c;
          
           i++;
    }

   if(child[0]==0)
        {
       	
       	return;
       }
   for(i=0;i<child.length;i++){
            
          if(child[i]==0)
            return;
           if(visited[child[i]]==0 && child[i]!=0){
            
				   dfs(child[i]);
      }
		}
	}

}

// public static void bs(int node){
// 		//Queue<Integer> q =new LinkedList<>();
//        // q.add(node);
//  //       // while(q.size()>0){
// 	// for(int i=1;i<=n;i++)
// 	// 	System.out.print(b[i]+"");
// 	// System.out.println("b");
// 	    int cur=node;
// 	    int child[]=new int[n];
//         //	int cur=q.peek();
//         	//q.remove();
//         b[node]=b[node]-Math.min(a[node],b[node]);
//         System.out.println(node+" node "+b[node]);
//        // System.out.print(n+" node "+node);
//         //System.out.println();
//         if(b[node]==0)
//            {
//            	d[node]=count;
//            	count++;
//            }
//               int h=0;
//         	for(int c:adj.get(cur)){
//         		if(c!=0)
//         		 child[h]=c;
       
//         		h++;
//         	}
//              if(child[0]==0){
//              	return;
//              }
//         		//q.add(child);
//         	for(int i=0;i<child.length;i++){
//         		if(child[i]==0)
//         			break;
//         		 b[child[i]]=b[child[i]]-Math.min(a[node],b[child[i]]);
       
//                  System.out.println();
//         		 if(b[child[i]]==0){
//         		 	d[child[i]]=count;
//         		 	count++;
//         		 }

//         		 adj.get(child[i]).remove(new Integer(node));
//                  adj.get(node).remove(new Integer(child[i]));
//         	}
        	
//        // }
// 	}