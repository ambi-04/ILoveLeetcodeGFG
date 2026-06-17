class Solution {
    public char findKthBit(int n, int k) 
    {
        StringBuilder sb = new StringBuilder("0");
        for(int i = 1; i <= n; i++)
        {
            int n2 = sb.length();
            sb.append("1");
            for(int j = n2 - 1; j>= 0; j--)
            {
                char ch = sb.charAt(j);
                if(ch == '0')
                    sb.append('1');
                else
                    sb.append('0');
            }
            //System.out.println(prev);
            //prev = curr;
        }
        return sb.charAt(k - 1);

        
    }
}