class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
      boolean flag = false;
        int m = a.length;
        int n = a[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(a[0][0]==1) return 0;
                else
                if(flag==false){
                    if(a[i][j]==0){
                        dp[i][j]=1;
                        flag = true;
                    }
                    else {
                        dp[i][j]=0;
                    }
                }
                else{
                    int lhs = 0,rhs = 0;
                    if(i>0 && a[i][j]!=1){
                        lhs = dp[i-1][j];
                    }
                    if(j>0 && a[i][j]!=1 ){
                        rhs = dp[i][j-1];
                    }
                dp[i][j] = lhs+rhs;
                }
                
            }
        }
            for(int i = 0 ;i<m;i++){
                for(int j = 0; j<n;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
        
        return dp[m-1][n-1];
    }
}