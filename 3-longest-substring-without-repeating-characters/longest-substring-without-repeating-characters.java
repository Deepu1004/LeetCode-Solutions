class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0;
        int ans = 0;
        int[] hash = new int[256];
        while(r < s.length()){
            char ch = s.charAt(r);
            if (hash[ch] > 0) {
                l = Math.max(l, hash[ch]);
            }
            hash[ch] = r + 1;
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}