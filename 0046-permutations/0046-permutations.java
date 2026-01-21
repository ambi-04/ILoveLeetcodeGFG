class Solution 
{
    public void func(List<List<Integer>> result, List<Integer> permutation, int[] nums,int[] used, int cnt)
    {
        if(cnt == nums.length)
        {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(used[i] == 0)
            {
                used[i] = 1;
                permutation.add(nums[i]);
                func(result,permutation,nums,used,cnt + 1);
                used[i] = 0;
                permutation.removeLast();
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        func(result,new ArrayList<>(),nums,new int[nums.length],0);
        return result;
    }
}