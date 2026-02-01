class Solution 
{
    public int minimumCost(int[] nums) 
    {
        int min1 = 51;
        int min2 = 51;
        int i = 1;
        while(i < nums.length)
        {
            if(nums[i] <=  min1)
            {
                min2 = min1;
                min1 = nums[i];
            }
            else if(nums[i] < min2)
                min2 = nums[i];
            i++;
        }
        return min1 + min2 + nums[0];
    }
}