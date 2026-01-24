class Solution 
{
    public int kill(int i, ArrayList<Integer> arr, int k)
    {
        if(arr.size() == 1)
            return arr.get(i);
        arr.remove(i);
        return kill((i + k - 1) % arr.size(),arr,k);
    }
    public int josephus(int n, int k) 
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            arr.add(i + 1);
        }
        return kill((k - 1) % n,arr,k);
        
    }
}
