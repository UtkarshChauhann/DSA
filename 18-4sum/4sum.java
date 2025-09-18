class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>> quad = new HashSet<>();

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                Set<Long> hash = new HashSet<>();

                for(int k=j+1; k<n; k++){
                    long sum = (long)nums[i]+nums[j]+nums[k];
                    long fourth = target - sum;

                    if(hash.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);

                        Collections.sort(temp);
                        quad.add(temp);
                    }

                    hash.add((long)nums[k]);
                }
            }
        } 

        ans.addAll(quad);
        return ans;
    }
}