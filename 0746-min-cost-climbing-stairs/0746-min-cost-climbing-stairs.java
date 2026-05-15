class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int cost2 = 0;
        int cost1 = 0;
        for(int i = n - 1; i>= 0; i--)
        {
            int currentCost = cost[i] + Math.min(cost1, cost2);
            cost2 = cost1;
            cost1 = currentCost;
            
        }
        return Math.min(cost1 , cost2);
        
    }
}