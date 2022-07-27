/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public void flatten(TreeNode root) {
        ArrayList<TreeNode> al = new ArrayList<>();
        
        gen(al,root);
        TreeNode res= new TreeNode(0 , null ,null);
        TreeNode temp =  res;

        for(int i = 0 ; i < al.size() ;i++){
            res.left = null ;
            res.right  = al.get(i);
            res  = res.right;
        }
        // root = temp.right;
    }
    
    void gen(ArrayList<TreeNode>al ,TreeNode root){
        if(root==null) return ;
        al.add(root);
        gen(al,root.left);
        gen(al,root.right);
    }
}