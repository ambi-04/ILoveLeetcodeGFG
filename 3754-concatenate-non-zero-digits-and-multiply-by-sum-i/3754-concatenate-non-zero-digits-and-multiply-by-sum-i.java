class Solution {
    public long sumAndMultiply(int n) 
    {
        long sum = 0;
        int multiplier = 1;
        long x = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit != 0)
            {
                sum += digit;
                x = digit * multiplier + x;
                multiplier *= 10;
            }
                
            n /= 10;
        }
        return x * sum;
        
        
    }
}