class Solution {
    public int numberOfSpecialChars(String word) 
    {
        //array approach
        int n = word.length();
        int[] arr = new int[26];
        int cnt = 0;
        for(int i  = 0; i < n; i++)
        {
            char ch = word.charAt(i);
            if(ch - 'a' >= 0)
                arr[ch - 'a'] = 1;
        }
        for(int i = 0; i < n; i++)
        {
            char ch = word.charAt(i);
            if(ch - 'a' < 0 && arr[ch - 'A'] == 1)
                arr[ch - 'A'] = -1;
            
        }
        for(int i = 0; i < 26; i++)
        {
            if(arr[i] == -1)
                cnt++;
            
        }
        return cnt;

        
    }
}