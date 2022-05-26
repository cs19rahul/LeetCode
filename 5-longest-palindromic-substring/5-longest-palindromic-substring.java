class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        for(boolean[] i:dp){
            Arrays.fill(i,false);
        }
        form(dp,s);
        
        boolean flag = false;
        int k=0 ,l=s.length()-1;
        for(int g = dp.length-1;g>=0;g--){
            for(int i=0,j=g;j<dp.length && flag==false;j++,i++){
                if(dp[i][j]==true){
                    k = i;
                    l = j ;
                  
                    flag = true;
                    break;
                }
            }
            
        }
        l = l+1;
        
        return s.substring(k,l);
    }
   void  form(boolean[][]dp , String s){
        for(int g = 0 ; g <s.length() ; g++){
             for(int i =0 , j=g ; j<s.length() ; j++ , i++) {
                 if(g==0) dp[i][j]= true;
                 else if(g==1) {
                     if(s.charAt(i)==s.charAt(j)) dp[i][j]= true;
                     else dp[i][j]= false;
                     
                 }
                 else{
                     if(s.charAt(i)==s.charAt(j) &&  dp[i+1][j-1]==true){
                         dp[i][j]= true;
                         
                     }
                     else  dp[i][j] = false;
                 }
             }
        }
    }
}