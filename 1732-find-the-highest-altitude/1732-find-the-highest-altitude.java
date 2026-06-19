class Solution {
    public int largestAltitude(int[] gain) 
    {
        int max = 0;
        int alt = 0;
        for(int x:gain)
        {
            alt += x;
            max = Math.max(max,alt);
        }        
        return max;
    }
}