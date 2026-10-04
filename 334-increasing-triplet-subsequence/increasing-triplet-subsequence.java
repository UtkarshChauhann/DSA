class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, scnd = Integer.MAX_VALUE;

        for(int x: nums){
            if(x <= first) first = x;
            else if(x <= scnd) scnd = x;
            else return true;
        }

        return false;
    }
}