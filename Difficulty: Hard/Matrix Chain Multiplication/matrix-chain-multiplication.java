class Solution {
    static int func(int i, int j, int[] arr, int[][] dp){
        if(i == j - 1)// single matrix 
            return 0;
        if(dp[i][j] != 0)
            return dp[i][j];
        int optimal = Integer.MAX_VALUE;
        for(int k = i + 1; k < j; k++){
            int cost = func(i,k,arr,dp) + func(k,j,arr,dp) + arr[i] * arr[k] * arr[j];
            optimal = Math.min(cost,optimal);
        }
        dp[i][j] = optimal;
        return optimal;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        return func(0,arr.length - 1, arr, new int[arr.length][arr.length]);
        
    }
}