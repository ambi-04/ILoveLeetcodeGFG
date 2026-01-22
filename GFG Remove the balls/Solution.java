class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        Stack<Integer> stk = new Stack<>();
        int n = color.length;
        for(int i = 0; i < n; i++)
        {
            if(!stk.isEmpty() && (color[stk.peek()] == color[i] && radius[stk.peek()] == radius[i]))
                stk.pop();
            else
                stk.push(i);
        }
        return stk.size();
    }
}
