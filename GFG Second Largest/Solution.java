class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int secondLargest = -1;
        int largest = -1;
        for(int x : arr)
        {
            if(x > largest)
                largest = x;
        }
        for(int x: arr)
        {
            if(x > secondLargest && x != largest)
                secondLargest = x;
        }
        return secondLargest;
        
    }
}
