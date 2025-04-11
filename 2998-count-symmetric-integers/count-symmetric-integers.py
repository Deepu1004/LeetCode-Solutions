class Solution:
    

    def countSymmetricIntegers(self, low: int, high: int) -> int:
        cnt = 0

        for num in range(low, high+1):
            if((num >= 10 and num<=99) and (num % 11 == 0) ):
                cnt += 1
            elif(num >= 1000 and num <= 9999):
                left = 0
                right = 0
                for i in range(2):
                    right += num%10
                    num = num//10

                for i in range(2):
                    left += num%10
                    num = num//10
                if(left == right):
                    cnt += 1
    
        return cnt