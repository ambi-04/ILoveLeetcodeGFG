class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int i = 0; 
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j - i + 1 <= k)
        {
            int freq = 0;
            if(map.containsKey(arr[j]))
                freq = map.get(arr[j]);
            map.put(arr[j],freq + 1);
            j++;
        }
        result.add(map.size());
        while(j < arr.length)
        {
            int freqj = 0;
            if(map.containsKey(arr[j]))
                freqj = map.get(arr[j]);
            map.put(arr[j],freqj + 1);
            int freqi = map.get(arr[i]) - 1;
            if (freqi  == 0)
                map.remove(arr[i]);
            else
                map.put(arr[i],freqi);
            i++;
            result.add(map.size());
            j++;
            
            
        }
        return result;
        
        
    }
}
