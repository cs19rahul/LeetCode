// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String text1, String text2, int n, int m){
        // code hereint n = text1.length();
        int dp[][] = new int[n+1][m+1];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        int ans = 0;
       
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
                               ans = Math.max(ans,dp[i][j]);
        }else
                dp[i][j]= 0;
                
            }
        }
    
       return ans;
    }
}