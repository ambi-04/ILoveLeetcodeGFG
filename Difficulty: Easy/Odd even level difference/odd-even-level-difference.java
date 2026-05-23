/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution 
{
    static class TreeNode{
        Node node;
        int level;
        TreeNode(Node node, int level){
            this.level = level;
            this.node = node;
        }
    }
    int getLevelDiff(Node root) {
        // code here
        int oddSum = 0;
        int evenSum = 0;
        int level = 1;
        TreeNode rootNode = new TreeNode(root,1);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(rootNode);
        while(!q.isEmpty())
        {
            while(!q.isEmpty() && q.peek().level == level)
            {
                TreeNode treenode = q.poll();
                if(level % 2 == 0)
                    evenSum = evenSum + treenode.node.data;
                else
                    oddSum = oddSum + treenode.node.data;
                if(treenode.node.left != null)
                    q.add(new TreeNode(treenode.node.left,level + 1));
                if(treenode.node.right != null)
                    q.add(new TreeNode(treenode.node.right,level + 1));
                
            }
            level++;
        }
        return oddSum - evenSum;
    }
}