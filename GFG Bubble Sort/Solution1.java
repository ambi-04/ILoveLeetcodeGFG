class Solution1 {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        int j = n - 1;
        while(j > 0)
        {
            boolean isSorted = true;
            for(int i = 0; i < j; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
            j--;
        }
    }
}
