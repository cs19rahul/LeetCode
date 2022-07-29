class Solution {
    public List<String> findAndReplacePattern(String[] words, String s) {
         
        
        
      int[]index = new int[27];
		int k = 0 ;
		for(int  i = 0 ; i < s.length(); i++) {
			if((index[s.charAt(i)-'a']) ==0) {
				index[s.charAt(i)-'a'] = k++;
			} 
		}
		
	HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
			if(!m.containsKey(index[s.charAt(i)-'a'])){
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(i);
				m.put(index[s.charAt(i)-'a'], al);
			}
			else {
				ArrayList<Integer> al = m.get(index[s.charAt(i)-'a']);
				al.add(i);
				m.put(index[s.charAt(i)-'a'], al);
			}
		}
        
        
//      main work
        ArrayList<String> al = new ArrayList<String>();
        for(int  i= 0 ; i < words.length ;i++){
        
           if( map(words[i] ,m)  == true){al.add(words[i]);};}
            
        
        return al;
    }
    
    
    
    
    
//     helping 
 boolean map(String s ,HashMap<Integer,ArrayList<Integer>> k1){
   
     
     int[]index = new int[27];
		int k = 0 ;
		for(int  i = 0 ; i < s.length(); i++) {
			if((index[s.charAt(i)-'a']) ==0) {
				index[s.charAt(i)-'a'] = k++;
			} 
		}
		
	HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
			if(!m.containsKey(index[s.charAt(i)-'a'])){
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(i);
				m.put(index[s.charAt(i)-'a'], al);
			}
			else {
				ArrayList<Integer> al = m.get(index[s.charAt(i)-'a']);
				al.add(i);
				m.put(index[s.charAt(i)-'a'], al);
			}
		}
     if(m.equals(k1)) {
         return true;} 
 else return false;}	 
}
 
