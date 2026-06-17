class Solution {
    public char findKthBit(int n, int k) 
    {
        StringBuilder prev = new StringBuilder("0");
        for(int i = 1; i <= n; i++)
        {
            StringBuilder curr = new StringBuilder(prev);
            curr.append("1");
            for(int j = prev.length() - 1; j>= 0; j--)
            {
                char ch = prev.charAt(j);
                if(ch == '0')
                    curr.append('1');
                else
                    curr.append('0');
            }
            //System.out.println(prev);
            prev = curr;
        }
        return prev.charAt(k - 1);

        
    }
}