class NumMatrix {

    int[][] ps = new int[201][201];
	
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            ps[i][0] = matrix[i][0];
            for (int j = 1; j < n; j++) {
                ps[i][j] = ps[i][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for (int i = row1; i <= row2; i++) {
            int[] mat = ps[i];  
            ans += mat[col2]; 
            ans -= col1 == 0 ? 0 : mat[col1 - 1];  
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */