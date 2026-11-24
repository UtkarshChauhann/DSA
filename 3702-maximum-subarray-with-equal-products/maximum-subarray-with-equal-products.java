class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;
            long GCD = nums[i];
            long LCM = 1;

            for (int j = i; j < n; j++) {

                // Update product
                product *= nums[j];

                // Update GCD
                GCD = gcd(GCD, nums[j]);

                // Update LCM
                LCM = (LCM / gcd(LCM, nums[j])) * nums[j];

                // Prevent overflow and unnecessary iterations
                if (product > 25200) {
                    break;
                }

                // Check whether subarray is valid
                if (product == GCD * LCM) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}