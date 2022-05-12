class Solution {
    public int findTargetSumWays(int[] a, int target) {
        return fun(a.length-1,0,target,a);
    }
    public  int fun(int ind ,int sum ,int target,int[]a) {
		if(ind==-1) {
			if(sum==target) return 1;
			else return 0;
		}
		
		
		
		int take = fun(ind-1,sum+a[ind] ,target,a);
		int n_take =  fun(ind-1,sum-a[ind],target,a);
		return take+n_take;
	}
}