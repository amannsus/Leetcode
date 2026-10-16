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
        List<String> ans = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        findpath(root, ans, path);
       
       return ans;
        
        }
      public  void findpath(TreeNode root, List<String>ans, List<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.val);
        
        if(root.left==null && root.right==null){
             String s = "";
           for(int i =0; i<path.size(); i++){
             s = s+ path.get(i);
             if(i< path.size()-1){
                s = s+ "->";
             }
           }
           ans.add(s);
        }

        
        findpath(root.left, ans, path);
        findpath(root.right, ans, path);
        path.remove(path.size()-1);

    
      }
    }
