class Solution 
{
    public int[] minBitwiseArray(List<Integer> nums) 
    {
        int n = nums.size();
        int[] result = new int[n];
        for(int i = 0;i < n; i++)
        {
            result[i] = -1;
            for(int j = 0; j < nums.get(i); j++)
            {
                if((j | (j + 1)) == nums.get(i))
                {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }

}