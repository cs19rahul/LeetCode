class Solution {
    int[][]dp = new int[1001][1001];
   
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[]a :dp){
       Arrays.fill(a,-1);
   }
        
        count(text1,text2,text1.length(),text2.length(),dp);
        return dp[text1.length()][text2.length()];
    }
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
       }
    }
}