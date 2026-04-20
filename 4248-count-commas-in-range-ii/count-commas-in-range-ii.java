class Solution {
    public long countCommas(long n) {
        long start = 1, ans = 0;
        long commas = 0;
        
        while(start <= n){
            long end = Math.min(n, start*1000 - 1);

            long totalDigits = end - start + 1;

            ans += totalDigits*commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}