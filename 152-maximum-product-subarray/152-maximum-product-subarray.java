class Solution {
    public int maxProduct(int[] nums) {
 /*
         if(nums.length==1) return nums[0];
    
    int curMax=1;
    int curMin=1;
    int result=0;
    
    for(int num : nums){
        if(num==0){
            curMax=1;
            curMin=1;
            continue;
        }
        int temp = curMax*num;
        curMax = Math.max(Math.max(temp,curMin*num),num);
        curMin= Math.min(Math.min(temp,curMin*num),num);
        result= Math.max(result,curMax);
    
    }
    
    return result;
    */
    
    
    
    
    
    int res = Integer.MIN_VALUE;
        int min_curr = 1;
        
        
        for(int i = 0 ; i < nums.length ;i++){
            min_curr *= nums[i];
            res = Math.max(min_curr,res);
            if(min_curr==0){
                min_curr = 1;
            }
        }
        min_curr = 1;
         for(int i = nums.length-1 ; i >=0 ;i--){
            min_curr *= nums[i];
            res = Math.max(min_curr,res);
            if(min_curr==0){
                min_curr = 1;
            }
        }
        return res;
    }
}