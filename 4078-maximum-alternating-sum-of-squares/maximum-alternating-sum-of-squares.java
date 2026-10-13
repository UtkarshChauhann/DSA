class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int idx = 0;

        for(int x: nums){
            arr[idx++] = x*x;
        }

        Arrays.sort(arr);

        int i=0, j=n-1;
        long sum = 0;

        while(i < j){
            sum += arr[j];
            sum -= arr[i];
            i++; j--;
        }
        if(i == j) sum += arr[i];

        return sum;
    }
}