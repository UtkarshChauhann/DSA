class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1), temp = dummy;
        ListNode t = head;

        Set<Integer> s = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
           s.add(nums[i]);
        }

        while(t != null){
            if(!s.contains(t.val)){
                temp.next = t;
                temp = temp.next;
            }
            t = t.next;
        }
        temp.next = null;

        return dummy.next;
    }
}