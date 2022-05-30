class Solution {
    public int findPeakElement(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[st.peek()]) {st.pop();st.push(i);}
        }
        return st.peek();
    }
}