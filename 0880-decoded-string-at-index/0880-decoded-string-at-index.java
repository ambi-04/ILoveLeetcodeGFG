class Solution {
    public String decodeAtIndex(String s, int k) 
    {
        int n = s.length();
        long[] lengths = new long[n];
        k--;
        long k2 = k;
        long cnt = 0;
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a')
                lengths[i] = ++cnt;
            else
            {
                int num = ch - '0';
                cnt *= num;
                lengths[i] = cnt;
            }
        }
        System.out.println(Arrays.toString(lengths));
        for(int j = n - 1; j >= 0; j--)
        {
            char ch = s.charAt(j);
            if(ch >= 'a' && lengths[j] == k2 + 1)
                return Character.toString(ch);
            else if(ch < 'a')
            {
                int num = ch - '0';
                k2 = k2 % (lengths[j] / num);
            }     
        }
        return ".";
    }
}