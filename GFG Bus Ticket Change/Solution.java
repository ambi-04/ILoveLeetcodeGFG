class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int[] note_count = new int[2];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 5)
            {
                note_count[0]++;
            }
            else if(arr[i] == 10)
            {
                note_count[1]++;
                if(note_count[0] == 0)
                    return false;
                note_count[0]--;
            }
            else
            {
                if(note_count[1] >= 1 && note_count[0] >= 1)
                {
                    note_count[1]--;
                    note_count[0]--;
                }
                else if(note_count[0] >= 3)
                {
                    note_count[0] = note_count[0] - 3;
                }
                else
                    return false;
            }
            
        }
        return true;
    }
}
