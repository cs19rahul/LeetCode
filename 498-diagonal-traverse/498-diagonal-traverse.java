class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         HashMap<Integer,ArrayList<Integer>> m = new HashMap<>();
       return genMap(m,mat);
    }
    int[] genMap(HashMap<Integer,ArrayList<Integer>> m ,int[][]a){
        int size_ans = 0;
       for(int i = 0 ;i<a.length;i++){
           size_ans+=a[i].length;
           for(int j = 0 ; j<a[i].length ;j++){
               if(!m.containsKey(i+j)){
                   m.put(i+j , new ArrayList<Integer>());
               }
               m.get(i+j).add(a[i][j]);
           }
       } 
        int[]ans = new int[size_ans];
        int k = 0;
        for(int i = 0 ; i < m.size(); i++){
            ArrayList<Integer> l =  m.get(i);
            if(i%2==0)
            for(int j = l.size()-1;j>=0;j--){
                ans[k++] = l.get(j);
            }
            else{
                for(int j = 0;j<l.size();j++){
                ans[k++] = l.get(j);
            }
            }
        }
        return ans;
    }
}