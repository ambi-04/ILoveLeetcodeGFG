class Solution {
    public char processStr(String s, long k) 
    {
        int n = s.length();
        long[] length = new long[n];
        long cnt = 0;
        for(int i = 0; i < n; i++)
        {
            char ch  = s.charAt(i);
            if(ch == '*')
            {
                cnt--;
                if(cnt < 0)
                    cnt = 0;
                length[i] = cnt;
            }
            else if(ch == '#')
            {
                cnt = cnt * 2;
                length[i] = cnt;
            }
            else if(ch == '%')
                length[i] = cnt;
            else
            {
                cnt++;
                length[i] = cnt;
            }
        }
        //System.out.println(length[n - 1]);
        if(k >= length[n - 1])
            return '.';
        for(int j = n - 1; j >= 0; j--)
        {
            char ch = s.charAt(j);
            long l = length[j];
            if(ch == '%')
                k = l - k - 1;
            else if(ch == '#')
                k = k % (l/2);
            else if(ch >= 'a' && l - 1 == k)
                return ch;
        }
        //System.out.println("ih");
        return '.';
        
    }
}