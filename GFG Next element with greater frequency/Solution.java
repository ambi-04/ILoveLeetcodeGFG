class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) 
    {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            int freq = 0;
            if(map.containsKey(arr[i]))
                freq = map.get(arr[i]);
            map.put(arr[i],freq + 1);
        }
        Stack<int[]> stk = new Stack<>();
        int[] result = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--)
        {
            int curr_freq = map.get(arr[i]);
            while(!stk.isEmpty() && stk.peek()[1] <= curr_freq)
            {
                stk.pop();
            }
            if(stk.isEmpty())
                result[i] = -1;
            else
                result[i] = stk.peek()[0];
            stk.push(new int[]{arr[i],map.get(arr[i])});
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x: result)
        {
            ans.add(x);
        }
        return ans;
        
    }
}
