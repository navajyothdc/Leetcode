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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List <List<Integer>> result = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            for(int i= 0; i<size; i++){
                TreeNode tempNode = q.remove();
                ans.add(tempNode.val);
                if(tempNode.left != null){
                    q.add(tempNode.left);
                }
                if(tempNode.right != null){
                    q.add(tempNode.right);
                }
            }
            result.add(ans);
        }
        return result;
    }
}