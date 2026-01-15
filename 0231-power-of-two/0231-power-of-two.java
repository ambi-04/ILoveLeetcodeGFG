class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n < 0)
            return false;
        for(int i = 0; i <= 30; i++)
        {
            int num = (int)Math.pow(2,i);
            if(n == num)
                return true;
        }
        return false;
        
    }
}