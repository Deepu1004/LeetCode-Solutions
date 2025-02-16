
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        start = 0
        fmap = {}
        maxf = 0
        longest = 0

        for end in range(len(s)):
            fmap[s[end]] = fmap.get(s[end], 0) + 1

            maxf = max(maxf, fmap[s[end]])

            is_val = (end + 1 - start - maxf <= k)

            if not is_val:
                fmap[s[start]] -= 1
                start += 1
            
            longest = end + 1 - start
    
        return longest