class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sum = 0;
        for(int x : arr)
            sum += x;
        if(diff > sum || (sum - diff) % 2 != 0)
            return 0;
        int target = (sum - diff)/2;
        int n = arr.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = target; j >= arr[i - 1]; j--)
            {
                    dp[j] = dp[j] + dp[j - arr[i - 1]];
            }
        }
        return dp[target];
        
    }
}
