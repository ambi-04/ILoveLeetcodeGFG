/* Structure of tree Node
class Node {
  public:
    int data;
    Node left;
    Node right;

    public Node(int x) {
        data = x;
        left = null;
        right = null;
    }
};*/
class Solution 
{
    static class TreeNode
    {
        Node node;
        int level;
        TreeNode(Node node, int level)
        {
            this.node = node;
            this.level = level;
        }
    }
    public int minLeafSum(Node root) 
    {
        if(root == null)
            return 0;
        TreeNode treeRoot = new TreeNode(root,0);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(treeRoot);
        int level = 0;
        int sum = 0;
        while(!q.isEmpty())
        {
            while(!q.isEmpty() && q.peek().level == level)
            {
                TreeNode treeNode = q.poll();
                if(treeNode.node.left == null && treeNode.node.right == null)
                    sum = sum + treeNode.node.data;
                if(treeNode.node.left != null)
                    q.add(new TreeNode(treeNode.node.left,level + 1));
                if(treeNode.node.right != null)
                    q.add(new TreeNode(treeNode.node.right,level + 1));
            }
            if(sum != 0)
                break;
            level++;
        }
        return sum;
        // code here
        
    }
}