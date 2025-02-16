class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l,r=0,0
        maxlen, maxf = 0,0
        has = [0]*26

        while(r<len(s)):
            has[ord(s[r]) - ord('A')] += 1
            maxf = max(maxf, has[ord(s[r]) - ord('A')])
            if(r-l+1 - maxf > k):
                has[ord(s[l]) - ord('A')] -= 1
                l += 1
            if(r-l+1 -maxf <= k):
                maxlen = max(maxlen,r-l+1)
            r += 1

        return maxlen