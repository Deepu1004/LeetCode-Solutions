class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = {}
        l = r = maxlen = 0
        while(r<len(s)):
            if(s[r] in d):
                if(d[s[r]]>=l):
                    l = d[s[r]] + 1
            length = r - l + 1
            maxlen = max(length, maxlen)
            d[s[r]] = r
            r += 1
        return maxlen