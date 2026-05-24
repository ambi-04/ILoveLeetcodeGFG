class Solution {
    public boolean checkElements(int start, int end, int[] arr) 
    {
        int n = arr.length;
        int cnt = 0;
        for(int x: arr)
        {
            if(x >= start && x <= end)
                cnt++;
            if(cnt == end - start + 1)
                return true;
        }
        if(cnt < end - start + 1)
            return false;
        return true;
        
        // code here
        
    }
}