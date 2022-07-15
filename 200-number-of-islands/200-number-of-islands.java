class Solution {
    public int numIslands(char[][] grid) {
        int sum = 0 ;
        for(int i = 0 ;i <grid.length;i++){
            for(int j = 0 ; j<grid[i].length ;j++){
                if(grid[i][j]== '1'  ){
                call(grid,i,j,sum);
                    sum++;
                }
            }
        }
       return  sum;
       
    }
    void call ( char[][]g , int i ,int j , int sum ){
        if(i<0 || i>=g.length || j>=g[0].length || j<0 || g[i][j]=='0' || g[i][j]=='2'){
            return ;
        }
        g[i][j] = '2';
  call(g,i-1 , j , sum);
   call(g,i,j+1,sum);
   call(g,i+1,j,sum);
   call(g,i,j-1,sum);
    
    
   
        return ;
}
}