class Solution {
    public int maxPeople(int[] arr) 
    {
        // code here
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int n = arr.length;
        int i =0;
        int j = n - 1;
        int [] ngl = new int[n];
        int [] ngr = new int[n];
        while(i < n)
        {
            //finding ngl
            while(! stk1.isEmpty() && arr[stk1.peek()] < arr[i])
                stk1.pop();
            if(stk1.isEmpty())
                ngl[i] = -1;
            else
                ngl[i] = stk1.peek();
            stk1.push(i);
            
            //finding ngr
            while(! stk2.isEmpty() && arr[stk2.peek()] < arr[j])
                stk2.pop();
            if(stk2.isEmpty())
                ngr[j] = n;
            else
                ngr[j] = stk2.peek();
            stk2.push(j);
            i++;
            j--;
        }
        int max = -1;
        i = 0;
        while(i < n)
        {
            max = Math.max(max, ngr[i] - ngl[i] - 1);
            i++;
        }
        return max;
        
        
    }
}
