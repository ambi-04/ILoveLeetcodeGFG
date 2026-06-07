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
    public TreeNode createBinaryTree(int[][] descriptions) 
    {
        HashMap<Integer,TreeNode> nodeMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int n = descriptions.length;
        for(int i = 0;i < n; i++)
        {
            int val = descriptions[i][0];
            int child = descriptions[i][1];
            TreeNode node = null;
            TreeNode childNode = null;
            if(!nodeMap.containsKey(val))
            {
                node = new TreeNode(val);
                nodeMap.put(val,node);
            }
                
            else
                node = nodeMap.get(val);
            if(!nodeMap.containsKey(child))
            {
                childNode = new TreeNode(child);
                nodeMap.put(child,childNode);
            }
                
            else
                childNode = nodeMap.get(child);
            if(descriptions[i][2] == 1)
                node.left = childNode;
            else
                node.right = childNode;
            set.add(child);
            
        }
        for(Map.Entry<Integer,TreeNode> entry: nodeMap.entrySet())
        {
            int key = entry.getKey();
            TreeNode node = entry.getValue();
            if(!set.contains(key))
                return node;
        }
        return null;
        
    }
}