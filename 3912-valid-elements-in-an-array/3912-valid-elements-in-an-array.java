class Solution {
    public List<Integer> findValidElements(int[] nums) 
    {
        int i = 0;
        int j = nums.length - 1;
        int maxL = -1;
        int maxR = -1;
        int[] greatestLeft = new int[nums.length];
        int[] greatestRight = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        while(i < nums.length)
        {
            greatestLeft[i] = maxL;
            if(nums[i] > maxL)
            {
                maxL = nums[i];
            }
            greatestRight[j] = maxR;
            if(nums[j] > maxR)
            {
                maxR = nums[j];
            }
            i++;
            j--;
        }
        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] > greatestLeft[i] || nums[i] > greatestRight[i])
                list.add(nums[i]);
        }
        return list;
    }
}