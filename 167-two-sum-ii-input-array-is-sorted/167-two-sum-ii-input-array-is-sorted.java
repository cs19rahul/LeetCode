class Solution {
    public int[] twoSum(int[] a, int k) {
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        int[] b = new int[2];
		for(int i = 0;i<a.length;i++) {
			m.put(a[i],i );
		}
		for(int i = 0;i<a.length;i++) {
			if(m.containsKey(k-a[i])) {
                
                int u = m.get(k-a[i])+1;
				// System.out.println(i+1 + " "+ (m.get(k-a[i])+1));
             b[0] = i+1;
                b[1]= u;
                 break;
            }
               
			}
	 return b;	}
   
    }
