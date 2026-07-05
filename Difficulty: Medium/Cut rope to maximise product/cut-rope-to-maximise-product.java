class Solution {
    public int maxProduct(int n) 
    {
        // code here
        if(n == 2 || n == 3)
            return n - 1;
        if(n == 4)
            return 4;
        int num_pieces3 = n/3;
        int last_piece = n % 3;
        if(last_piece == 1)
        {
            last_piece = 4;
            num_pieces3 --;
        }
        int result = (int)Math.pow(3,num_pieces3);
        if(last_piece != 0)
            result = result * last_piece;
        return result;
        
    }
}