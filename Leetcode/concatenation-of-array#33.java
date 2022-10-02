class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ar[] = new int[n*2];
        for(int i=0;i<n;i++){
            ar[i] = nums[i] ;
            ar[n+i] = nums[i] ;
        }
        return ar;
    }
}
