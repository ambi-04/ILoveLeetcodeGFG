class Solution {
    public int search(int[] nums, int target) 
    {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            //System.out.println(mid);
            if(nums[mid] == target)
                return mid;
            //left half sorted
            if(nums[start] <= nums[mid] )
            {
                if(target < nums[mid] && target >= nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
                
            //right half
            else 
            {
                if(target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
                
                    
                
        }
        return -1;
        
    }
}