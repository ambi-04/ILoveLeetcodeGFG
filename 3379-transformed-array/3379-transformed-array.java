class Solution 
{
    public int[] constructTransformedArray(int[] nums) 
    {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
        {
            int index = Math.floorMod((i + nums[i]),n);
            result[i] = nums[index];
        }
        return result;
    }
}