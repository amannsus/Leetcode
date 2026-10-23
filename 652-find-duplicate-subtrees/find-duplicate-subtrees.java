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
    HashMap<String, Integer>map = new HashMap<>();
    List<TreeNode>ans = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        subtree(root);
        return ans;
    }
    public String subtree(TreeNode root){
        if(root == null){
            return "#";
        }
        String left = subtree(root.left);
        String right = subtree(root.right);
        String innertree = root.val + "," + left + "," + right;
        int count = map.getOrDefault(innertree, 0) + 1;
        map.put(innertree, count);

        if(count == 2){
            ans.add(root);
        }
        return innertree;
    }
}