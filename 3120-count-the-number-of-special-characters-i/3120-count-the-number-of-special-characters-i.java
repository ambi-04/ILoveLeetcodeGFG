class Solution {
    public int numberOfSpecialChars(String word) 
    {
        //bit manipulation approach
        int lower = 0;
        int upper = 0;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch - 'a' >= 0)//lowercase
            {
                lower = lower | (1 << (ch - 'a' + 1));
            }
            else
                upper = upper | (1 << (ch - 'A' + 1));
        }
        int special = lower & upper;
        int cnt = 0;
        while(special != 0)
        {
            special = special & (special - 1);
            cnt++;
            
        }
        return cnt;
        
    }
}