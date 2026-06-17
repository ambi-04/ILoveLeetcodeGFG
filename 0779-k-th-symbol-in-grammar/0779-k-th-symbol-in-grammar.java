class Solution 
{
    
    public int kthGrammar(int n, int k) 
    {
        n--;
        k--;
        int num = 0;
        int l = 0;
        int r = (int)Math.pow(2,n) - 1;
        for(int i = 0; i <= n; i++)
        {
            int left = 0;
            int right = 1;
            if(num == 1)
            {
                left = 1;
                right = 0;
            }
            int mid = l + (r - l)/2;
            if(k > mid)
            {
                l = mid + 1;
                num = right;
            }
            else
            {
                r = mid;
                num = left;
            }
        }
        return num;
    }
}