class Solution {
    public int maxProfit(int[] price) {
     //  int ans=0;
     //        if(prices.length==0)
     //        {
     //            return ans;
     //        }
     //        int bought=prices[0];                                
     //        for(int i=1;i<prices.length;i++)
     //        {
     //            if(prices[i]>bought)
     //            {
     //                if(ans<(prices[i]-bought))
     //                {
     //                    ans=prices[i]-bought;
     //                }
     //            }
     //            else
     //            {
     //                bought=prices[i];
     //            }
     //        }
     // return ans;
        int buy = Integer.MAX_VALUE;
        int sell  = 0;
        for(int i = 0;i<price.length;i++){
            buy = Math.min(buy,price[i]);
            sell = Math.max(sell,price[i]-buy);
        }
        return sell;
    }
}