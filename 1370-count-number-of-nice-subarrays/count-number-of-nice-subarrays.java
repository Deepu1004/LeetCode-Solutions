class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int j = 0;
        for(int i:nums){
            if(i%2 != 0) arr[j] = 1;
            else arr[j] = 0;
            j++;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sm = 0, cnt = 0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sm += arr[i];
            int find = sm - k;
            if(hm.containsKey(find)) cnt += hm.get(find);
            if(hm.containsKey(sm)) hm.put(sm,hm.get(sm) + 1);
            else hm.put(sm,1);
        }
        return cnt;
    }
}