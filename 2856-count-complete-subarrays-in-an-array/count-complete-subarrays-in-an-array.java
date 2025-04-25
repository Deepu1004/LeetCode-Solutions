import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int totalUnique = (int) Arrays.stream(nums).distinct().count();
        int count = 0;
        int left = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() == totalUnique) {
                count += nums.length - right;

                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }
        }

        return count;
    }
}
