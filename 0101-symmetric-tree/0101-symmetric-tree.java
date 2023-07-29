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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left,root.right);
    }
    public boolean symmetric(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else if(root1 == null && root2 != null) return false;
        else if(root1 != null && root2 == null) return false;
        boolean t1 = root1.val==root2.val?true:false;
        boolean t2 = symmetric(root1.left, root2.right);
        boolean t3 = symmetric(root1.right, root2.left);
        return t1 & t2 & t3;
    }
}