// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int k = i - 1;
        int mask = 1 << k;
        int ithBit = 0;
        if((num & mask) != 0)
            ithBit = 1;
        System.out.print(ithBit + " " + (num | mask) + " " + (num & ~mask));
    }
}
