class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        int col = matrix[0].length-1;
        while(row<matrix.length-1){
            if(matrix[row][col]<target){
                row++;
            }
            else break;
        }
        int c = matrix[0].length-1;
        int l = 0;
        while(l<=c){
            int mid = (l+c)/2;
            if(matrix[row][mid]==target) return true;
            if(matrix[row][mid]>target) c= mid-1;
            else{
                l=mid+1;
            }
        }
        return false;
    }
}