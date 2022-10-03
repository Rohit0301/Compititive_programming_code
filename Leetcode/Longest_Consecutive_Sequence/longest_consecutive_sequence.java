
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            int res = 1;
            if(!set.contains(nums[i] - 1)) {
                while(set.contains(++nums[i])) {
                    res++;
                }
            }
            result = Math.max(res, result);
        }
        return result;
    }
}
