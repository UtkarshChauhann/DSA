class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for(int num: nums2){
            while(!st.isEmpty() && num > st.peek()){
                hm.put(st.pop(), num);
            }
            st.add(num);
        }

        int[] ans = new int[nums1.length];
        int idx = 0;

        for(int num: nums1){
            ans[idx++] = hm.getOrDefault(num, -1);
        }

        return ans;
    }
}