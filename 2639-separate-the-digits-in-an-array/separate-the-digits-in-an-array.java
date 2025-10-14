class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int digit = nums[i];
            ArrayList<Integer> temp = new ArrayList<>();
            while(digit != 0){
                temp.add(digit % 10);
                digit /= 10;
            }
            for(int j=temp.size()-1; j>=0; j--){
                arr.add(temp.get(j));
            }
        }

        int[] ans = new int[arr.size()];
        int idx = 0;

        for(int ele: arr){
            ans[idx++] = ele;
        }

        return ans;
    }
}