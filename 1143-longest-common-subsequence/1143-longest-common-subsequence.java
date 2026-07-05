class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[] dp1 = new int[m + 1];
        for(int i = 1 ; i <= n; i++)
        {
            int[] dp2 = new int[m + 1];
            for(int j = 1; j <= m; j++)
            {
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp2[j] = 1 + dp1[j - 1];
                else
                    dp2[j] = Math.max(dp1[j],dp2[j - 1]);
            }
            dp1 = dp2;
        }
        return dp1[m];
    }
}