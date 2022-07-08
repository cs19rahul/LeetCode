class Solution {
    public int rob(int[] a) {
        int[]dp = new int[a.length+1];
        int inc = 0 ;
        int exc =  0;
        for(int i = 0 ; i <a.length ;i++){
            
//            include
            if(i>=2){
                inc  = a[i]+dp[i-2];
                
            }
            else inc = a[i];
            
            
//             exclude
            if(i>=1)
            exc = dp[i-1];
            else exc = 0 ;
            
            dp[i] = Math.max(exc,inc);
            
            
        }
        
        return dp[a.length-1];
    }
}