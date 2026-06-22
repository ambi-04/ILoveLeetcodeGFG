class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        int[] freq = new int[5];
        int n = text.length();
        for(int i = 0; i < n; i++)
        {
            char ch = text.charAt(i);
            if(ch == 'b')
                freq[0]++;
            else if(ch == 'a')
                freq[1]++;
            else if(ch == 'l')
                freq[2]++;
            else if(ch == 'o')
                freq[3]++;
            else if(ch == 'n')
                freq[4]++;
        }
        freq[2] /= 2;
        freq[3] /= 2;
        int min = Integer.MAX_VALUE;
        for(int x : freq)
        {
            min = Math.min(min,x);
        }
        return min;
        
    }
}