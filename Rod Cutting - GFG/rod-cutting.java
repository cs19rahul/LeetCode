// { Driver Code Starts


import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    
    public int cutRod(int a[], int n) {
        //code here
        int[][]dp = new int[n+1][n+1];
        return solve(a,n,n,dp);
    }
    int solve(int[]a,int ind,int n,int[][]dp){
        if(ind==0){
            return n*a[0];
        }
        if(dp[ind][n]!=0) return dp[ind][n];
         
        int not = solve(a,ind-1,n,dp);
        int take = Integer.MIN_VALUE;
        int rod = ind+1;
        if(rod<=n) take = a[ind]+solve(a,ind,n-rod,dp);
        
        return dp[ind][n]= Math.max(take,not);
    }
}