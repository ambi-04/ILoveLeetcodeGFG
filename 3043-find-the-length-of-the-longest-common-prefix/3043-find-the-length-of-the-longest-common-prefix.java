class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr1)
        {
            while(x != 0)
            {
                set.add(x);
                x = x/10;
            }

        }
        int max = 0;
        for(int y : arr2)
        {
            while(y != 0)
            {
                if(set.contains(y) && y > max)
                    max = y;
                y = y/10;
            }
        }
        int cnt = 0;
        /*
        while(max != 0)
        {
            cnt++;
            max = max/10;
        }
        */
        if (max != 0)
            cnt = (int)(Math.log10(max) + 1);
        return cnt;
    }
}