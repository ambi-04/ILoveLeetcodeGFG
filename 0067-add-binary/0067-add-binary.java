class Solution {
    public String addBinary(String a, String b) 
    {
        if(a.length() < b.length())
            return addBinary(b,a);
        int sum = 0;
        int carry = 0;
        int na = a.length();
        int nb = b.length();
        int i = na - 1;
        int j = nb - 1;
        StringBuilder result = new StringBuilder();
        while(i >= 0)
        {
            sum = carry;
            sum = sum + a.charAt(i) - '0';
            if(j >= 0)
                sum = sum + b.charAt(j) - '0';
            carry = sum / 2;
            sum = sum % 2;
            result.append((char)(sum + '0'));
            i--;
            j--;
        }
        if(carry != 0)
            result.append((char)(carry + '0'));
        return result.reverse().toString();

        
    }
}