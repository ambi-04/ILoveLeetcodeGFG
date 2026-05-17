class Solution {
    public int maxSum(int n) {
        // code here.
        int sum1 = n/2 + n/3 + n/4;
        if(sum1 <= n)
            return n;
        return maxSum(n/2) + maxSum(n/3) + maxSum(n/4);
    }
}
