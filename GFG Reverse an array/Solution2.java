//recursive
class Solution2
{
    public static void func(int l, int r, int[]arr)
    {
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        func(l + 1, r - 1, arr);
    }
    public void reverseArray(int arr[]) {
        // code here
        func(0,arr.length - 1,arr);
        
    }
}
