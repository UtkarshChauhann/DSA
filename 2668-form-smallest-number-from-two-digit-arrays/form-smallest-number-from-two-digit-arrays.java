class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Set<Integer> set = new HashSet<>();

        for(int ele: nums1){
            set.add(ele);
        }

        int common = Integer.MAX_VALUE;

        for(int ele: nums2){
            if(set.contains(ele)) common = Math.min(common, ele);
        }
        if(common != Integer.MAX_VALUE) return common;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            min1 = Math.min(min1, nums1[i]);
        }
        for(int i=0; i<m; i++){
            min2 = Math.min(min2, nums2[i]);
        }
        int ans = 0;

        if(min1 < min2){
            ans = min1*10 + min2;
        }
        else{
            ans = min2*10 + min1;
        }

        return ans;
    }
}