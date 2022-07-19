class Solution {
    public List<List<Integer>> generate(int n) {
        	
		
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> curr ,pre = null;
	for(int i = 0;i<n;i++) {
		curr = new ArrayList<>();
		for(int j = 0;j<=i;j++) {
			if(j==0||j==i) {
				curr.add(1);
			}
			else
			curr.add(pre.get(j-1)+pre.get(j));
		}
		pre = curr;
		res.add(curr);
	}
	System.out.println(res);
	return res;
    }
}