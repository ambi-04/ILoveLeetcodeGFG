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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public static TreeNode solution(ArrayList<TreeNode> list, int l, int r)
    {
        if(l <= r)
        {
            int mid = l + (r - l)/2;
            TreeNode root = list.get(mid);
            root.left = solution(list,l,mid - 1);
            root.right = solution(list,mid + 1,r);
            return root;
        }
        return null;
    }

    public TreeNode sortedListToBST(ListNode head) 
    {
        ArrayList<TreeNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            list.add(new TreeNode(curr.val));
            curr = curr.next;
        }
        return solution(list,0,list.size() - 1);

        
    }
}