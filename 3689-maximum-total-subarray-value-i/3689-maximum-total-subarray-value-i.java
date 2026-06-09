class Solution {
    public long maxTotalValue(int[] nums, int k) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x: nums)
        {
            if(x > max)
                max = x;
            if(x < min)    
                min = x;
        }

        //System.out.println(max + " " + min);
        return (long)(max - min)* k;
        
    }
}