class Solution 
{
    public char findKthBit(int n, int k) 
    {
        if(n == 1)
            return '0';
        int N = (int)Math.pow(2,n) - 1;//no of characters in nth row
        int mid = N/2 + 1;
        if(k == mid)
            return '1';
        if(k > mid )
        {
            char ch = findKthBit(n - 1, N - k + 1);
            if(ch == '0')
                return '1';
            else
                return '0';
        }    
        else
            return findKthBit(n - 1, k);

        
    }
}