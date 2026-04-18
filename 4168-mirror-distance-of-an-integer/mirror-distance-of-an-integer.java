class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int ans = 0, reverse = 0;

        while(n>=1){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n /= 10;
        }

        ans = Math.abs(num - reverse);

        return ans;
    }
}