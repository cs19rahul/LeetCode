/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         solve using path -root to node
    ArrayList<TreeNode> a = new ArrayList<>();
        ArrayList<TreeNode> b = new ArrayList<>();
        path(root,p,a);
        path(root,q,b);
      int  size = Math.min(a.size(),b.size());
        TreeNode res = null;
        for(int i =0;i<size;i++){
            if(a.get(i).val==b.get(i).val && a!=null) {
                res = a.get(i);
            }
        }
        return res;
        
        
    }
    boolean path(TreeNode root,TreeNode p,ArrayList<TreeNode>a){
        if(root == null) return false;
        
            a.add(root);
                if(root.val==p.val){
                    return true;
                }
            if(path(root.left,p,a)||path(root.right,p,a)) return true;
        a.remove(a.size()-1);
        return false;
    }
}