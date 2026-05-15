class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n ];
        for(int i = n - 1; i>= 0; i--)
        {
            int cost1 = 0;
            int cost2 = 0;

            if(i + 1 < n)
                cost1 = dp[i + 1];
            if(i + 2 < n)
                cost2 = dp[i + 2];
            dp[i] = cost[i] + Math.min(cost1, cost2);
            
        }
        return Math.min(dp[0],dp[1]);
        
    }
}