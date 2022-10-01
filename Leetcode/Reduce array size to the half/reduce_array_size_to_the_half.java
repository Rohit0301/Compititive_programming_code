class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length/2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        List<Integer> values = new ArrayList<>();
        for(Integer val:hm.values()){
            values.add(val);
        }
        Collections.sort(values);
        int size=0;int len=0;
        for(int i=values.size()-1;i>=0;i--){
            len++;size+=values.get(i);
            if(size>=n){
                return len;
            }
        }
       return -1; 
    }
}