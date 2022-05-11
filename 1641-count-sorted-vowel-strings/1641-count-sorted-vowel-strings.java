class Solution {
    public int countVowelStrings(int n) {
        int[][] a = new  int[n+1][6];
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<6;j++){
                if(i==1)a[i][j] = 1+a[i][j-1];
                else
            a[i][j] = a[i-1][j]+a[i][j-1];
        }
        }
        return a[n][5];
    }
}