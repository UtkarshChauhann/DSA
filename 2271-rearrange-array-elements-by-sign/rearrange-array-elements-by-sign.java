class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int posIndx = 0;
        int negIndx = 1;

        for(int i = 0; i < n; i++){
           if(arr[i] > 0){
            ans[posIndx] = arr[i];
            posIndx +=2;
           }
           else {
            ans[negIndx] = arr[i];
            negIndx +=2;
           }
        }
        
        return ans;
    }
}