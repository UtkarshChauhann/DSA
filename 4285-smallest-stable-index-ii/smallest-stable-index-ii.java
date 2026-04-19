class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suffixMin = new int[n];

        // build suffix min
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        int maxSoFar = nums[0];

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if (maxSoFar - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}