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
    static class info{
        boolean isBST;
        int sum;
        int max;
        int min;

    public info(boolean isBST, int sum, int max, int min){
        this.isBST = isBST;
        this.sum = sum;
        this.max = max;
        this.min = min;
    }
    }
       int maxsum = 0;
    public  info largestBST(TreeNode root){
        if(root == null){
            return new info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        info leftinfo = largestBST(root.left);
        info rightinfo = largestBST(root.right);
        int sum = leftinfo.sum+ rightinfo.sum + root.val;
        int min = Math.min(root.val, Math.min(leftinfo.min, rightinfo.min));
        int max = Math.max(root.val, Math.max(leftinfo.max, rightinfo.max));

        if(root.val<=leftinfo.max || root.val>= rightinfo.min || !leftinfo.isBST || !rightinfo.isBST ){
            return new info(false, 0, max, min);
        }

         maxsum = Math.max(maxsum, sum);
         return new info(true, sum, max, min);
        

    }
    public int maxSumBST(TreeNode root) {
        
        largestBST(root);
        return maxsum;
    }
}