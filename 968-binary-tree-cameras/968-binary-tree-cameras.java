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
  int cam;
    public int minCameraCover(TreeNode root) 
    {
        if(root==null)  
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        cam=0;
        int x=helper(root);
        if(x==-1)
        cam++;
        return cam;
    }
    public int helper(TreeNode root)
    {
        if(root==null)  
            return 0;
        if(root.left==null && root.right==null)
            return -1;
        int x= helper(root.left);
        int y= helper(root.right);
        if(x==-1 || y==-1)
        {
            cam++;
            return 1;
        }
        if(x==1 || y==1)
        return 0;
        else
        return -1;
    }
}