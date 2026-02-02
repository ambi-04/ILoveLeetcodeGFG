class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] pos = new int[10000];
        int[] neg = new int[10000];
        for(int i = 0; i < nums.length; i++)
        {
            int index = nums[i];
            if(nums[i] < 0)
            {
                index = Math.abs(nums[i]);
                neg[index]++;
            }
            else
                pos[index]++;    
            
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0; i < 10000; i++)
        {
            pq.add(new int[]{pos[i],i});
            pq.add(new int[]{neg[i],-1 * i});
            if(pq.size() > k)
            {
                while(pq.size() != k)
                    pq.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty())
        {
            result[i] = pq.poll()[1];
            i++;
        }
        return result;
        
    }
}