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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        if(slow!=null && slow.next!=null) {
            fast=slow.next;
        }
        else {
            return head;
        }

        while(slow!=null && fast!=null) {
            int tmp=slow.val;
            slow.val=fast.val;
            fast.val=tmp;

            slow=fast.next;
            if(slow!=null) {
                fast=slow.next;
            }
            else {
                //break;
            }
        }
        return head;
    }
}