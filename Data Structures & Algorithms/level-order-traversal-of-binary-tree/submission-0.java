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
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {

            List<Integer> levelList = new ArrayList<>();
            int levelLength = queue.size();
            for(int i=0; i < levelLength; i++) {
                // Action on current level
                TreeNode removedNode = queue.removeFirst();
                levelList.add(removedNode.val);
                
                // Check child for next level and add to queue
                if(removedNode.left != null) {
                    queue.add(removedNode.left);
                }
                if(removedNode.right != null) {
                    queue.add(removedNode.right);
                }
            }
            result.add(levelList);
        }
        return result;
    }
}
