class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n = A.length;
        int[] hashTable = new int[n + 1];
        int[] C = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(hashTable[A[i]] == 1)
                cnt++;
            hashTable[A[i]] = 1;
             if(hashTable[B[i]] == 1)
                cnt++;
            hashTable[B[i]] = 1;
            C[i] = cnt;
        }
        return C;
        
        
    }
}