class Solution {
    private boolean dfs(int i, int j, String word, int k, char[][] board){
        if(k == word.length()) return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(k)) return false;
        
        char temp = board[i][j];
        board[i][j] = ' ';

        boolean ans = dfs(i+1, j, word, k+1, board) || dfs(i-1, j, word, k+1, board) || 
                        dfs(i, j+1, word, k+1, board) || dfs(i, j-1, word, k+1, board);

        board[i][j] = temp;

        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0) && dfs(i, j, word, 0, board)) return true;
            }
        }

        return false;
    }
}