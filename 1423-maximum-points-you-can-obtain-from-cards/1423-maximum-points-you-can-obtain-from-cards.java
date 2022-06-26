class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0 ;
        int total_sum = 0;
        int window = cardPoints.length-k;
       for(int i = 0 ; i < window ; i++){
          sum =  cardPoints[i]+sum;
       } 
        
        for(int i : cardPoints){
            total_sum +=i; 
        }
        
        int min  = sum;
        for(int i =  window ; i < cardPoints.length;i++){
            sum-= cardPoints[i-window];
            sum+=cardPoints[i];
            min = Math.min(min,sum);
        }
        // System.out.println(min+" "+"min");
        return total_sum-min;
    }
}