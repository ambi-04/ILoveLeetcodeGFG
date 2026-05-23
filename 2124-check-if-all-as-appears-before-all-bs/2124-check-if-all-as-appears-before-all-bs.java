class Solution {
    public boolean checkString(String s) 
    {
        int a = 0;
        int b = 0;
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == 'a')
            {
                if(b != 0)
                    return false;
                a++;
            }
            else
                b++;
        }
        return true;
        
    }
}