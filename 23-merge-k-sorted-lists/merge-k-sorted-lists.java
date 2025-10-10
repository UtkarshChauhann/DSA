class Solution {
    public ListNode sort(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else if(l1.val > l2.val){
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 == null) temp.next = l2;
        if(l2 == null) temp.next = l1;

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        dummy.next = null;

        int n = lists.length;

        for(int i=0; i<n; i++){
            dummy.next = sort(dummy.next, lists[i]);
        }

        return dummy.next;
    }
}