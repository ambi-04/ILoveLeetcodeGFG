class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] ans = new int[2*n];
        int index = 0;
        while(i < n)
        {
            ans[index] = nums[i];
            ans[index + 1] = nums[j];
            i++;
            j++;
            index += 2;
        }
        return ans;
    }
}