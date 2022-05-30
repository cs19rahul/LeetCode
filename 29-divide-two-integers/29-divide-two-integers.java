class Solution {
    public int divide(int dividend, int divisor) {
        long g=((long)dividend/(long)divisor);

if(g>2147483647)
{
return 2147483647;
}
else if(g<-2147483648)
{
return -2147483648;
}
else
{
return (int)g;
}
    }
}