class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        n = Math.abs(n);
        for(int i = 0; i <= 31; i++)
        {
            Long num = (long)Math.pow(2,i);
            if(n == num)
                return true;
        }
        return false;
        
    }
}