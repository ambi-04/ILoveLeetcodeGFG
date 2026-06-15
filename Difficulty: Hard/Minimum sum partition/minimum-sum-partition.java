class Solution {
    public int minDifference(int arr[]) {
        // code here
        int sum = 0;
        for(int x : arr)
        {
            sum += x;
        }
        int W = sum / 2;
        int dp[] = new int[W + 1];
        int n = arr.length;
        for(int i = 1; i <= n; i++)
        {
            for(int j = W; j >= arr[i - 1]; j--)
            {
                dp[j] = Math.max(dp[j],arr[i - 1] + dp[j - arr[i - 1]]);
            }
        }
        return (sum - dp[W]) - dp[W];
    }
}
