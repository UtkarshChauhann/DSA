class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        
        for(int i=0; i<n; i++){
            int cnt = 0;
            Set<Integer> set = new HashSet<>();

            for(int j=i; j<n; j++){
                if(!set.contains(nums.get(j))) cnt++;
                
                ans += cnt*cnt;

                set.add(nums.get(j));
            }
        }

        return ans;
    }
}