class Solution {
    int[][]dp = new int[1001][1001];
   
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[]a :dp){
       Arrays.fill(a,-1);
            
   }
        int n = text1.length();
        int m = text2.length();
        for(int i = 0 ;i <=n;i++){
            dp[i][0] = 0;
            
        }
        for(int j= 0 ;j<=m;j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) {
           dp[i][j]= (1+dp[i-1][j-1]);
                               
        }else
                dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j] );
                
            }
        }
    
       return dp[n][m];
    } 
    /*
    int count( String s1,String s2,int n,int m,int[][]dp){
       
         if(n==0|| m==0){
      
            return 0;
            
        } 
        if(dp[n][m]!=-1) return dp[n][m];
        else{
        if(s1.charAt(n-1)==s2.charAt(m-1)) {
            return dp[n][m]= (1+count(s1,s2,n-1,m-1,dp));
            
            
        }
       
            return dp[n][m]= Math.max(count(s1,s2,n,m-1,dp), count(s1,s2,n-1,m,dp) );
       }*/
    
    
}