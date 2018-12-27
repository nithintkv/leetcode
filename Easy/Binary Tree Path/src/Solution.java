import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null)
            return paths;
        Stack<TreeNode> nodes = new Stack<>();
        Stack<String> currentPath = new Stack<>();
        nodes.push(root);
        currentPath.push(Integer.toString(root.val));
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            String path = currentPath.pop();
            if (node.left == null && node.right == null) {
                paths.add(path.toString());
            } else {
                if (node.left != null) {
                    nodes.push(node.left);
                    currentPath.push(path + "->"+Integer.toString(node.left.val));
                }
                if (node.right != null) {
                    nodes.push(node.right);
                    currentPath.push(path + "->"+Integer.toString(node.right.val));
                }
            }
        }
        return paths;
    }
}