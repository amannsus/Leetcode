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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
        
    }
    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);

     int currpath = left + right + root.val;
     int singlepath = Math.max(left, right) + root.val;
     int nodepath = root.val;
     
     maxsum = Math.max(maxsum, Math.max(currpath, Math.max(singlepath, nodepath)));

     return Math.max(singlepath, nodepath);
    }
}