class Solution {
    public int fib(int n) 
    {
        //iterative solution
        int prev = 1;
        int prev2 = 0;
        if(n == 0)
            return prev2;
        if(n == 1)
            return prev;
        int i = 2;
        int result = 0;
        while(i <= n)
        {
            result = prev + prev2;
            prev2 = prev;
            prev = result;
            i ++;
        }
        return result;
        
    }
}