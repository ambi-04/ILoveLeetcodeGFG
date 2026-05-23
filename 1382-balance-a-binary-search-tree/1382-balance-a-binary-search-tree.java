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
    public void inorder(List<TreeNode> list, TreeNode root)
    {
        if(root == null)
            return;
        inorder(list,root.left);
        list.add(root);
        inorder(list,root.right);
    }
    public TreeNode construct(List<TreeNode> list, int start, int end)
    {
        if(start > end)
            return null;
        int mid = start + (end - start)/2;
        TreeNode root = list.get(mid);
        root.left = construct(list,start,mid - 1);
        root.right = construct(list,mid + 1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) 
    {
        List<TreeNode> list = new ArrayList<>();
        inorder(list,root);
        return construct(list,0,list.size() - 1);
        
    }
}