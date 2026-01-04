//Non tail recursion
class Solution1
{
    
    static void printTillN(int N) {
        // code here
        if(N == 0)
            return;
        printTillN(N - 1);
        System.out.print(N + " ");
        
    }
}
