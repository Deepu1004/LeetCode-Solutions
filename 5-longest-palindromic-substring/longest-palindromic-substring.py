class Solution:
    def longestPalindrome(self, s: str) -> str:
        if s == "" or s == len(s) * s[0]:
            return s
        p = s[0]
        l = 1
        n = len(s)
        for i in range(n):
            for j in range(n, 0, -1):
                w = s[i:j]
                wn = len(w)
                if w == w[::-1] and wn > l:
                    p = w
                    l = wn
        return p