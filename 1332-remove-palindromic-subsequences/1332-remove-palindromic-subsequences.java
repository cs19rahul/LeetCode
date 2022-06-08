class Solution {
    public int removePalindromeSub(String s) {
        StringBuffer s2 = new StringBuffer(s);
        s2 = s2.reverse();
        int[][]dp = new int[s.length()+1][s2.length()+1];
       int ans=  lcs(s,s2.toString(),s.length(),s2.length(),dp);
    
    if(ans==s.length()) return 1;
        else return 2;
    
    }
     int lcs(String s ,String r ,int n ,int m,int[][]dp){
        for(int i = 0 ;i <= s.length();i++){
            for(int j = 0 ; j<=r.length();j++){
                if(i==0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
    
    for(int i = 1 ;i <=s.length();i++){
        for(int j = 1 ;j<=r.length();j++){
            if(s.charAt(i-1)==r.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
            else{
           dp[i][j]=     Math.max(dp[i-1][j],dp[i][j-1]);
                
            }
        }
    }
    return dp[n][m];
}
}