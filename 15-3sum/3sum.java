class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        Set<List<Integer>> triplet = new HashSet<>();

        for(int i=0; i<n-1; i++){
            Set<Integer> hash = new HashSet<>();
            for(int j=i+1; j<n; j++){

                int third = -(nums[i] + nums[j]);
                
                if(hash.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    //ans.add(Arrays.asList (nums[i], nums[j], nums[k]));
                    triplet.add(temp);
                }

                hash.add(nums[j]);
                
            }
        }
        List<List<Integer>> ans = new ArrayList<>(triplet);
        return ans;
    }
}