class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target) return true;
            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
                continue;
            }
            if(nums[l] <= nums[mid]){
                if(nums[l]<= target && target <= nums[mid]) r = mid - 1;
                else l = mid+1;
            }
            else{
                if(nums[r] >= target && target>=nums[mid]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return false;
    }
}