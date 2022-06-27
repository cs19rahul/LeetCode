class Solution {
    public int minPartitions(String n) {
        int ans  = Integer.MIN_VALUE;
        for(int i = 0 ; i < n.length();i++){
            ans  =  Math.max(n.charAt(i)-'0',ans);
        }
        return ans;
    }
}