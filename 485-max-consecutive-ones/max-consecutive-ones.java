class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0,cnt=0;
        while(r < nums.length){
            if(nums[r] == 0){
                System.out.println(cnt+" "+r+" "+l+" ");
                cnt = Math.max(cnt,r-l);
                l = r+1;
            }
            r++;
        }
        cnt = Math.max(cnt,r-l);
        return cnt;
    }
}