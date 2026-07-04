class Solution {
    public int cutRod(int[] price) {
        // code here
        int W = price.length;
        int[][] dp = new int[W + 1][W + 1] ;
        for(int i = 1; i <= W; i++)
        {
            for(int j = 0; j <= W; j++)
            {
                if(i <= j)
                    dp[i][j] = Math.max(dp[i - 1][j], price[i - 1] + dp[i][j - i]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[W][W];
    }
}