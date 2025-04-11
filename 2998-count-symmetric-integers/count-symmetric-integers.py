class Solution:
    def isPalindrome(self,s):
        if(len(s) % 2 != 0):
            return False
        lsm,rsm = 0,0
        for i in range(len(s)//2):
            lsm += int(s[i])
        for i in range(len(s)//2):
            rsm += int(s[len(s)//2 + i])
        if(lsm == rsm):
            return True
        else:
            return False

    def countSymmetricIntegers(self, low: int, high: int) -> int:
        cnt = 0
        for i in range(low, high+1):
            if(self.isPalindrome(str(i))):
                cnt += 1
        return cnt