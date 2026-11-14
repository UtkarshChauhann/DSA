
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;

            for (int j = i; j < nums.size() && j - i + 1 <= r; j++) {
                sum += nums.get(j);

                int len = j - i + 1;

                if (len >= l && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
