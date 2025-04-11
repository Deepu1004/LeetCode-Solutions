class Solution:
    

    def countSymmetricIntegers(self, low: int, high: int) -> int:
        cnt = 0

        for num in range(low, high+1):
            number = str(num)
            if(len(number) == 2):
                if(number[0] == number[1]):
                    cnt += 1
            elif(len(number) == 4):
                left = int(number[0]) + int(number[1])
                right = int(number[2]) + int(number[3])
                if(left == right):
                    cnt += 1
        return cnt