class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        int i = 0; 
        int min = Integer.MAX_VALUE;
        
        HashMap<Integer,List<List<Integer>>> map = new HashMap<>();
        while(i + 1 < arr.length)
        {
            int diff = arr[i + 1] - arr[i];
            min = Math.min(min,diff);
            if(!map.containsKey(diff))
                map.put(diff,new ArrayList<>());
            List<List<Integer>> result = map.get(diff);
            List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i + 1]);
            result.add(pair);
            i++;

        }
        return map.get(min);

        
    }
}