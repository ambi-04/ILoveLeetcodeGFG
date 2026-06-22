class Solution {
    public int rearrangeCharacters(String s, String target) 
    {
        int n1 = s.length();
        int n2 = target.length();
        int[] freq_s = new int[26];
        int[] freq_target = new int[26];
        for(int i = 0;  i < n2; i++)
        {
            char ch = target.charAt(i);
            freq_target[ch - 'a']++;
        }
        for(int i = 0;  i < n1; i++)
        {
            char ch = s.charAt(i);
            freq_s[ch - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < 26; j++)
        {
            if(freq_target[j] != 0)
            {
                min = Math.min(min, freq_s[j]/freq_target[j]);
            }
        }
        return min;

        
    }
}