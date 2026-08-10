class Solution {
    //static List<List<String>> result = new ArrayList<>();
    public static boolean isPalindrome(String s){
        int i =  0; 
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static int func(int i, int j, String s, int[][] memo){
        if(i > j){
            return 0;
        }
        
        else{
            if(memo[i][j] != -1)
                return memo[i][j];
            int min = Integer.MAX_VALUE;
            for(int k = i; k <= j; k ++){
                String substring = s.substring(i, k + 1);
                if(isPalindrome(substring)){
                    min = Math.min(min, 1 + func(k + 1,j,s, memo));
                } 
            }
            memo[i][j] = min;
            return min;
        }
        

    }
    public int minCut(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                memo[i][j] = -1;
            }
        }
        return func(0, n - 1, s,memo) - 1;
        
    }
}