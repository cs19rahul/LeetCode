class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int a[] = new int[n+1];
        a[0]= cost[0];
        a[1]= cost[1];
        for(int i = 2;i<n+1;i++){
            if(i!=n){
                a[i]= cost[i]+Math.min(a[i-1],a[i-2]);
                }
            else{
                a[i]= Math.min(a[i-1],a[i-2]);
            }
        }
        return a[n];
    
    }
}