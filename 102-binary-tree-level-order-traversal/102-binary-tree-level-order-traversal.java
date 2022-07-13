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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>al = new ArrayList<>();
        if(root == null) return al;
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> a =  new ArrayList<>();
            int size = q.size();
            while(size-->0){
              TreeNode curr = q.remove();
                a.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                   
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
              
            }
            al.add(a);
        }
        return al;
        
    }
}