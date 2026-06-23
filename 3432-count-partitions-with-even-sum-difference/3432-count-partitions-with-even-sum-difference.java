class Solution {
    public int countPartitions(int[] nums) 
    {
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(sum % 2 != 0)
            return 0;
        int partition_sum = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            partition_sum += nums[i];
            int diff = Math.abs(partition_sum - (sum - partition_sum));
            if(diff % 2 == 0)
                cnt++;
        }
        return cnt;
        
    }
}