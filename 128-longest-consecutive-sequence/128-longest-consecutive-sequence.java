class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Arrays.sort(nums);int pre =  0 ;
        for(int i: nums)
        System.out.print(i+" ");
        int ans = 1 ;int res = 1 ;
for(int i = 1 ; i < nums.length ;i++){
    if(nums[i]!=nums[i-1]){
        if(nums[i]==nums[i-1]+1) res++;
        else {ans  = Math.max(ans,res);
             res = 1;}
    }
}
        return Math.max(ans,res);
        }
    
    
}