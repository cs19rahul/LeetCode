class Solution {
    public int minMaxGame(int[] nums) {
    
       
        
        while(nums.length>1){
            int[]ans = new int[nums.length/2];
        for(int i = 0 ; i<nums.length/2;i++){
                if(i%2==0)ans[i] = Math.min(nums[i*2],nums[(i*2)+1]); 
                else ans[i] = Math.max(nums[i*2],nums[(i*2)+1]);
                }
        nums =ans;
        }
        return nums[0];
    }
    
}