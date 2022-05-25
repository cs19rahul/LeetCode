import java.util.*;
class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp= new int[coins.length][amount+1];
        for(int[]a:dp)
        Arrays.fill(a,-1);
     
        return count(coins,coins.length-1,amount,dp);
    }
/*    // MEMORIZATION
    
    int count(int[]a ,int index,int target,int[][]dp){
        //BASE CONDN
        if(index==0){
            if(target%a[index]==0) return 1;
            else return 0;
        }
        
//         NOT TAKE
        if(dp[index][target]!=-1) return dp[index][target]; 
        int n_take = count(a,index-1,target,dp);
        
//             TAKE
        
        int take =0;
//         TAKE IF ELEMNT IS SMALLER
        if(a[index]<=target){
           take =  count(a,index,target-a[index],dp);
        }
        
        return dp[index][target]= n_take+take;
        
        
    }
    */
    
    // DYNAMIC APPROACH
    
     int count(int[]a ,int index,int target,int[][]dp){
//          base case
         for(int i = 0 ;i<a.length;i++){
             for(int t = 0 ;t<=target ;t++){
                 if(t%a[i]==0) dp[i][t]=1;
                 else dp[i][t]=0;
             }
         }
            for(int i = 1 ; i < a.length ; i++ ){
                    for(int t = 0 ; t<=target ; t++){
                        int n_take  =  dp[i-1][t];
                        int take = 0 ;
                        if(a[i]<=t){
                            take = dp[i][t-a[i]];
                        }
                        
                        dp[i][t]= take+n_take;
                    }
            }
         
         return dp[a.length-1][target];
     }
}