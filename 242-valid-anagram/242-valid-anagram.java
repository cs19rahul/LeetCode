class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = new HashMap<Character, Integer>();
		Map<Character, Integer> s2 = new HashMap<Character, Integer>();
		
		
		
		for(int i=0;i<s.length();i++) {
			if(s1.containsKey(s.charAt(i))){
			s1.put(s.charAt(i),s1.get(s.charAt(i))+1 );
			}
			else s1.put(s.charAt(i),1);
		}
		for(int i=0;i<t.length();i++) {
			if(s2.containsKey(t.charAt(i))){
			s2.put(t.charAt(i),s2.get(t.charAt(i))+1 );
			}
			else s2.put(t.charAt(i),1);
		}
        return(s1.equals(s2));
    }
}