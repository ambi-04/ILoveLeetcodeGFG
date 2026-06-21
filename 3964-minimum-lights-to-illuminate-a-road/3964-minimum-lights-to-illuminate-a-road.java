class Solution {
    public int minLights(int[] lights) 
    {
        int n = lights.length;
        int[] illuminated_pos = new int[n];
        int cnt = 0;
        for(int i =  0; i < n; i++)
        {
            if(cnt != 0 || lights[i] != 0)
                illuminated_pos[i] = 1;
            if(cnt != 0)
                cnt--;
            if(cnt < lights[i])
                cnt += (lights[i] - cnt);   
        }
        for(int i =  n - 1; i >= 0; i--)
        {
            if(cnt != 0 || lights[i] != 0)
                illuminated_pos[i] = 1;
            if(cnt != 0)
                cnt--;
            if(cnt < lights[i])
                cnt += (lights[i] - cnt);

            
        }
        cnt = 0;
        int i = 0;
        while(i < n)
        {
            //System.out.println(i);
            if(illuminated_pos[i] == 0)
            {
                if(i + 1 < n )
                    i = i + 2;
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}