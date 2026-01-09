class Solution {
    public int bitwiseComplement(int n) 
    {
        
        int i = 0;
        int result = 0;
        do
        {
            int rem = n % 2;
            if(rem == 0)
                rem = 1;
            else
                rem = 0;
            n = n / 2;
            result = result + rem * (int)Math.pow(2,i);
            i++;

        }while(n != 0);
        return result;
        
    }
}