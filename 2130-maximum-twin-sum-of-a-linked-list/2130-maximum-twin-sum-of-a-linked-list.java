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
class Solution 
{
    public int pairSum(ListNode head) 
    {
        ListNode prev = null;
        ListNode tortoise = head;
        ListNode hare = head;
        
        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            ListNode next = tortoise.next;
            tortoise.next = prev;
            prev = tortoise;
            tortoise = next;

        }
        ListNode p1 = prev;
        ListNode p2 = null;
        //System.out.println(tortoise.val);
        if(hare == null)//even number of nodes
        {
            p2 = tortoise;
        }
        else
        {
            p2 = tortoise.next;
        }
        //System.out.println(p2.val);
        int max = 0;
        //System.out.println(p1.val + " " + p2.val);
        while(p1 != null && p2 != null)
        {
            max = Math.max(p1.val + p2.val,max);
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }
}