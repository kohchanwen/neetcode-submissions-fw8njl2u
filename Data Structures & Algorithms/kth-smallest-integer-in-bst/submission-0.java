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
    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[2]; // [0] = counter, [1] = targetValue
        traverse(root, k, result);
        return result[1];
    }

    private void traverse(TreeNode root, int k, int[] state) {
        if(root == null) return;
        traverse(root.left, k, state);
        state[0]++;
        if (state[0] == k) {
            state[1] = root.val;
            return;
        }
        traverse(root.right, k, state);
      
    }
}
