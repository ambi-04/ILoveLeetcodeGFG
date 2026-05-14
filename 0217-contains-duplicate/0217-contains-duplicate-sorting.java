class Solution 
{
    public void sort(int low, int high, int[] arr)
    {
        if(low < high)
        {
            int partitionIndex = partition(high,low,arr);
            sort(low, partitionIndex - 1, arr);
            sort(partitionIndex + 1, high, arr);
        }
    }
    public int partition(int high, int low, int[] arr)
    {
        int pivotIndex = low + (high - low)/2;
        int pivot = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = pivot;
        int i = low;
        int j = high;
        while(i < j)
        {
            while(i < high && arr[i] <= pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;

    }
    public boolean containsDuplicate(int[] nums) 
    {
        sort(0,nums.length - 1, nums);
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i - 1])
                return true;
        }
        return false;
        
    }
}