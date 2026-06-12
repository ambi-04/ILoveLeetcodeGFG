class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = target; j >= 0; j--)
            {
                if(nums[i - 1] <= j)
                    dp[j] = dp[j] + dp[j - nums[i - 1]];
                else
                    dp[j] = dp[j];
            }
        }
        return dp[target];
        
    }
}