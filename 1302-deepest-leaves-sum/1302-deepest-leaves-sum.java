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
    public int deepestLeavesSum(TreeNode root) {
  
if(root.left==null && root.right==null){
return root.val;
}
int height=height(root);

    return sum(root,height,0);
}

public int sum(TreeNode root,int height,int sum){
   
    int left=0;
    int right=0;
    if(root.left!=null)
     left=sum(root.left, height,sum+1);
   
    if(root.right!=null)
     right=sum(root.right,height,sum+1);
    else{
        if(root.right ==null && root.left==null && sum==height)
            right=root.val;
    }
   
    return left+right;
}
public int height (TreeNode root){
  
    int left=0;
    int right=0;
    if(root.left!= null)
    left= 1+height(root.left);
    if(root.right!=null)
    right= 1+height(root.right);
    
    return  Math.max(left,right);
    
}
}