class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int j = nums.length - 1;
        int max = -1;
        for(int i = 0; i< nums.length; i++)
        {
            max = Math.max(max,nums[i] + nums[j]);
            j--;
            
        }
        return max;

        
    }
}