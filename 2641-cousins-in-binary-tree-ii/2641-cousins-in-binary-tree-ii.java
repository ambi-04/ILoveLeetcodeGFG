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
    static class Node
    {
        TreeNode node;
        TreeNode parent;
        Node(TreeNode node, TreeNode parent)
        {
            this.node = node;
            this.parent = parent;
        }
    }

    public TreeNode replaceValueInTree(TreeNode root) 
    {
        HashMap<TreeNode,Integer> map = new HashMap<>();
        Node rootNode = new Node(root,null);
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root,null));
        int currLevelSum = 0;
        int nextLevelSum = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            nextLevelSum = 0;
            while(size != 0)
            {
                Node n = q.poll();
                if(n.node == root)
                    n.node.val = 0;
                else
                    n.node.val = currLevelSum - map.get(n.parent);
                int childSum = 0;
                if(n.node.left != null)
                {
                    nextLevelSum += n.node.left.val;
                    childSum += n.node.left.val;
                    q.add(new Node(n.node.left,n.node));
                }
                if(n.node.right != null)
                {
                    nextLevelSum += n.node.right.val;
                    childSum += n.node.right.val;
                    q.add(new Node(n.node.right,n.node));
                }
                map.put(n.node,childSum);
                size--;
            }
            currLevelSum = nextLevelSum;
        } 
        return root;

        
    }
}