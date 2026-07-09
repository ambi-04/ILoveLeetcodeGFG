class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] idkbro = new int[n];
        int wth = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i - 1] <= maxDiff)
                idkbro[i] = wth;
            else{
                idkbro[i] = ++wth;
            }
        }
        boolean[] result = new boolean[queries.length];
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            if(idkbro[x] == idkbro[y])
                result[i] = true;
            else
                result[i] = false;

        }
        return result;
        
    }
}