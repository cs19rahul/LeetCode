class Solution {
    public boolean isHappy(int n) {
       HashMap<Integer ,Boolean> m = new HashMap<Integer,Boolean>();
        while(n>1 && (!m.containsKey(n))){
            int ans = 0 ; m.put(n,true);
            String a =  Integer.toString(n);
            
                for(int i = 0 ; i < a.length(); i++){
                ans+= Math.pow((a.charAt(i)-'0'),2); 
                                                     }
           
         n =ans;
            
        }
        
    return( n==1); 
    
    }
}