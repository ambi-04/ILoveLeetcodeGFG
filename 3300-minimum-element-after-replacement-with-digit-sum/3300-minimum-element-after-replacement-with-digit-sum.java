class Solution {
    public int minElement(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int number = nums[i];
            int sum = 0;
            while(number != 0)
            {
                int digit = number % 10;
                sum = sum + digit;
                number = number/10;
            }
            if(sum < min)
                min = sum;
        }
        return min;
        
    }
}