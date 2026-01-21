class Solution 
{
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<int[]> stk = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int index = -1;
            while(!stk.isEmpty() && stk.peek()[0] <= arr[i])
                stk.pop();
            if(!stk.isEmpty())
                index = stk.peek()[1];
            result.add(i - index);
            stk.push(new int[]{arr[i],i});
                
        }
        return result;
        
    }
}
