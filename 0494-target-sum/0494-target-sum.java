class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        target = Math.abs(target);
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(target > sum || (sum - target)% 2 != 0 )
            return 0;
        int W = (sum - target)/2;
        int[] dp = new int[W + 1];
        dp[0] = 1;
        for(int i = 1; i <= nums.length; i++)
        {
            for(int j = W; j >= nums[i - 1]; j--)
            {
                dp[j] = dp[j] + dp[j - nums[i - 1]];
            }
        }
        return dp[W];
        
    }
}