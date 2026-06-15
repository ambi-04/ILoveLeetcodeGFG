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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head.next == null)
            return null;
        ListNode prev = null;
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare != null && hare.next != null)
        {
            prev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        prev.next = tortoise.next;
        return head;
    }
}