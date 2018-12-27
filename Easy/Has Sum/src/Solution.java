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

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (sum-root.val == 0 && root.right == null && root.left == null) return true;
        else if (sum-root.val < 0) return false;
        boolean leftSum, rightSum;
            leftSum = hasPathSum(root.left, sum-root.val);
        if (!leftSum)
            rightSum = hasPathSum(root.right, sum-root.val);
        else return true;
        return rightSum;
    }
}