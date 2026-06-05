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
    public long kthLargestLevelSum(TreeNode root, int k) 
    {
        //PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Long> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            long levelSum = 0;
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
            list.add(levelSum);
        }
        long result = 0;
        Collections.sort(list);
        int n = list.size();
        while(k != 0 && n > 0)
        {
            result = list.get(n - 1);
            n--;
            k--;
        }
        if(k != 0)
            result = -1;
        return result;

        
    }
}