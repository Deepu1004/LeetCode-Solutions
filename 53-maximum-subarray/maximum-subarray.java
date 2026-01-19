class Solution {
    public int maxSubArray(int[] nums) {
        int sm = nums[0], curr = 0;
        for(int i=0;i<nums.length;i++){
            curr += nums[i];
            sm = Math.max(sm, curr);
            if(curr < 0) curr = 0;
        }
        return sm;
    }
}