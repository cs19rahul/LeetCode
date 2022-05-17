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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        } else {
            TreeNode right = getTargetCopy(original, cloned.right, target);
            if (right == null) {
                return getTargetCopy(original, cloned.left, target);
            } else {
                return right;
            }
        }
    }
    }
