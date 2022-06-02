class StockSpanner {
static class pair{
    int ind;
    int val;
    pair(int val,int ind){
        this.val  = val;
        this.ind = ind;
    }
}Stack<pair> st;
   int      index=-1;

    public StockSpanner() {
        st = new Stack<>();
       st.push(new pair(Integer.MAX_VALUE,-1));
    }
    
    public int next(int price) {
        index++;
        
         pair cur=new pair(price,index);
        while(st.peek().val<=price){
            st.pop();
        }
        int ans=cur.ind-st.peek().ind;
        st.push(cur);
        return ans;

    }
    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */