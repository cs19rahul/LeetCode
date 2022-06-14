class Solution {
        int[][] dp = new int[1001][1001];
    public int minDistance(String word1, String word2) {
        int ans =  count(word1,word2);
            
           
            return word1.length()+word2.length()-2*ans;
        }
    

   int count(String text1, String text2) {
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
}