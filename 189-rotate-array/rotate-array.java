class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        k = k%n;
        for(int i=n-k;i<n;i++){
            temp[i-n+k] = nums[i];
        }

        for(int i=0;i<n-k;i++){
            temp[i+k] = nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }
}