class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sm=0,cnt = 0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sm += nums[i];
            if(hm.containsKey(sm-goal)){
                cnt+= hm.get(sm-goal);
            }
            if(hm.containsKey(sm)) hm.put(sm,hm.get(sm) + 1);
            else hm.put(sm,1);
        }
        return cnt;
    }
}