class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j]= 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]); 
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = n;
        int j = m;
        while(i != 0 && j != 0){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                sb.append(str1.charAt(i - 1));
                i--;
                j --;
            }
            else{
                if(dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;
            }
        }
        sb.reverse();
        StringBuilder result = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while(p < sb.length() && p1 < n && p2 < m){
            char ch = sb.charAt(p);
            char ch1 = str1.charAt(p1);
            char ch2 = str2.charAt(p2);
            if(ch1 != ch)
            {
                result.append(ch1);
                p1++;
            }
            else if(ch2 != ch){
                result.append(ch2);
                p2++;
            }
            else{
                result.append(ch);
                p++;
                p1++;
                p2++;
            }
        }
        while(p1 < n){
            result.append(str1.charAt(p1));
            p1++;
        }
        while(p2 < m){
            result.append(str2.charAt(p2));
            p2++;
        }
        return result.toString();
    }
}