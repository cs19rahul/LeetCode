class Solution {
    public String largestOddNumber(String nums) {
     for(int i = nums.length()-1;i>=0;i--){
         if(nums.charAt(i)=='1' || nums.charAt(i)=='3' ||nums.charAt(i)== '5' ||nums.charAt(i)== '7'||nums.charAt(i)== '9' ) return nums.substring(0,i+1);
     }   
        return "";
    }
}