class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> revList= new ArrayList<>();
        int carry = 0;
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--)
        {
            if((carry == 1 && digits[i] == 9) || (digits[i] == 9 && i == n - 1))
            {
                revList.add(0);
                carry = 1;
            }
            else
            {
                if(i == n - 1)
                    revList.add(digits[i] + 1);
                else
                    revList.add(digits[i] + carry);
                carry = 0;
            }
        }
        if(carry == 1)
            revList.add(carry);
        int[] result = new int[revList.size()];
        Collections.reverse(revList);
        for(int i = revList.size() - 1; i >= 0; i--)
        {
            result[i] = revList.get(i);
        }
        return result;
        
    }
}