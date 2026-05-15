class Solution 
{
    public int solution(int[] nums, int low, int high)
    {
        if(low <= high)
        {
            int mid = low + (high - low)/2;
            int prev = Integer.MAX_VALUE;
            int next = Integer.MAX_VALUE;
            if(mid + 1 < nums.length)
                next = nums[mid + 1];
            if(mid - 1 >= 0)
                prev = nums[mid - 1];
            if(nums[mid] < prev && nums[mid] < next)
                return nums[mid];
            if(nums[mid] > nums[high])
                return solution(nums,mid + 1, high);
            else
                return solution(nums,low,mid - 1);
        }
        return -1;

    }
    public int findMin(int[] nums) 
    {
        return solution(nums,0,nums.length - 1);
        
    }
}