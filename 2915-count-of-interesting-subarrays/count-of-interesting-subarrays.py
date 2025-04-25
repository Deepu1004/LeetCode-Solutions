class Solution:
    def countInterestingSubarrays(self, nums: List[int], modulo: int, k: int) -> int:
        prefix = 0
        count = 0
        mp = {}
        mp[0] = 1

        for i in nums:
            if i % modulo == k:
                prefix += 1
                prefix = prefix % modulo
            
            count += mp.get((prefix - k) % modulo, 0)
            mp[prefix] = mp.get(prefix, 0) + 1
        
        return count