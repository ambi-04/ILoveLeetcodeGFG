class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map  = new HashMap<>();
        int cnt = 0;
        map.put(0,1);
        int numSubarrays = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
                cnt++;
            if(map.containsKey(cnt - k))
                numSubarrays = numSubarrays + map.get(cnt - k);
            if(map.containsKey(cnt))
                map.put(cnt, map.get(cnt) + 1);
            else
                map.put(cnt,1);
        }
        return numSubarrays;
    }
}
