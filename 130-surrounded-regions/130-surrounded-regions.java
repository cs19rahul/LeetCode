class Solution {
    public void solve(char[][] board) {
       
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j< board[0].length ;j++){
                if((i==0 || i == board.length-1 ||j==0||j==board[0].length-1) && board[i][j]=='O' ){
                    call(board,i,j);
                }
            }
        }
        
        
        
        
//         update
        for(int i = 0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < board[0].length ;j++){
                
                if(board[i][j]=='O') board[i][j] = 'X' ;
                else if (board[i][j]=='2') board[i][j] = 'O';
            }
        }
    }
    
    
    
    
    
        void call(char[][]g ,int i  ,int j){
            if(i<0 || i>g.length-1 || j>g[0].length-1 || j<0 || g[i][j]=='X' || g[i][j]=='2'){
            return ;}
        
            if(g[i][j]=='O')
        g[i][j] = '2';
            
            
  call(g,i-1 ,j );
   call(g,i,j+1);
   call(g,i+1,j);
   call(g,i,j-1);
    return ;
        }
    
}
