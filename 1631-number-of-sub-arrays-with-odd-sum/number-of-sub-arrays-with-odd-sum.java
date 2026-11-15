// copy pasted -> Learn and do it again
class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;

        int even = 1, odd = 0;
        int sum = 0;
        long ans = 0;

        for (int num : arr) {
            sum += num;

            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }

            ans %= mod;
        }

        return (int) ans;
    }
}
