class Solution 
{
    //memoization solution
    public int solution(int W, int n, int[] wt, int[] val, int[][] t)
    {
        if(W == 0 || n == 0)
        {
            return 0;
        }
        if(t[n][W] != -1)
            return t[n][W];
        if(W >= wt[n - 1])
        {
            t[n][W] = Math.max(val[n - 1] + solution(W - wt[n- 1], n - 1, wt, val,t), solution(W, n - 1, wt,val,t));
            return t[n][W];
        }
            
        else
        {
            t[n][W] = solution(W, n - 1, wt,val,t);
            return t[n][W];
        }
            
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        
        
        int n = wt.length;
        int[][] t = new int[n + 1][W + 1];
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= W; j++)
            {
                t[i][j] = -1;
            }
        }
        return solution(W,n,wt,val,t);
    }
}
