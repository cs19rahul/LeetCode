// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code hereint[][]
        int[][]dp = new int[str.length()+1][str.length()+1];
       return lcs(str,str ,dp);
    }
     int lcs(String a ,String b ,int[][]dp){
	    for(int i = 0 ;i <=a.length();i++){
	        for(int j = 0 ; j < b.length();j++){
	            if(i==0 || j==0) dp[i][j] =0;
	        }
	    }
	    for(int i = 1 ; i <=a.length();i++){
	        for(int j = 1 ; j<=b.length();j++){
	            if(a.charAt(i-1)==b.charAt(j-1) && i!=j) dp[i][j] = 1+dp[i-1][j-1];
	            else{
	                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[a.length()][b.length()];
	}
}