class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        // List<List<integer>> op = new HashSet<>();
       
        ArrayList<Integer> res=new ArrayList<>();
        
        int visited[]=new int[nums.length];
        find(nums,res,ans,visited);
        return new ArrayList<>(ans);
    }
     public void find(int[] nums,ArrayList<Integer> res,Set<List<Integer>> ans,int visited[]){
        
       
        if(res.size()==nums.length){
            ans.add(new LinkedList(res));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
           
            if(visited[i]==1)continue;
            
           
            visited[i]=1;
            res.add(nums[i]);
            find(nums,res,ans,visited);
            
           
            res.remove(res.size()-1);
            visited[i]=0;
        }
        
    }
    
    
}