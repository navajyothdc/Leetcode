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
    boolean a = true;
    public boolean isUnivalTree(TreeNode root) {
        traverse(root, root.val);
        return a;
    }
    public void traverse(TreeNode root, int checkVal){
        if(root == null) return;
        if(root.val != checkVal) {a = false;}
        traverse(root.left,checkVal);
        traverse(root.right,checkVal);
    }
}