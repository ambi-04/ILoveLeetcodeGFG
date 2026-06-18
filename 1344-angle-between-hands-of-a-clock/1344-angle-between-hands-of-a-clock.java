class Solution {
    public double angleClock(int hour, int minutes) 
    {
        double hour_angle = (hour * 30 + minutes * 0.5)% 360;
        double minute_angle = (6 * minutes);
        double diff = Math.abs(hour_angle - minute_angle);
        double diff2 = 360 - diff;
        if(diff2 < diff)
            return diff2;
        else 
            return diff;
        
    }
}