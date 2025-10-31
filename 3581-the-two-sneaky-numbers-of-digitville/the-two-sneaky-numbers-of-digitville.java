class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int[] ans = new int[2];
        int idx = 0;

        for(int num: nums){
            if(s.contains(num)){
                ans[idx++] = num;
            }
            s.add(num);
        }

        return ans;
    }
}