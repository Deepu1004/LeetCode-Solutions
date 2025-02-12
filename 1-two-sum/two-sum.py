class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = []
        for i in range(len(nums)):
            p = target-nums[i]
            if(p in nums):
                ind = nums.index(p)
                if(i!=ind):
                    l = [i,ind]
                    return l