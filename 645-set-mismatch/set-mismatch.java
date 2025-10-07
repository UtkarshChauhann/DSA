class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];

        for(int ele: nums){
            if(set.contains(ele)) ans[0] = ele;

            set.add(ele);
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)) ans[1] = i;
        }

        return ans;
    }
}