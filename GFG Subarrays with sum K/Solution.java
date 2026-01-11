class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map  = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i = 0; i< arr.length; i++)
        {
            sum = sum + arr[i];
            if(map.containsKey(sum - k))
                result = result + map.get(sum - k);
            int cnt = 0;
            if(map.containsKey(sum))
                cnt = map.get(sum);
            map.put(sum , cnt + 1);
        }
        return result;
        
    }
}
