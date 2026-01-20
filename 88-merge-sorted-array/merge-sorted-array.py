class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i,j = 0,0
        ls = []
        while(i < m and j < n):
            if(nums1[i] <= nums2[j]):
                ls.append(nums1[i])
                i += 1
            else:
                ls.append(nums2[j])
                j += 1
        while(i < m):
            ls.append(nums1[i])
            i += 1
            
        while(j < n):
            ls.append(nums2[j])
            j += 1
        nums1[:] = ls
        