class Solution {
    public int LongestRepeatingSubsequence(String s) {
        // code here
        int n = s.length();
        int [] dp1 = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int[] dp2 = new int[n + 1];
            for(int j = 1; j <= n; j++){
                if(i != j && s.charAt(i - 1) == s.charAt(j - 1))
                    dp2[j] = 1 + dp1[j - 1];
                else
                    dp2[j] = Math.max(dp1[j],dp2[j - 1]);
            }
            dp1 = dp2;
        }
        return dp1[n];
    }
}