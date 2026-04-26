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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();

        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {
            int queueLength = queue.size();
            if (queueLength == 1) {
                result.add(queue.getFirst().val);
            }
            if (queueLength > 1) {
                result.add(queue.getLast().val);
            }
            for(int i=0; i < queueLength; i++) {
                TreeNode removedNode = queue.removeFirst();
                //Checking child
                if(removedNode.left != null) {
                    queue.add(removedNode.left);
                }
                if(removedNode.right != null) {
                    queue.add(removedNode.right);
                }
            }
        }
        return result;
    }
}
