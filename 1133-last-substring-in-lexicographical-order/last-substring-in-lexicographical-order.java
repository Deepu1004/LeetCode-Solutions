class Solution {
    public String lastSubstring(String s) {
        int n = s.length();
        int i = 0;       
        int j = 1;      
        int k = 0;       

        while (j + k < n) {
            if (s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            } else if (s.charAt(i + k) > s.charAt(j + k)) {
                j = j + k + 1;
                k = 0;
            } else {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }

        return s.substring(i);
    }
}
