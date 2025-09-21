class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Maximum bananas in a pile = upper bound of k
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEat(piles, h, mid)) {
                result = mid;   // possible answer
                right = mid - 1; // try smaller k
            } else {
                left = mid + 1;  // need larger k
            }
        }

        return result;
    }

    private boolean canEat(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            // ceil(pile / k) → (pile + k - 1) / k
            hours += (pile + k - 1) / k;
        }

        return hours <= h;
    }
}

// class Solution {
//     private int hours(int[] nums, int mid){
//         int n = nums.length;
//         int ans = 0;

//         for(int i=0; i<n; i++){
//             ans += Math.ceil((double)nums[i] / (double)mid);
//         }

//         return ans;
//     }
//     public int minEatingSpeed(int[] nums, int h) {
//         int n = nums.length;
//         int mx = Integer.MIN_VALUE;
        
//         for(int i=0; i<n; i++){
//             mx = Math.max(nums[i], mx);
//         }

//         int low = 1, high = mx;

//         while(low <= high){
//             int mid = low + (high-low);

//             int x = hours(nums, mid);

//             if(x <= h) high = mid-1;
//             else low = mid+1;
//         }
//         return low;

//     }
// }