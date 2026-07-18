class Solution {
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;

        for(int x: nums){
            s = Math.min(s, x);
            l = Math.max(l, x);
        }

        while(l != 0){
            int temp = l;
            l = s % l;
            s = temp;
        }

        return s;
    }
}