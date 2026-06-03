class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) 
    {
        int cnt1 = 0;
        int cnt2 = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n1 = landStartTime.length;
        int n2 = waterStartTime.length;
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                cnt1 = landStartTime[i] + landDuration[i];
                cnt2 = waterStartTime[j] + waterDuration[j];

                if(waterStartTime[j] <= cnt1)
                    cnt1 = cnt1 + waterDuration[j];
                else
                    cnt1 = waterStartTime[j] + waterDuration[j];
                if(landStartTime[i] <= cnt2)
                    cnt2 = cnt2 + landDuration[i];
                else
                    cnt2 = landStartTime[i] + landDuration[i];
                min1 = Math.min(min1,cnt1);
                min2 = Math.min(min2,cnt2);

            }

        }
        return Math.min(min1,min2);

        
    }
}