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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            while(size != 0)
            {
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                size--;
            }
            result.add(list);
        }
        int i = 0;
        int j = result.size() - 1;
        while(i < j)
        {
            List<Integer> temp = result.get(i);
            result.set(i,result.get(j));
            result.set(j,temp);
            i++;
            j--;
        }
        return result;

        
    }
}