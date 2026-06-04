class Solution 
{
    public int totalWaviness(int num1, int num2) 
    {
        int cnt = 0;
        for(int i = num1; i <= num2; i++)
        {
            int n = (int)(Math.floor(Math.log10(i)) + 1);
            int[] num = new int[n];
            int j = n - 1;
            int x = i;
            while(x != 0)
            {
                int digit = x % 10;
                num[j] = digit;
                x = x / 10;
                j--;
            }
            j = 0;
            while(j < n)
            {
                if(j - 1 >= 0 && j + 1 < n)
                {
                    if(num[j] < num[j - 1] && num[j] < num[j + 1])
                        cnt++;
                    else if(num[j] > num[j - 1] && num[j] > num[j + 1])
                        cnt++;
                }
                j++;
            }
        }
        return cnt;
    }
}