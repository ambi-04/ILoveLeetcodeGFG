class Solution {
    public String processStr(String s) 
    {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '*')
            {
                if(!sb.isEmpty())
                    sb.deleteCharAt(sb.length() - 1);
            }
            else if(ch == '#')
            {
                int n2 = sb.length();
                for(int j = 0; j < n2; j++)
                {
                    sb.append(sb.charAt(j));
                }
            }
            else if(ch == '%')
            {
                sb.reverse();
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}