class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for(int num: nums1){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int num: nums2){
            if(hm.containsKey(num) && hm.get(num) > 0){
                l.add(num);

                hm.put(num, hm.get(num)-1);
            }
        }

        int[] ans  = new int[l.size()];
        int idx = 0;

        for(int x: l){
            ans[idx++] = x;
        }

        return ans;
    }
}