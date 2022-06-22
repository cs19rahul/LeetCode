class Solution {
    public int findKthLargest(int[] a, int k) {
      PriorityQueue<Integer> p = new PriorityQueue<>();
for(int i = 0 ; i < a.length ;i++){
    p.add(a[i]);
    if(p.size()>k){
        p.remove();
    }
}
        return p.peek();
        
    }
}