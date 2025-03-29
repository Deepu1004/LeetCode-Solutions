class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l=0;
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);
            if (mp.containsKey(currentChar) && mp.get(currentChar) >= l) {
                l = mp.get(currentChar) + 1;
            }
            mp.put(currentChar, r);
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}