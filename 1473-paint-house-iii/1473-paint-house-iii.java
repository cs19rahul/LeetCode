class Solution {
    
         Integer[][][] dp;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new Integer[m][n+1][target+1];
        int res =  paint(0, houses, cost, 0, 0, target);
        return  res==Integer.MAX_VALUE?-1:res;
    }
    
    public int paint(int i, int[] houses, int[][] cost, int prevColor, int count, int target){
        if(count>target)return Integer.MAX_VALUE;
        if(i==houses.length){
            return count<target?Integer.MAX_VALUE:0;
        }
        if(dp[i][prevColor][count]!=null) return dp[i][prevColor][count];
        int min  = Integer.MAX_VALUE;
        if(houses[i]==0){
           for(int j=0;j<cost[i].length;j++){
               int localmin = Integer.MAX_VALUE;
               if(j+1==prevColor){
                   localmin = paint(i+1, houses, cost, prevColor, count, target);
               }else{
                   localmin = paint(i+1, houses, cost, j+1, count+1, target);
               }
               if(localmin!=Integer.MAX_VALUE)localmin += cost[i][j];
               min = Math.min(min, localmin);
           } 
        }
        else{
          if(houses[i]==prevColor){
              min = paint(i+1, houses, cost, prevColor, count, target);
          }else{
              min = paint(i+1, houses, cost, houses[i], count+1, target);
          }
        }
        return dp[i][prevColor][count] = min;
    }
    }
