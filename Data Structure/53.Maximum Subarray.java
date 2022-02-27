//saiyamhk
//209 / 209 test cases passed.
//Status: Accepted

class Solution {
    public int maxSubArray(int[] nums) {
        int submax = 0;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            submax += nums[i];
            if(submax<nums[i]) submax = nums[i];
            if(max<submax) max = submax;
        }
        return max;
    }
}
