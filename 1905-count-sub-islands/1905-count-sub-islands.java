class Solution {
    boolean flag = true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int sum = 0 ;
        
        for(int i = 0 ; i < grid2.length ; i++){
            for(int j = 0 ; j < grid2[0].length ;j++){
                flag = true;
                if(grid2[i][j]==1 && grid1[i][j]==1) {
                    floodfill(grid1,grid2, i , j);
                    if(flag== true)  sum++;
                }
               }
        }
        
        
        
        return sum;
    }
    
    
    
   void floodfill(int a[][],int[][] b  ,int i ,int j ){
        if(i<0 || j< 0 || i>=a.length || j>= a[0].length || b[i][j]!=1)
         return ;
     if(b[i][j]==1 && a[i][j]==0) {flag= false; return ;}
       
              b[i][j] = 2;
  floodfill(a,b,i-1 , j);
   floodfill(a,b,i,j+1);
   floodfill(a,b,i+1,j);
   floodfill(a,b,i,j-1);
      
        
    }
    
    
}