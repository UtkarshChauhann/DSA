class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k == 1) return r - l + 1;
        int cnt = 0;

        for(int i=0; i<=r/2; i++){
            long y = (int)Math.pow(i, k);

            if(y > r) break;
            if(y >= l && y <= r) cnt++;
        }

        return cnt;
    }
}