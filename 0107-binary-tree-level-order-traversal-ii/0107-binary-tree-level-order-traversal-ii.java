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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> result = new Stack<>();
        List<List<Integer>> finalResult = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode tempNode = q.remove();
                ans.add(tempNode.val);
                if(tempNode.left != null){
                    q.add(tempNode.left);
                }
                if(tempNode.right != null){
                    q.add(tempNode.right);
                }
            }
            result.push(ans);
        }
        while(!result.empty()){
            finalResult.add(result.pop());
        }
        return finalResult;
    }
}