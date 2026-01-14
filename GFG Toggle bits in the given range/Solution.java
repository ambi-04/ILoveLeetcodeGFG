// User function Template for Java

class Solution 
{
    static int toggle(int n, int k)
    {
        int mask = 1 << k;
        return n ^ mask;
        
    }
    static int toggleBits(int n, int l, int r) {
        // code here
        int k1 = l - 1;
        int k2 = r - 1;
        for(int i = k1; i <= k2; i++)
        {
            n = toggle(n,i);
        }
        return n;
        
        
    }
};
