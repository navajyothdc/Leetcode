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
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, Integer.MIN_VALUE);
    }
    public int findGoodNodes(TreeNode root, int maxVal) {
       if(root==null) return 0;
        //find the result
        int res = root.val>=maxVal ? 1 : 0;

        //call recursion for left and right subtree
        res += findGoodNodes(root.left, Math.max(root.val, maxVal));
        res += findGoodNodes(root.right, Math.max(root.val, maxVal));

        return res;
    }
}