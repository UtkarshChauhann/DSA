class Solution {
    private int length(ListNode head){
        ListNode temp = head;
        int cnt = 0;

        while(temp != null){
            temp = temp.next;
            cnt++;
        }

        return cnt;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = length(head);

        int size = n/k;
        int extra = n%k;

        ListNode[] arr = new ListNode[k];
        ListNode temp = head;
        int idx = 0;
        int len = 1;

        while(temp != null){
            int s = size;
            if(len == 1) arr[idx++] = temp;
            if(extra > 0) s++;
            if(len == s){
                ListNode a = temp.next;
                temp.next = null;
                extra--;
                temp = a;
                len = 1;
            }
            else{
                len++;
                temp = temp.next;
            }
        }

        return arr;
    }
}