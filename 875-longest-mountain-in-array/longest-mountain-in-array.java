class Solution {
    public int longestMountain(int[] arr) {
        int maxLen = 0;
        int i = 1;

        while(i < arr.length-1){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                int left = i, right = i;

                while(left > 0 && arr[left] > arr[left-1]){
                    left--;
                }
                while(right < arr.length-1 && arr[right] > arr[right+1]){
                    right++;
                }
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);

                i = right;
            } else{
                i++;
            }
        }

        return maxLen;
    }
}