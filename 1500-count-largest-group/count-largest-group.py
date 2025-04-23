class Solution:

    def bitsSum(self,n):
        sm = 0
        while(n>0):
            num = n%10
            sm += num
            n = n//10
        return sm

    def countLargestGroup(self, n: int) -> int:
        d = {}
        for i in range(1,n+1):
            if(i>9):
                sm = self.bitsSum(i)
            else:
                sm = i
            if(sm not in d):
                d[sm] = 1
            else:
                d[sm] += 1
        val = list(d.values())

        mx = max(val)
        cnt = 0
        for i in val:
            if i == mx:
                cnt += 1
        return cnt