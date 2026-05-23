/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution 
{
    public int nodeVal(Node  root)
    {
        if(root == null)
            return 0;
        int leftVal = nodeVal(root.left);
        int rightVal = nodeVal(root.right);
        int currVal = root.data;
        root.data = leftVal + rightVal;
        return root.data + currVal;
    }
    public void toSumTree(Node root) {
        // code here
        nodeVal(root);
        
    }
}