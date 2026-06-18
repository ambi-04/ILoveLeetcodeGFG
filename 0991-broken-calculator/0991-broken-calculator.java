class Solution {
    public int brokenCalc(int startValue, int target) 
    {
        int cnt = 0;
        while(target != startValue)
        {
            if(target < startValue)
            {
                cnt = cnt + startValue - target;
                target = startValue;
            }
            else
            {
                if(target % 2 == 0)
                {
                    target = target /2;
                    cnt++;
                }
                else
                {
                    target = (target + 1)/2;
                    cnt+=2;
                }
            }
            //System.out.println(target + " " + cnt);
        }
        return cnt;
        
    }
}