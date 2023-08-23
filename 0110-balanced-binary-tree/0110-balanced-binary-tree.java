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
    public boolean isBalanced(TreeNode root) {
        boolean[] check = new boolean[1];
        check[0] = true;
        balanced(root, check);
        return check[0];
    }

    public int balanced(TreeNode root, boolean[] check){
        if(root == null){
            return 0;
        }
        int lh = balanced(root.left, check);
        int rh = balanced(root.right, check);
        if(lh > rh){
            if(lh > rh+1){ check[0] = false;}
         return lh +1;
        } else{
            if(rh > lh+1){ check[0] = false;}
         return rh +1;
        }

    }
}