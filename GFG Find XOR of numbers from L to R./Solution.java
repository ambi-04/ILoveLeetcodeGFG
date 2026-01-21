// User function Template for Java

class Solution 
{
    static int xor1toN(int n)
    {
        int x = n % 4;
        if(x == 1)
            return 1;
        else if (x == 2)
            return n + 1;
        else if(x == 3)
            return 0;
        else
            return n;
    }
    public static int findXOR(int l, int r) 
    {
        return xor1toN(r) ^ xor1toN(l - 1);
    }
}
