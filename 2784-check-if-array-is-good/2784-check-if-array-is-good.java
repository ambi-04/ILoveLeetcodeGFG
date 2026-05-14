class Solution {
    public boolean isGood(int[] nums) 
    {
        int max = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i]; 
            }   
            if(nums[i] + 1 > n)
                return false;
        }
        if(n != max + 1)
            return false;
        HashSet<Integer> set = new HashSet<>();
        int freq = 1;
        for(int x : nums)
        {
            if(set.contains(x))
            {
                if(x != max)
                    return false;
                if(x == max)
                    freq++;
                if(freq > 2)
                    return false;
            }
            set.add(x);
            
        }
        return true;
        

        
    }
}