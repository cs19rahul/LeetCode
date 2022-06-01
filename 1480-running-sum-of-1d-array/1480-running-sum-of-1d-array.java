class Solution {
    public int[] runningSum(int[] nums) {
        int curr = nums[0];
        for(int i = 1;i < nums.length ;i++){
 nums[i] +=curr; 
            curr = nums[i];   }
     return nums;}
}