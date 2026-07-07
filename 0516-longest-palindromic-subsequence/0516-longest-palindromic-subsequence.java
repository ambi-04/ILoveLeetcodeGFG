class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        StringBuilder rev = new StringBuilder(s).reverse();
        int[] dp1 = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int[] dp2 = new int[n + 1];
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == rev.charAt(j - 1))
                    dp2[j] = 1 + dp1[j - 1];
                else
                    dp2[j] = Math.max(dp1[j],dp2[j - 1]);
            }
            dp1 = dp2;
        }
        return dp1[n];
    }
}