/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = 1, right = 1;
        if (root.left != null)
            left = 1 + maxDepth(root.left);
        if (left == -1) return -1;
        if (root.right != null)
            right = 1 + maxDepth(root.right);
        if (right == -1) return -1;

        return (Math.abs(left - right) > 1) ? -1 : 1;
    }

    public boolean isBalanced(TreeNode root) {
        return maxDepth (root) != -1;
    }
}