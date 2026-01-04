class Solution {
    public boolean isPalindrome(String s) 
    {
        boolean result = true;
        StringBuilder cleaned_string = new StringBuilder();
        for(int i = 0;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                cleaned_string.append(ch);
            else if (ch >= 'A' && ch <= 'Z')
                cleaned_string.append((char)(ch + 32));
        }
        int i = 0;
        int j = cleaned_string.length() - 1;
        while(i <= j)
        {
            if(cleaned_string.charAt(i) != cleaned_string.charAt(j))
            {
                result = false;
                break;
            }
            i++;
            j--;
        }
        return result;
        
    }
}