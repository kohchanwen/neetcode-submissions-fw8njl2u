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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        int tempSum = targetSum; 
        tempSum -= root.val;

        if(root.left == null && root.right == null) {
            if(tempSum == 0) {
                return true;
            } else {
                return false;
            }
        }
        if(hasPathSum(root.left, tempSum)) {
            return true;
        }
        if(hasPathSum(root.right, tempSum)) {
            return true;
        }

        tempSum = targetSum;
        return false;
    }

}