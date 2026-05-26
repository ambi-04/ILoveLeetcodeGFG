class Solution {
    public int numberOfSpecialChars(String word) 
    {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            set.add(ch);
        }
        int cnt = 0;
        for(char ch: set)
        {
            if(ch - 'a' >= 0)
            {
                
                if(set.contains((char)(ch - 32)))
                    cnt++;
            }
        }
        return cnt;

        
    }
}