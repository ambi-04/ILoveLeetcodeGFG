class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int cnt = 0;
        int max = 0;
        for(int x:nums)
        {
            if(x == 1)
                cnt++;
            else
            {
                if(cnt > max)
                    max = cnt;
                cnt = 0;
            }
        }
        if(cnt > max)
            max = cnt;
        return max;
        
    }
}