class Solution {
    public int ceil(int[] nums, int target){
        int l=0,r=nums.length-1;
        int ceil=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid] <= target){
                ceil = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ceil;
    }
    public int floor(int[] nums, int target){
        int l=0,r=nums.length-1;
        int floor=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid] < target){
                l = mid+1;
            }
            else{
                floor = mid;
                r = mid-1;
            }
        }
        return floor;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length < 1) return new int[]{-1,-1};
        int fl = floor(nums,target);
        if(fl == -1 || nums[fl] != target) return new int[]{-1,-1};
        int ce = ceil(nums,target);
        return new int[]{fl,ce};
    }
}