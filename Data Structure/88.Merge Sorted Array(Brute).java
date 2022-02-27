//saiyamhk
//59 / 59 test cases passed.
//Status: Accepted

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0, size=m;
        if(n==0) return;
        for(int i=0; i<n+m && index<n; i++){
            if(i>=size){
                nums1[i] = nums2[index];
                index++;
            }
            else if(nums1[i]<nums2[index]){
                continue;
            }
            else{
                for(int j=nums1.length-1; j>i; j--){
                    nums1[j] = nums1[j-1];
                }
                nums1[i] = nums2[index];
                index++;
                size++;
            }
        }
    }
}
