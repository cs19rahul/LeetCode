class Solution {
   public int maxAreaOfIsland(int[][] g) {
    int r=g.length,c=g[0].length,m=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            m=Math.max(m,task(g,i,j,r,c));
        }
    }
    return m;
}
static int task(int g[][] , int i , int j , int r , int c)
{
    if(i<0||j<0||i==r||j==c||g[i][j]==0||g[i][j]==2)
        return 0;
    g[i][j]=2;
    int m=1+task(g,i,j-1,r,c);
    m+=task(g,i,j+1,r,c);
    m+=task(g,i-1,j,r,c);
    m+=task(g,i+1,j,r,c);
    return m;
}
}