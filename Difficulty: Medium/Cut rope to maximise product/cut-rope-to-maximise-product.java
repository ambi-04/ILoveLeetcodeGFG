class Solution 
{
    public int func(int n, int[] dp){
        if (n == 1)
            return 1;
        if(dp[n] != 0)
            return dp[n];
        int max = 0;
        for(int i = 1; i < n ; i++)
        {
            int product = Math.max(i * (n - i), func(i,dp) * func(n - i,dp));
            product = Math.max(func(i,dp) * (n - i), product);
            product = Math.max(func(n - i,dp) * i, product);
            max = Math.max(max, product);
        }
        dp[n] = max;
        return max;
        
    }
    public int maxProduct(int n ) {
        // code here
        return func(n,new int[n + 1]);
        
    }
}