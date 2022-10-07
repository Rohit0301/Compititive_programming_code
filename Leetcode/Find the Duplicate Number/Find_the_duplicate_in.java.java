//Method one here we update the array
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
    int val=nums[0];
        for(int i=1;i<nums.length;i++){
            val=val ^ nums[i];
            System.out.println(val);
        if(val==0)return nums[i];
        }
   return -1; }
}
//Method two here we don't
public static int findDuplicate_set(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }

        return len;
    }
