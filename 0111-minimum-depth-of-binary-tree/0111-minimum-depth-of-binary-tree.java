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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return depth(root);
    }
    private int depth(TreeNode root){
        if (root == null)
            return (int)1e9;
        if (root.left == null && root.right == null)
            return 1;
        
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return 1 + Math.min(leftDepth, rightDepth);
    }
}