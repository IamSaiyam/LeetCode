//saiyamhk
//32 / 32 test cases passed.
//Status: Accepted

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
