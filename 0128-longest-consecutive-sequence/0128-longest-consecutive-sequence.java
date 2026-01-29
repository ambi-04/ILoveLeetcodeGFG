class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int element: set)
        {
            if(set.contains(element + 1) && !set.contains(element - 1))
                pq1.add(element);
            else if(!set.contains(element + 1) && set.contains(element - 1))
                pq2.add(element);
        }
        int max = 1;
        while(!pq1.isEmpty())
        {
            max = Math.max(max, (pq2.poll() - pq1.poll() + 1));
        }
        return max;
        
    }
}