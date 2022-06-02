class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][]a = new int[matrix[0].length][matrix.length];
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ;j<a[i].length;j++ ){
                a[i][j]= matrix[j][i];
                
            }
        }
        return a;
    }
}