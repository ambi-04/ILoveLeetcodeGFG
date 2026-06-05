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
    public int maxLevelSum(TreeNode root) 
    {
        int max = root.val;
        int level = 0;
        int maxLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            level++;
            int levelSum = 0;
            int size = q.size();
            while(size != 0)
            {
                TreeNode node = q.poll();
                levelSum += node.val;
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                size--; 
            }
            if(levelSum > max)
            {
                max = levelSum;
                maxLevel = level;
            }
        }
        //System.out.println(max);
        return maxLevel;
        
    }
}