class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][]dp = new int[coins.length][amount+1];
         int ans = count(coins,amount,coins.length-1,dp);
        if(ans == (int)1e9) return -1;
        else return ans;
        
        
    }
    int count(int[]coins,int target,int index,int[][]dp){
        if(index==0){
            if(target%coins[index]==0) return target/coins[index];
            else return (int)1e9;
        }
        
        int not_take = 0+count(coins,target,index-1,dp);
        int take  = Integer.MAX_VALUE;
        if(dp[index][target]!=0) return dp[index][target];
        else {
    if(coins[index]<=target)
         take = 1+count(coins,target-coins[index],index,dp); 
        }
        // System.out.println(take+" U "+ " "+not_take);
        
        return dp[index][target]=Math.min(take,not_take);
    }
    
    
}