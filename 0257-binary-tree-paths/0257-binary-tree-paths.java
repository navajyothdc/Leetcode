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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        TreeNode mainRoot = root;
        binaryTreePathsMain(root, mainRoot, result, "");
        return result;
    }
    public void binaryTreePathsMain(TreeNode root, TreeNode mainRoot, List<String> result, String s) {
        if(root == null) return;
        if(root.left == null && root.right == null){
             s = (root == mainRoot)? Integer.toString(root.val) : s + "->" + root.val;
            result.add(s);
            if(result.contains(s)){
                return;
            } else{
                binaryTreePathsMain(mainRoot, mainRoot, result, s);
            }
        }
        s = (root == mainRoot)? Integer.toString(root.val) : s + "->" + root.val;
        binaryTreePathsMain(root.left, mainRoot, result, s);
        binaryTreePathsMain(root.right, mainRoot, result, s);
    }
}