# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cnt = 0
        temp = head
        while(temp != None):
            cnt += 1
            temp = temp.next
        temp = head
        for i in range(cnt//2):
            temp = temp.next
        if(cnt == 1):
            return temp
        return temp 
