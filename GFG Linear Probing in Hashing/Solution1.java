class Solution {
    public ArrayList<Integer> linearProbing(int[] arr, int m) 
    {
        // code here
        ArrayList<Integer> hashTable = new ArrayList<>();
        for(int i = 0; i < m; i++)
            hashTable.add(-1);
        for(int i = 0; i < arr.length; i++)
        {
            int key = arr[i];
            int index = key % m;
            int j = index;
            do
            {
                int element = hashTable.get(j);
                if(element == -1 || element == key)
                {
                    hashTable.set(j,key);
                    break;
                }
                    
                j++;
                if(j == m)
                    j = 0;
            }while(j != index);
        }
        return hashTable;
        
    }
}
