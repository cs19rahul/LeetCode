class Solution {
    public int trap(int[] height) {
        int maxl  =0; 
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        for(int i = 0;i<height.length;i++){
           maxl = Math.max(height[i],maxl);;
               left[i] = maxl;
        }
        maxl =0;
         for(int i =height.length-1;i>=0;i--){
          maxl= Math.max(height[i],maxl);
             right[i] = maxl;
        }
        int res = 0;
        for(int i =  height.length-1;i>=0;i--){
            int x = Math.min(right[i],left[i])-height[i];
            res = res +x;
        }
    return res;
    }
}