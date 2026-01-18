class Solution 
{
    int addTwoBits(int a, int b)
    {
        if(a == 1 && b == 1)
            return 0;
        else if (a == 0 && b == 0)
            return 0;
        else
            return 1;

    }
    int carryGenerated(int a, int b)
    {
        if(a == 1 && b == 1)
            return 1;
        else
            return 0;
    }
    public String addBinary(String a, String b) 
    {
        if(a.length() < b.length())
            return addBinary(b,a);
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0)
        {
            //System.out.println("carry" + carry);
            int bita = a.charAt(i) - '0';
            int bitb = 0;
            if(j >= 0)
                bitb = b.charAt(j) - '0';
            int sum = 0;
            int new_carry = carryGenerated(bita,bitb);
            sum = addTwoBits(bita,bitb);
            new_carry = new_carry + carryGenerated(sum,carry);
            sum = addTwoBits(sum,carry);
            
            //System.out.println("new_carry" + new_carry);
            //System.out.println("sum" + sum);
            carry = new_carry;
            result.append((char)(sum + '0'));
            i--;
            j--;

        }
        if(carry != 0)
            result.append((char)(carry + '0'));
        return result.reverse().toString();


        
    }
}