class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: nums2){
            while(!st.isEmpty() && num > st.peek()){
                hm.put(st.pop(), num);
            }
            st.add(num);
        }

        int idx = 0;

        for(int num: nums1){
            arr[idx++] = hm.getOrDefault(num, -1);
        }

        return arr;
    }
}