class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         int ans = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));   
       
       for(int[] temp : boxTypes){
           if(truckSize>temp[0]){
               truckSize = truckSize-temp[0];
                ans+= temp[1]*temp[0];
               
           }
           else if(truckSize>0){
               ans  += truckSize*temp[1];
               break;
           }
           else break;
       }
        return ans;
    }
}