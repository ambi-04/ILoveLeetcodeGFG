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
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) 
    {
        if(x == root.val || y == root.val)
            return false;
        Queue<TreeNode[]> q = new LinkedList<>();
        q.add(new TreeNode[]{root,null});
        while(!q.isEmpty())
        {
            int size = q.size();
            int xparent = -1;
            int yparent = -1;
            while(size != 0)
            {
                TreeNode[] nodes = q.poll();
                TreeNode curr = nodes[0];
                TreeNode parent = nodes[1];
                if(curr.val == x)
                {
                    xparent = parent.val;
                }
                else if(curr.val == y)
                {
                    yparent = parent.val;
                }
                if(curr.right != null)
                    q.add(new TreeNode[]{curr.right,curr});
                if(curr.left != null)
                    q.add(new TreeNode[]{curr.left,curr});
                size--;

            }
            if(xparent >= 0 ||  yparent >=0)//it means both/one of the cousins were found(x and y)
            {
                if(xparent != yparent && xparent != -1 && yparent != -1)
                    return true;
                else 
                    return false;
            }

        }
        return false;
    }
}