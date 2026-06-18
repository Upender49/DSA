// 1344. Angle Between Hands of a Clock


class Solution {
    public double angleClock(int hour, int minutes) {
        double val = (11*minutes)/2;
        if((11*minutes)%2 !=0 )
            val += 0.5;
        double ans = Math.abs(30* hour - val);
        return Math.min(ans,360-ans);
    }
}