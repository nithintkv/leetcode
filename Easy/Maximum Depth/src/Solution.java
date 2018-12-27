/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
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
        if (root.right != null)
            right = 1 + maxDepth(root.right);
        return Math.max(left, right);
    }
}