class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;

        double minDeg = 6*minutes;
        double hrDeg = 30*hour + 0.5*minutes;

        double diff = Math.abs(minDeg - hrDeg);

        double ans = Math.min(diff, 360-diff);

        return ans;
    }
}