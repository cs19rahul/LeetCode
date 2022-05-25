import java.util.*;
class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp= new int[coins.length][amount+1];
        for(int[]a:dp)
        Arrays.fill(a,-1);
     
        return count(coins,coins.length-1,amount,dp);
    }
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
}