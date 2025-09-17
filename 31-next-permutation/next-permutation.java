class Solution {
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void reverse(int[] nums, int s, int e){
        while(s < e){
            swap(nums, s, e);
            s++; e--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1; // To store the index of the first smaller element from right

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // Find the element just greater than nums[ind] from the end
        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot+1, n-1); // Reverse the right half after pivot to get the next smallest permutation

    }
}