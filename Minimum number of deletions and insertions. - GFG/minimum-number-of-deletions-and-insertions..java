// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int[][]a = new int[str1.length()+1][str2.length()+1];
	    int x = lcs(str1,str2,a);
	    int insertion  =  str2.length()-x;
	    int del =  str1.length()-x;
	    int res = del+insertion;
	    return res;
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