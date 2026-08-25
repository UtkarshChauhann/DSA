class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> s = new HashSet<>();

        for(int x: nums){
            s.add(x);
        }

        for(int i=1; i<200; i++){
            int a = k*i;

            if(!s.contains(a)) return a;
        }

        return 1;
    }
}