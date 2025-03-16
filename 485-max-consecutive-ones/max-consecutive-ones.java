class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c =0,ans = 0;
        int l=0, r=0;
        while(r<nums.length){
            if(nums[r] == 0){
                ans = Math.max(ans,c);
                l = r;
                c = 0;
            }
            else{
                c++;
            }
            r++;
        }
        return Math.max(ans,c);
    }
}