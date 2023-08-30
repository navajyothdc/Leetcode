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
   static int ans;
    public int findTilt(TreeNode root) {
        ans=0;
        task(root);
        return ans;
    }

    static int task(TreeNode root){
        if(root == null) return 0;

        int leftSum = task(root.left);

        int rightSum = task(root.right);

        ans += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}