class Solution 
{
    public int solution(int[] dp,int[] arr, int i, int d)
    {
        if(dp[i] != 0)
            return dp[i];
        int max = 0;
        int n = arr.length;
        for(int x = 1; x <= d; x++)
        {
            if(i + x < n && arr[i + x] < arr[i])
                max = Math.max(max, solution(dp,arr,i + x,d));
            else
                break;
            
        }
        for(int x = 1; x <= d; x++)
        {
            if(i - x >= 0 && arr[i - x] < arr[i])
                max = Math.max(max, solution(dp,arr,i - x,d));
            else
                break;
            
        }
        dp[i] = 1 + max;
        return dp[i];
    }
    public int maxJumps(int[] arr, int d) 
    {
        int n = arr.length;
        int[] dp = new int[n];
        int max = 0;

        for(int i = 0;i < n; i++)
        {
            if(dp[i] == 0)
                dp[i] = solution(dp,arr,i,d);
            max = Math.max(max,dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        return max;
        
    }
}