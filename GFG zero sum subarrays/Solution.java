class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        int cnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            int val = 0;
            if(map.containsKey(sum))
            {
                val = map.get(sum);
                cnt = cnt + val;
                 
            }
                
            map.put(sum,val + 1);
            
        }
        return cnt;
        
    }
}
