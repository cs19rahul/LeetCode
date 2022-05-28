// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String str, int n)
    {   int[][]dp = new int[str.length()+1][str.length()+1];
            StringBuffer str2 = new StringBuffer(str);
            str2 =  str2.reverse();
            String st = str2.toString();
        return str.length()-lcs(str,st,dp);
    }
    /*int count(String str , int s , int e){
        
        if(s==e ) return 0;
        
        if(str.charAt(s)==str.charAt(e)) {
            return  0+count(str,s+1,e-1);
            
        }
        
        else{
            int left = 1+count(str,s+1,e);
            int right  = 1 + count(str,s,e-1);
            return Math.min(left,right);
        }
    }*/
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