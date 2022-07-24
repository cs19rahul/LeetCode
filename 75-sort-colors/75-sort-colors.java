class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = nums.length-1;
        int curr = 0;
        while(curr<=two){
            if(nums[curr]==0){
                int temp = nums[curr];
                nums[curr]=nums[one];
                nums[one]=temp;
                one++;
                curr++;
            }
            else if(nums[curr]==1) curr++;
            else{
                
                 int temp = nums[curr];
                nums[curr]=nums[two];
                nums[two]=temp;
                two--;
            }
        }
      
       
    }
}