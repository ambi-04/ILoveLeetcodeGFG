/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution 
{
    public static int solution(int parentSum, Node root)
    {
        if(root.left == null && root.right == null)
            return parentSum * 10 + root.data;
        int leftSum = 0;
        if(root.left != null)
            leftSum = solution(root.data + 10*parentSum, root.left);
        int rightSum = 0;
        if(root.right != null)
            rightSum = solution(root.data + 10*parentSum,root.right);
        return leftSum + rightSum;
    }
    public static int treePathsSum(Node root) {
        return solution(0,root);
        // add code here.
    }
}