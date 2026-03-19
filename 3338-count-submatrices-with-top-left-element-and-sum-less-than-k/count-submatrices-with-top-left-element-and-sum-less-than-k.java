class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int cnt = 0;
        //prefix sum
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j > 0) grid[i][j] += grid[i][j-1];

                if(i > 0) grid[i][j] += grid[i-1][j];

                if(i>0 && j>0) grid[i][j] -= grid[i-1][j-1]; //sub overlapping diagonal

                if(grid[i][j] <= k) cnt++;
            }
        }

        return cnt++;
    }
}