class Solution {
    public int search(int[] a, int target) {

        for(int i = 0;i<a.length;i++){
            if(target==a[i]) return i;
        }
        return -1;
        
    }
    
}