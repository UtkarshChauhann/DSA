class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();

        for(int x: nums){
            s.add(x);
        }

        int i = k;

        while(s.contains(i)){
            i += k;
        }

        return i;
    }
}