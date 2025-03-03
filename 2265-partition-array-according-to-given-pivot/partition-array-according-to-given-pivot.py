class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        left = []
        right = []
        pvtcnt = 0
        for i in nums:
            if(i < pivot):
                left.append(i)
            elif(i == pivot):
                pvtcnt+=1
            else:
                right.append(i)
        ans = []
        for i in left:
            ans.append(i)
        for i in range(pvtcnt):
            ans.append(pivot)
        for i in right:
            ans.append(i)
        return ans