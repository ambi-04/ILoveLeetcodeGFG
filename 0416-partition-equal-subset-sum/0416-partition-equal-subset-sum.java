class Solution 
{
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(sum % 2 != 0)
            return false;
        int n = nums.length;
        int w = sum/2;
        boolean[] dp = new boolean[w + 1];
        dp[0] = true;
        for(int i = 1; i <= n; i++)
        {
            //boolean dp2 = new boolean[w + 1];
            for(int j = w; j >= 0; j--)
            {
                if(j >= nums[i - 1])
                    dp[j] = dp[j] || dp[j - nums[i -  1]];        
            }
        }
        return dp[w];
        
    }
}