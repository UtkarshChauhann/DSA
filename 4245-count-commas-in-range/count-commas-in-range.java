class Solution {
    public int countCommas(int n) {
        int ans = 0, commas = 0;
        int start = 1; //1; 1,000; 1,000,000

        while(start<=n){
            int end = start*1000-1; //999; 999,999

            int actualEnd = Math.min(end, n);

            int count = actualEnd - start + 1;

            ans += count*commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}