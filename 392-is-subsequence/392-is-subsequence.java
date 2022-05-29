class Solution {
    public boolean isSubsequence(String s, String t) {
        int[][]dp = new int[s.length()+1][t.length()+1];
        return (lcs(s,t,dp)==s.length());
    }
     int lcs(String a ,String b ,int[][]dp){
	    for(int i = 0 ;i <=a.length();i++){
	        for(int j = 0 ; j < b.length();j++){
	            if(i==0 || j==0) dp[i][j] =0;
	        }
	    }
	    for(int i = 1 ; i <=a.length();i++){
	        for(int j = 1 ; j<=b.length();j++){
	            if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
	            else{
	                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[a.length()][b.length()];
	}
}