class Solution:
    def firstUniqChar(self, s: str) -> int:
        st = ""
        
        for i in s:
           if(s.count(i) == 1):
            st += i
        
        for i in range(len(s)):
            if(s[i] in st):
                return i
        return -1