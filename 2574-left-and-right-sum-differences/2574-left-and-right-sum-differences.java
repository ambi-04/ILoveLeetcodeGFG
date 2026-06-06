class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int sum = 0;
        for(int x : nums)
        {
            sum += x;
        }
        int leftSum = 0;
        int rightSum = sum;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i< n; i++)
        {
            rightSum = rightSum - nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum = leftSum + nums[i];
        }
        return ans;
        
    }
}