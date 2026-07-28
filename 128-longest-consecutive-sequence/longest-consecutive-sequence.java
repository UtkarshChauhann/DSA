class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        // Stores all numbers for O(1) lookup
        Map<Integer, Boolean> present = new HashMap<>();

        // Keeps track of numbers that have already been processed
        Map<Integer, Boolean> checked = new HashMap<>();

        // Add every number into the map
        for (int i = 0; i < n; i++) {
            present.put(nums[i], true);
        }

        int ans = 0; 

        for (int val : nums) {

            // Start counting only if:
            // 1. This number hasn't been processed before
            // 2. It is the first number of a sequence (val-1 doesn't exist)
            if (!checked.containsKey(val) && !present.containsKey(val - 1)) {

                int cnt = 0;      // Length of current sequence
                int start = val;  // Current number in the sequence

                // Count consecutive numbers
                while (present.containsKey(start)) {
                    checked.put(start, true); // Mark as processed
                    cnt++;
                    start++; // Move to the next consecutive number
                }

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}