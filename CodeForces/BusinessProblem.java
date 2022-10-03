// problem: https://codeforces.com/problemset/problem/981/B
import java.util.Scanner;
import java.util.HashMap;
public class BusinessProblem{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        HashMap<Long,Long> hMap = new HashMap<Long,Long>();
        Long temp;
        Long value;
        for(int z=0; z<n; z++){
            temp = sObj.nextLong();
            value = sObj.nextLong();
            if(hMap.containsKey(temp)) if(hMap.get(temp) > value) continue;
            hMap.put(temp, value);
        }
        int m = sObj.nextInt();
        for(int zz=0; zz<m; zz++){
            temp = sObj.nextLong();
            value = sObj.nextLong();
            if(hMap.containsKey(temp)) if(hMap.get(temp) > value) continue;
            hMap.put(temp, value);
        }
        Long total = (long) 0;
        for(Long ele: hMap.values()) total += ele;
        System.out.println(total);
    }
}