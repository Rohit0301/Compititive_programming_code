class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++)
            res = res ^ nums[i] ;
        
        res = (res & -res)  ; 
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++) {
        	if((nums[i] & res) > 0)
        		a = (a^nums[i]) ;
        	else
        		b = (b^nums[i]) ;
        }
        
        int[] ar = new int[2];
        
        if(a<=b){
            ar[0]=a;
            ar[1]=b;
        }else{
            ar[0]=b;
            ar[1]=a;
        }    
        
        return ar;
    }
}
