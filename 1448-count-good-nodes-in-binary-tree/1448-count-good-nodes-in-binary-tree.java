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
    public int solution(TreeNode root, int max)
    {
        if(root == null)
            return 0;
        int cnt = 0;
        if(root.val >= max)
        {
            cnt++;
            max = root.val;
        }
        int leftCount = solution(root.left, max);
        int rightCount = solution(root.right,max);
        return cnt + leftCount + rightCount;
    }
    public int goodNodes(TreeNode root) 
    {
        return solution(root,Integer.MIN_VALUE);
    }
}