//Approach 1 - without bit masking
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        n = n >> k;
        if(n % 2 != 0)
            return true;
        else
            return false;
    }
}
