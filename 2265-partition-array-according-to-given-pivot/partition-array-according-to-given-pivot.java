class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> high = new ArrayList<>();

        for(int i: nums){
            if(i < pivot) less.add(i);
            else if(i == pivot) equal.add(i);
            else high.add(i);
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        for(int i=0; i<less.size(); i++){
            ans[idx++] = less.get(i);
        }
        for(int i=0; i<equal.size(); i++){
            ans[idx++] = equal.get(i);
        }
        for(int i=0; i<high.size(); i++){
            ans[idx++] = high.get(i);
        }

        return ans;
    }
}