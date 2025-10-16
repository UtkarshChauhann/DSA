class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int n = nums.length;
        Set<Integer> st = new HashSet<>();

        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }

        int longest = 1;

        for(int it: st){
            if(!st.contains(it-1)){
                int cnt = 1;
                int x = it;

                while(st.contains(x + 1)){
                    x += 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}