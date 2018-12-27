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

    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }

    private TreeNode convert(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, left, mid-1);
        node.right = convert(nums, mid+1, right);
        return node;
    }
}