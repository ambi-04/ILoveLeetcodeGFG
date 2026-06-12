/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = solution(root.left,p,q);
        TreeNode right = solution(root.right,p,q);
        if(left != null && right != null)
            return root;
        if(left != null)
            return left;
        else if(right != null)
            return right;
        else
            return null;



    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        return solution(root,p,q);
    }
}