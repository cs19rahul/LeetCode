class Solution {
    
    // static int  ans = 0 ;
      int ans = 0;
	 ArrayList<Integer> al = new ArrayList<>();
 int[] counting = new int[27];
    
    
    
    public int minDeletions(String s) {
        char[] st = s.toCharArray();

		Arrays.sort(st);

		
		for (int i = 0; i < st.length; i++) {
			counting[st[i] - 'a']++;
		}
		
        int res = addinarray(al, ans, 0);
        	// System.out.println(res +" al" +al+" 0"+ s.length());
        return res;
        
    
    }
     int addinarray(ArrayList<Integer> al, int ans, int count) {
		for (int i = 0; i < counting.length; i++) {
			count = counting[i];

			if (al.contains(count) && count > 0) {
				while (al.contains(count) && count > 0) {
					count--;
					ans++;
				}

			}

			al.add(count);

		}
		return ans;

	}

}