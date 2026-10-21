class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int x : nums) {
            s.add(x);
        }

        int ans = 0;

        for (int x : s) {

            // Start only from the end of a sequence
            if (x == Integer.MAX_VALUE || !s.contains(x + 1)) {
                int num = x;
                int cnt = 0;

                while (s.contains(num)) {
                    cnt++;

                    // Prevent integer overflow
                    if (num == Integer.MIN_VALUE) break;

                    num--;
                }

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}