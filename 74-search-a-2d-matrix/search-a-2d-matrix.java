class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow * totalCol;

        int l = 0, r = n-1;

        while(l <= r){
            int mid = l + (r-l)/2;

            int row = mid / totalCol;
            int col = mid % totalCol;

            if(matrix[row][col] == target) return true;

            else if(matrix[row][col] < target) l = mid+1;

            else r = mid-1;
        }

        return false;
    }
}