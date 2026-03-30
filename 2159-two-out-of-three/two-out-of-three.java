class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();

        Set<Integer> h1 = new HashSet<>();
        Set<Integer> h2 = new HashSet<>();
        Set<Integer> h3 = new HashSet<>();
        Set<Integer> h = new HashSet<>();

        for(int i: nums1){
            h1.add(i);
            h.add(i);
        }

        for(int i: nums2){
            h2.add(i);
            h.add(i);
        }
        for(int i: nums3){
            h3.add(i);
            h.add(i);
        }

        for(int i: h){
            if(h1.contains(i) && h2.contains(i) || h2.contains(i) && h3.contains(i) || h1.contains(i) && h3.contains(i)) ans.add(i);
        }
        
        
        return ans;

    }
}