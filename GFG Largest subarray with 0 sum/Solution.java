class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int longestLength = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if(map.containsKey(sum))
            {
                longestLength = Math.max(longestLength, i - map.get(sum));
                //System.out.println(i+ " " + map.get(sum));
            }
                
            else
                map.put(sum,i);
            
        }
        //System.out.println(map);
        return longestLength;
    }
}
