class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int n = nums.length;
        Set<Integer> st = new HashSet<>();

        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }

        int longest = 0;

        for(int val: st){
            if(!st.contains(val-1)){
                int cnt = 0;
                int x = val;

                while(st.contains(x)){
                    x++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}