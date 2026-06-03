class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) 
    {
        //land--> water
        int result1 = Integer.MAX_VALUE;
        int minEndTime = Integer.MAX_VALUE;
        int n1 = landStartTime.length;
        int n2 = waterStartTime.length;
        for(int i = 0; i < n1; i++)
        {
            minEndTime = Math.min(minEndTime,landStartTime[i] +  landDuration[i]);
        }
        for(int i = 0; i < n2; i++)
        {
            if(waterStartTime[i] <= minEndTime)
                result1 = Math.min(result1,minEndTime + waterDuration[i]);
            else
                result1 = Math.min(result1,waterStartTime[i] + waterDuration[i]);
        }

        //water --> land
        int result2 = Integer.MAX_VALUE;
        minEndTime = Integer.MAX_VALUE;
        for(int i = 0; i < n2; i++)
        {
            minEndTime = Math.min(minEndTime, waterStartTime[i] + waterDuration[i]);
        }
        for(int i = 0; i < n1; i++)
        {
            if(landStartTime[i] <= minEndTime)
                result2 = Math.min(result2,minEndTime + landDuration[i]);
            else
                result2 = Math.min(result2,landStartTime[i] + landDuration[i]);
        }
        //System.out.println(result1 + " " + result2);
        return Math.min(result1,result2);


        
    }
}