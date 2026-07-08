class Solution {
    static long modPow(long base, int exp, int MOD) {
        long ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                ans = (ans * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return ans;
    }
    public int[] sumAndMultiply(String s, int[][] queries) 
    {
        int n = s.length();
        int[] prefixSum = new int[n];
        int[] prefixX = new int[n];
        int[] prefixNoDigits = new int[n];
        int Sum = 0;
        long X = 0;
        int NoDigits = 0;
        for(int i = 0; i < n; i++){
            int digit = s.charAt(i) - '0';
            if(digit != 0){
                Sum += digit;
                X = (((X * 10) % 1000000007) + digit)% 1000000007;
                NoDigits ++;
            }
            prefixSum[i] = Sum;
            prefixX[i] = (int)X;
            prefixNoDigits[i] = NoDigits;
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int p = queries[i][0];
            int q = queries[i][1];
            int sum = prefixSum[q] - prefixSum[p] + (s.charAt(p) - '0');
            int num1 = 0;
            if(p - 1 >= 0)
                num1 = prefixX[p - 1];
            int num2 = prefixX[q];
            int idk1 = 0;
            if(p - 1 >= 0)
                idk1 = prefixNoDigits[p - 1];
            int idk2 = prefixNoDigits[q];
            long power = modPow(10,(idk2 - idk1),1000000007);
            long x = (num2  - (1L * num1 * power) % 1000000007 + 1000000007)% 1000000007;
            long final_num = (x * sum) % 1000000007;
            result[i] = (int)final_num;
        }
        return result;    
    }
}