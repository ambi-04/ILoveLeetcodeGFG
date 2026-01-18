class Solution 
{
    public void func(int[] nums, int i, List<List<Integer>> result, List<Integer> set)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        func(nums,i + 1,result,set);
        set.removeLast();
        func(nums,i + 1,result,set);

    }
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        func(nums,0,result,new ArrayList<>());
        return result;
    }
}