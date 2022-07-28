class Solution {
    public void rotate(int[][] matrix) {
        //         Transpose 
    for(int i = 0 ;i<matrix[0].length-1;i++){
        for(int j =i+1;j<matrix.length;j++){
           int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i] = temp;
        }
    }
       
            // Swap col
       int l= 0;
        int r= matrix.length-1;
        while(l<=r){
            for(int i=0;i<matrix.length;i++){
                int temp = matrix[i][l];
                matrix[i][l]= matrix[i][r];
                matrix[i][r] = temp;
                
            }
            r--;
           l++;
        }
    
        
    }
}