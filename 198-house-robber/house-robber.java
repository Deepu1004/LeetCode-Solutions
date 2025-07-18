class Solution {

    private int sol(int[] dp, int n, int[] nums){
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];

        int res = Math.max( sol(dp,n-2,nums) + nums[n], sol(dp, n-1, nums));
        dp[n] = res;
        return res;
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return sol(dp,nums.length-1, nums);
    }
}