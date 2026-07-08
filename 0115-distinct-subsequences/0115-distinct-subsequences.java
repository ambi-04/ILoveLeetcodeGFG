class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] dp1 = new int[m + 1];
        dp1[0] = 1;
        for(int i = 1; i <= n; i++){
            int[] dp2 = new int[m + 1];
            dp2[0] = 1;
            for(int j = 1; j <= m; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1))
                    dp2[j] = dp1[j - 1] + dp1[j];
                else
                    dp2[j] = dp1[j];
            }
            dp1 = dp2;
        }
        return dp1[m];

    }
}