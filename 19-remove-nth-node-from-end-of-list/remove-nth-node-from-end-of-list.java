/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if(n >= cnt) return head.next;
        if(n < cnt){
            temp = head;
            cnt = cnt - n - 1;
            for(int i=0;i<cnt;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
        return temp;
    }
}