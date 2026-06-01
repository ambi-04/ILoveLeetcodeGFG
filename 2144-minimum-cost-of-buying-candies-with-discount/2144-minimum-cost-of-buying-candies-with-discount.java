class Solution {
    public int minimumCost(int[] cost) 
    {
        Arrays.sort(cost);
        int n = cost.length;
        int cnt = 0;
        int sum = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            if(cnt == 2)
            {
                cnt = 0;
                continue;
            }
            sum = sum + cost[i];
            cnt ++;

        }
        return sum;
        
    }
}