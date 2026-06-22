class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        int sum = 0;
        int[] chars_freq = new int[26];
        for(int i =0; i < chars.length(); i++)
        {
            char ch = chars.charAt(i);
            chars_freq[ch - 'a']++;
        }
        int n = words.length;
        for(int i = 0; i < n; i++)
        {
            int[] freq_copy = chars_freq.clone();
            String word = words[i];
            int n2 = word.length();
            int flag = 1;
            for(int j = 0; j < n2; j++)
            {
                char ch = word.charAt(j);
                if(freq_copy[ch - 'a'] == 0)
                {
                    flag = 0;
                    break;
                }

                freq_copy[ch - 'a']--;
            }
            if(flag == 1)
                sum += n2;
        }
        return sum;
        
    }
}