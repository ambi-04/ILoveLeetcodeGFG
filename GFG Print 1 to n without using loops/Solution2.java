//tail recursive
class Solution2
{
    static void func(int i, int N)
    {
        if(i == N + 1)
            return;
        System.out.print(i + " ");
        func(i + 1,N);
        
    }
    static void printTillN(int N) {
        // code here
        func(1,N);
        
    }
}
