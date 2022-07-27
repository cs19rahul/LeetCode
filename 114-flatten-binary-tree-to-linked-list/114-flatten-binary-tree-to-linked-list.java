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
      
        if(root == null)return;
        if(root.left == null && root.right==null) return;
        ArrayList<Integer> al = new ArrayList<>();
        
        gen(al,root);
        TreeNode temp = root;
        
        for(int i = 1 ; i < al.size() ;i++){
            temp.left = null ;
            temp.right  = new TreeNode(al.get(i),null,null);
            temp  = temp.right;
        }
    }
    void gen(ArrayList<Integer>al ,TreeNode root){
        if(root==null) return ;
        al.add(root.val);
        gen(al,root.left);
        gen(al,root.right);
    }
}