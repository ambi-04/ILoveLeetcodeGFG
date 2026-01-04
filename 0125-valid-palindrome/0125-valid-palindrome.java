class Solution 
{
    public static boolean func(String s, int l, int r)
    {
        if(l > r)
            return true;
        char ch1 = s.charAt(l);
        char ch2 = s.charAt(r);
        if(ch1  >= 65 && ch1 <= 90)
        {
            ch1 = (char)(ch1  + 32);
        }
        if(ch2 >= 65 && ch2 <= 90)
        {
            ch2 = (char)(ch2  + 32);
        }
        if(!(ch1 >= 48 && ch1 <= 57) && !(ch1 >= 97 && ch1 <= 122) )
            return func(s,l+1,r);
        if(!(ch2 >= 48 && ch2 <= 57) && !(ch2 >= 97 && ch2 <= 122) )
            return func(s,l,r - 1);
        if(ch1 == ch2)
            return func(s,l + 1,r - 1);
        return false;
        
    }
    public boolean isPalindrome(String s) 
    {
        return func(s,0,s.length() - 1);

    }
}