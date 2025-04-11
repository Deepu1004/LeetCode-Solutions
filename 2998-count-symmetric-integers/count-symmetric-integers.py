class Solution:

    def isSymmetric(self, num, n):
        leftSum = 0
        rightSum = 0

        for i in range(n//2):
            rightSum += num%10
            num //= 10
            
        
        for i in range(n//2):
            leftSum += num%10
            num //= 10

        return leftSum == rightSum

    def countTotalDigits(self, num):
        count = 0
        while(num > 0):
            count += 1
            num = num//10
        return count

    def countSymmetricIntegers(self, low: int, high: int) -> int:
        res = 0
        for i in range(low, high+1):
            count = self.countTotalDigits(i)
            if(count % 2 != 0):
                continue
            elif(self.isSymmetric(i, count)): 
                res += 1
        
        return res