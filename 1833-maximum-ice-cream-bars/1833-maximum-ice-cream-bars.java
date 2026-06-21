class Solution {
    public int maxIceCream(int[] costs, int coins) 
    {
        int n = costs.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : costs)
        {
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        int[] count_arr = new int[max - min + 1];
        for(int x : costs)
        {
            int index = x - min;
            count_arr[index]++;
        }
        int curr_coins = coins;
        int candies = 0;
        for(int i = 0; i < count_arr.length; i++)
        {
            if(count_arr[i] == 0)
                continue;
            int val = i + min;
            if(val > curr_coins)
                break;
            if(val * count_arr[i] <= curr_coins)
            {
                curr_coins = curr_coins - val * count_arr[i];
                candies += count_arr[i];
            }
            else
            {
                candies += curr_coins/val;
                curr_coins -= val * curr_coins/val;
                
            }
            //System.out.println(curr_coins + " " + candies);
                
        }
        return candies;

        
    }
}