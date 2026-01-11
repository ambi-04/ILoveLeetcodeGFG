// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        //step1: check if ith bit is set or not
        if((n &(1 << k)) == 0)
            n = n + (int)Math.pow(2,k);
        return n;
    }
}
