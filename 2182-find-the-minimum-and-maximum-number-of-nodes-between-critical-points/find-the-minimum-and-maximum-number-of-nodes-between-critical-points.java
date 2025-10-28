class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1, -1};

        ListNode left = head, mid = head.next, right = mid.next;
        int first = -1, last = -1, cnt = 0;
        int idx = 1;
        int dist = 0;
        int min_dist = Integer.MAX_VALUE;

        while(right != null){
            if(left.val < mid.val && mid.val > right.val || left.val > mid.val && mid.val < right.val){
                if(first == -1) first = idx;
                if(last != -1){
                    dist = idx - last;
                    min_dist = Math.min(min_dist, dist);
                }
                
                cnt++;
                last = idx;
            }
            
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }

        int maxDist = last - first;

        if(cnt >= 2){
            arr[0] = min_dist;
            arr[1] = maxDist;
        }

        return arr;
    }
}