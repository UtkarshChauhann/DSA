class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int j=0, k=0;

        for(int i=2; i<n; i++){
            int a = arr1.get(j);
            int b = arr2.get(k);

            if(a > b){
                arr1.add(nums[i]);
                j++;
            } else{
                arr2.add(nums[i]);
                k++;
            }
        }

        int[] ans = new int[n];
        int idx = 0;

        for(int x: arr1){
            ans[idx++] = x;
        }
        for(int x: arr2){
            ans[idx++] = x;
        }

        return ans;
    }
}