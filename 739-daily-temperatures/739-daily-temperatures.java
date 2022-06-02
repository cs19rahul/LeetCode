class Solution {
    public int[] dailyTemperatures(int[] temp) {
     int[]ans  = new int[temp.length];   
        ans[ans.length-1]=0;
        Stack<Integer> st  = new Stack<>();
        st.push(temp.length-1);
        for(int j = temp.length-2;j>=0;j--){
            while( (!st.isEmpty()) && temp[st.peek()]<=temp[j]   ){
                st.pop();
            }
            if(st.isEmpty()==true){
                ans[j]=0;
            }
            else {
                ans[j] = st.peek()-j;
            }
            st.push(j);
        }
        return ans;
    }
}