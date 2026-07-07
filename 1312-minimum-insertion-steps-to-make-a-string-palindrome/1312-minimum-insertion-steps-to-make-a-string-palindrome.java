class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int [] dp1 = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int[] dp2 = new int[n + 1]; 
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == s.charAt(n - j))
                    dp2[j] = dp1[j - 1] + 1;
                else
                    dp2[j] = Math.max(dp1[j],dp2[j - 1]);
            }
            dp1 = dp2;
        }
        return n - dp1[n];
    }
}