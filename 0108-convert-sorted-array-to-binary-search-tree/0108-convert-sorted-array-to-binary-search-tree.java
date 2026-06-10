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
    public static TreeNode solution(int l, int r, int[] nums)
    {
        if(l <= r)
        {
            int mid = l + (r - l)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = solution(l,mid - 1,nums);
            root.right = solution(mid+1,r,nums);
            return root;
        }
        return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return solution(0,nums.length - 1, nums);
        
    }
}