class Solution 
{
    public static boolean isLetterOrDigit(char ch)
    {
        if ((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')||(ch >= '0' && ch <= '9'))
            return true;
        else
            return false;

    }
    public boolean isPalindrome(String s) 
    {
        //without creating a separate string
        boolean result = true;
        int i = 0;
        int j = s.length() - 1;
        while(i <= j)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!isLetterOrDigit(ch1))
            {
                i++;
                continue;
            }
            if(!isLetterOrDigit(ch2))
            {
                j--;
                continue;
            }
            if(ch1 >= 'A' && ch1 <= 'Z')
                ch1 = (char)(ch1 + 32);
            if(ch2 >= 'A' && ch2 <= 'Z')
                ch2 = (char)(ch2 + 32);
            //System.out.println(ch1 + " " + ch2);
            if(ch1 != ch2)
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