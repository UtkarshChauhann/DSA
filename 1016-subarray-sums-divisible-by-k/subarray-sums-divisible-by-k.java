class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;

            int rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            count += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}