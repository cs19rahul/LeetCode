class Solution {
    public int minInsertions(String s) {
        int[][]dp = new int[s.length()+1][s.length()+1];
        int x =  lcs(s, (new StringBuffer(s).reverse()).toString(),dp);
        return s.length()-x;
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