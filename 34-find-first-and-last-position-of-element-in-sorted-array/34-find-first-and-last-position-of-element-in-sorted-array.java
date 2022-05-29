class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int curr = bs(nums,target,0,nums.length-1);
        // System.out.println("kk");
        int left = -1;
        int right  = -1;
        if(curr!=-1){
            right=left = curr;
        while(left>=0&& nums[left]==target){
            
            left--;
        }
        while(right<=nums.length-1&& nums[right]==target){
            right++;
        }
        }
        else { a[0]=-1;
        a[1]= -1;
             return a;}
         
        a[0]=left+1;
        a[1]= right-1;
return a;
        
    }
    public int bs(int nums[],int target,int l,int h){
        while(l<=h){
           int mid = (l+h)/2;
            if(nums[mid]== target) return mid;
            if(nums[mid]>target){h = mid-1; bs(nums,target,l,mid-1);}
            else{l = mid+1; bs(nums,target,mid+1,h);}
            
        }
        return -1;
    }
}