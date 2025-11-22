class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int cnt = 1, max = 1;

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else cnt = 1;

            max = Math.max(max, cnt);
        }

        return max;
    }
}