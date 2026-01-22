class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length())
            return false;
        int n = s.length();
        int[] s_count = new int[26];
        int[] t_count = new int[26];
        for(int i = 0; i < n; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            s_count[ch1 - 'a']++;
            t_count[ch2 - 'a']++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(s_count[i] != t_count[i])
                return false;
        }
        return true;
        
    }
}