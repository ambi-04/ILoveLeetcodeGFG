class Solution {
    public int change(int amount, int[] coins) 
    {
        int n = coins.length;
        int W = amount;
        int[][] dp = new int[n + 1][W + 1];
        dp[0][0] = 1;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 0; j <= W; j++)
            {
                dp[i][j] = dp[i - 1][j];
                if(j >= coins[i - 1])
                    dp[i][j] += dp[i][j - coins[i - 1]];
            }
        }
        return dp[n][W];
        
    }
}