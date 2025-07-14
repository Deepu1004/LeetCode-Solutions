class Solution {
    public char processStr(String s, long k) {
        long l = 0;
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (l > 0) {
                    l *= 2;
                }
            } else if (c == '*') {
                l = Math.max(0, l - 1);
            } else if (c != '%') {
                l++;
            }
        }

        if (l <= k) {
            return '.';
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                if (l > 0) {
                    l /= 2;
                    k %= l;
                }
            } else if (c == '*') {
                l++;
            } else if (c == '%') {
                k = l - 1 - k;
            } else {
                if (k == l - 1) {
                    return c;
                }
                l--;
            }
        }
        
        return '.';
    }
}