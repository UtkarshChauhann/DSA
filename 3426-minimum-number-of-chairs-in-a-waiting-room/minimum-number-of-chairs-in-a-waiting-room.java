class Solution {
    public static int minimumChairs(String s) {
        int res = 0, max = 0;
        for (char i : s.toCharArray()) {
            if (i == 'E') {
                res++;
            } else {
                max = Math.max(res, max);
                res--;
            }
        }
        max = Math.max(res, max);
        return max;
    }
}