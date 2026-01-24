class Solution 
{
    int func(int open, int closed)
    {
        if(open > closed)
            return 0;
        if(open == 0 )
            return 1;
        int cnt = 0;
        
        cnt = func(open - 1,closed) + func(open,closed - 1);
        return cnt;
    }
    int findWays(int n) 
    {
        if(n % 2 != 0)
            return 0;
        // code here
        return func(n/2,n/2);
        
    }
}
