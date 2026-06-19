class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans = 0;

        int[] alt = new int[n+1];
        int idx = 1, i = 0;

        for(int x: gain){
            alt[idx] = alt[idx-1] + x;

            ans = Math.max(ans, alt[idx]);

            idx++;
        }

        return ans;
    }
}