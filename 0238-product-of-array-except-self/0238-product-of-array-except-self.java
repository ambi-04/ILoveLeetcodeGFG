class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int product1 = 1;
        int product2 = 1;
        while(i < nums.length)
        {
            prefix[i] = product1;
            suffix[j] = product2;
            product1 = product1 * nums[i];
            product2 = product2 * nums[j]; 
            i++;
            j--;
        }
        i = 0;
        while(i < nums.length)
        {
            nums[i] = prefix[i] * suffix[i];
            i++;
        }
        return nums;
    }
}