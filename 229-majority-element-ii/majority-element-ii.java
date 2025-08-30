class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        
//brute force

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=i; j<n; j++){
                if(nums[i] == nums[j]) cnt++;
            }
            if(cnt > n/3){
                s.add(nums[i]);
            }
        }

        List<Integer> ans = new ArrayList<>(s); //converting linkedhashset to arraylist
        
        return ans;
    }
}