class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int x: nums1){
            s1.add(x);
        }

        for(int x: nums2){
            if(s1.contains(x)) result.add(x);
        }

        int[] ans = new int[result.size()];
        int idx = 0;

        for(int x: result){
            ans[idx++] = x;
        }

        return ans;
    }
}