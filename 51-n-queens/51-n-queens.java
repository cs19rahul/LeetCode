class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] c: board)Arrays.fill(c,'.');
        solve(board,0);
        return ans;
    }
    public void solve(char[][] board,int r){
        if(r==board.length){
            List<String> temp = new ArrayList<>();
            for(char[] c: board){
                temp.add(String.valueOf(c));
            }
            ans.add(temp);
            return;
        }
        
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c] = 'Q';
                solve(board,r+1);
                board[r][c] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board,int r,int c){
        //  top
        for(int i=0;i<r;i++){
            if(board[i][c]=='Q')
                return false;
        }
        // left diagnol
        int row = r-1,col = c-1;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')
                return false;
            row--;
            col--;
        }
        // right diagnol
        row = r-1;
        col = c+1;
        while(row>=0 && col<board.length){
            if(board[row][col]=='Q')
                return false;
            row--;
            col++;
        }
        
        return true;
    }
}