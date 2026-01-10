class Solution {
    public ArrayList<Integer> quadraticProbing(int[] arr, int m) {
        // code here
        ArrayList<Integer> hashTable = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            hashTable.add(-1);
        }
        for(int i = 0; i < arr.length; i++)
        {
            int key = arr[i];
            int index = key % m;
            int j = index;
            int probeNumber = 1;
            do
            {
                int element = hashTable.get(j);
                if(element == key || element == -1)
                {
                    hashTable.set(j,key);
                    break;
                }
                j = (index + (int)Math.pow(probeNumber,2)) % m;
                probeNumber++;
                
                
            }
            while(j != index);
        }
        return hashTable;
    }
}
