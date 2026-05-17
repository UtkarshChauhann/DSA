class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int diff = Math.abs((int)arr[i] - (int)arr[i+1]);

            if(diff > 2) return false;
        }

        return true;
    }
}